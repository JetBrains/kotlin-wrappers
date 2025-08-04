package node.karakum.plugins

import node.karakum.util.impure
import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarationWithFixedType
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.DeepMap
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import typescript.FunctionDeclaration
import typescript.Node
import typescript.Symbol
import typescript.SyntaxKind
import typescript.TypeNode
import typescript.asArray
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isLiteralTypeNode
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

private fun isNull(type: Node) = isLiteralTypeNode(type) && type.literal.kind == SyntaxKind.NullKeyword
private fun isUndefined(type: Node) = type.kind == SyntaxKind.UndefinedKeyword

private fun isNullableType(type: Node) = isNull(type) || isUndefined(type)

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text.endsWith("Promise"))
} != null

private fun isPromiseFunction(node: Node) = nullable {
    ensure(isFunctionDeclaration(node))

    val type = ensureNotNull(node.type)
    ensure(isPromiseType(type))
} != null

class AmbiguousSignaturePlugin : Plugin {
    private val functionSymbols = mutableSetOf<Symbol>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isFunctionDeclaration(node))

        val name = ensureNotNull(node.name)

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()
        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(name))

        functionSymbols += symbol
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = null

    override fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        val typeScriptService = context.lookupService<TypeScriptService>(typeScriptServiceKey) ?: return emptyArray()
        val typeChecker = typeScriptService.program.getTypeChecker()

        val declarations = functionSymbols
            .flatMap { symbol ->
                val declarations = (symbol.declarations ?: emptyArray())
                    .filter { declaration -> isFunctionDeclaration(declaration) }

                val declarationMap = declarations.fold(DeepMap<Any, List<FunctionDeclaration>>()) { acc, declaration ->
                    require(isFunctionDeclaration(declaration))

                    val parameterSymbols = declaration.parameters.asArray()
                        .filter { parameter -> parameter.questionToken == null }
                        .mapNotNull { parameter ->
                            nullable {
                                val typeNode = parameter.type

                                ensureNotNull(typeNode)

                                typeChecker.getTypeFromTypeNode(typeNode).symbol.unsafeCast<Symbol?>()
                                    ?: typeScriptService.printNode(typeNode)
                            }
                        }
                        .toTypedArray()

                    acc[parameterSymbols] = (acc[parameterSymbols] ?: emptyList()) + declaration

                    acc
                }

                declarationMap.values()
                    .filter { ambiguousDeclarations ->
                        if (ambiguousDeclarations.size <= 1) return@filter false

                        val declaration = ambiguousDeclarations.first()

                        val optionalIndex = declaration.parameters.asArray()
                            .indexOfFirst { parameter -> parameter.questionToken != null }
                            .takeIf { it != -1 }
                            ?: return@filter false

                        // exclude overloads with optional parameters that have union type,
                        // because this case is handled by `convertParameterDeclarations`
                        ambiguousDeclarations
                            .map { it.parameters.asArray()[optionalIndex] }
                            .all { parameter ->
                                val type = parameter.type

                                if (type == null) return@all true
                                if (!isUnionTypeNode(type)) return@all true

                                val types = type.types.asArray()
                                    .filter { !isNullableType(it) }

                                types.size < 2
                            }
                    }
                    .flatMap { ambiguousDeclarations ->
                        val declaration = ambiguousDeclarations.first()

                        val sourceFileName = declaration.getSourceFileOrNull()?.fileName ?: "generated.d.ts"
                        val namespace = typeScriptService.findClosestNamespace(declaration)

                        val originalName = declaration.name?.text ?: "Anonymous"
                        var name = originalName
                        var jsName = ""

                        if (isPromiseFunction(declaration)) {
                            name = "${name}Async"
                            jsName = "@JsName(\"${originalName}\")\n"
                        }

                        val typeParameters = declaration.typeParameters?.asArray()
                            ?.joinToString(", ") { render(it) }

                        val returnType = declaration.type?.let { render(it) }

                        val coveredSignatures = DeepMap<TypeNode?, Boolean>()

                        val body = convertParameterDeclarations(
                            declaration, context, render,
                            ParameterDeclarationsConfiguration(
                                strategy = ParameterDeclarationStrategy.function,
                                template = template@{ _, signature ->
                                    val types = signature
                                        .filter { it.parameter.questionToken == null }
                                        .map { it.type }
                                        .toTypedArray()

                                    if (types in coveredSignatures) return@template ""
                                    coveredSignatures[types] = true

                                    val parameters = signature
                                        .filter { it.parameter.questionToken == null }
                                        .joinToString(", ") {
                                            convertParameterDeclarationWithFixedType(
                                                it.parameter, context, render,
                                                ParameterDeclarationConfiguration(
                                                    strategy = ParameterDeclarationStrategy.function,
                                                    type = it.type,
                                                    nullable = it.nullable,
                                                )
                                            )
                                        }

                                    "${jsName}external fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it" }}"
                                }
                            )
                        )

                        if (isPromiseFunction(declaration)) {
                            val type = requireNotNull(declaration.type)
                            require(isTypeReferenceNode(type))

                            val typeArguments = requireNotNull(type.typeArguments)

                            val returnTypePayload = render(typeArguments.asArray().first())

                            val coveredSuspendSignatures = DeepMap<TypeNode?, Boolean>()

                            val suspendBody = convertParameterDeclarations(
                                declaration, context, render, ParameterDeclarationsConfiguration(
                                    strategy = ParameterDeclarationStrategy.function,
                                    defaultValue = "undefined",
                                    template =  template@{ _, signature ->
                                        // TODO: it cam be removed after conversion
                                        //  `describe`, `suite` and `it` namespaces as object
                                        if (
                                            originalName == "describe"
                                            || originalName == "suite"
                                            || originalName == "it"
                                        ) {
                                            return@template ""
                                        }

                                        val types = signature
                                            .filter { it.parameter.questionToken == null }
                                            .map { it.type }
                                            .toTypedArray()

                                        if (types in coveredSuspendSignatures) return@template ""
                                        coveredSuspendSignatures[types] = true

                                        val parameters = signature
                                            .filter { it.parameter.questionToken == null }
                                            .joinToString(", ") {
                                                convertParameterDeclarationWithFixedType(
                                                    it.parameter, context, render,
                                                    ParameterDeclarationConfiguration(
                                                        strategy = ParameterDeclarationStrategy.function,
                                                        type = it.type,
                                                        nullable = it.nullable,
                                                    )
                                                )
                                            }

                                        """
                                           @seskar.js.JsAsync
                                           external suspend fun ${ifPresent(typeParameters) { "<${it}> " }}${originalName}(${parameters})${ifPresent(returnTypePayload) { ": $it" }}
                                        """.trimIndent()
                                    }
                                )
                            )

                            listOf(
                                DerivedDeclaration(
                                    sourceFileName,
                                    namespace,
                                    fileName = "${originalName}.kt",
                                    body,
                                ),
                                DerivedDeclaration(
                                    sourceFileName,
                                    namespace,
                                    fileName = "${originalName}.suspend.kt",
                                    body = suspendBody,
                                )
                            )
                        } else {
                            listOf(
                                DerivedDeclaration(
                                    sourceFileName,
                                    namespace,
                                    fileName = "${name}.kt",
                                    body,
                                )
                            )
                        }
                    }
            }
            .toTypedArray()

        return generateDerivedDeclarations(declarations, context)
    }
}
