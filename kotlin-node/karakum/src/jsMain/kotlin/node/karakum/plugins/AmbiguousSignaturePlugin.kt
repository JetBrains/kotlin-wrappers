package node.karakum.plugins

import arrow.core.raise.impure
import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.configuration.`object`
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.*
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.DeepMap
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import typescript.*

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
    private var cachedAmbiguousDeclarations: List<FunctionDeclaration>? = null

    private fun getAmbiguousDeclarations(context: Context): List<FunctionDeclaration> {
        cachedAmbiguousDeclarations?.let { return it }

        val typeScriptService = context.requireService(typeScriptServiceKey)
        val typeChecker = typeScriptService.program.getTypeChecker()

        return functionSymbols
            .flatMap { symbol ->
                val declarations = (symbol.declarations ?: emptyArray())
                    .filter { declaration -> isFunctionDeclaration(declaration) }

                val declarationMap = declarations.fold(DeepMap<Any, List<FunctionDeclaration>>()) { acc, declaration ->
                    require(isFunctionDeclaration(declaration))

                    val parameterSymbols = declaration.parameters.asArray()
                        .filter { parameter -> parameter.questionToken == null }
                        .map { parameter ->
                            // TODO: maybe use Either<String, Symbol> here
                            val typeNode = parameter.type

                            when {
                                typeNode == null -> "any"
                                else -> typeChecker.getTypeFromTypeNode(typeNode).symbol.unsafeCast<Symbol?>()
                                    ?: typeScriptService.printNode(typeNode)
                            }
                        }
                        .toTypedArray()

                    acc[parameterSymbols] = (acc[parameterSymbols] ?: emptyList()) + declaration

                    acc
                }

                declarationMap.values()
                    .mapNotNull { ambiguousDeclarations ->
                        nullable {
                            ensure(ambiguousDeclarations.size > 1)

                            val declaration = ambiguousDeclarations.first()

                            val optionalIndex = declaration.parameters.asArray()
                                .indexOfFirst { parameter -> parameter.questionToken != null }
                                .takeIf { it != -1 }
                                .let { ensureNotNull(it) }

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
                                .let { ensure(it) }

                            ambiguousDeclarations
                        }
                    }
                    .map { it.first() }
            }
            .also { cachedAmbiguousDeclarations = it }
    }

    private fun renderAmbiguousDeclaration(
        declaration: FunctionDeclaration,
        externalModifier: String,
        context: Context,
        render: Render<Node>,
    ): Pair<String, String?> {
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

                    "${jsName}${externalModifier}fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${
                        ifPresent(
                            returnType
                        ) { ": $it" }
                    }"
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
                    template = template@{ _, signature ->
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
                            ${externalModifier}suspend fun ${ifPresent(typeParameters) { "<${it}> " }}${originalName}(${parameters})${
                            ifPresent(
                                returnTypePayload
                            ) { ": $it" }
                        }
                        """.trimIndent()
                    }
                )
            )

            return body to suspendBody
        } else {
            return body to null
        }
    }

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isFunctionDeclaration(node))

        val name = ensureNotNull(node.name)

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()
        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(name))

        functionSymbols += symbol
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        ensure(isFunctionDeclaration(node))

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val namespaceInfoService = ensureNotNull(context.lookupService(namespaceInfoServiceKey))

        val namespace = ensureNotNull(typeScriptService.findClosestNamespace(node))
        ensure(namespaceInfoService.resolveNamespaceStrategy(namespace) == NamespaceStrategy.`object`)

        ensure(getAmbiguousDeclarations(context).contains(node))

        val (body, suspendBody) = renderAmbiguousDeclaration(node, "", context, next)

        """
            ${body}${ifPresent(suspendBody) { "\n\n${suspendBody}" }}

            ${next(node)}
        """.trimIndent()
    }

    override fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        val typeScriptService = context.lookupService(typeScriptServiceKey) ?: return emptyArray()
        val namespaceInfoService = context.lookupService(namespaceInfoServiceKey) ?: return emptyArray()

        val declarations = getAmbiguousDeclarations(context)
            .flatMap { declaration ->
                val sourceFileName = declaration.getSourceFileOrNull()?.fileName ?: "generated.d.ts"
                val namespace = typeScriptService.findClosestNamespace(declaration)

                val name = declaration.name?.text ?: "Anonymous"

                if (
                    namespace != null
                    && namespaceInfoService.resolveNamespaceStrategy(namespace) == NamespaceStrategy.`object`
                ) {
                    return@flatMap emptyList()
                }

                buildList {
                    val (body, suspendBody) = renderAmbiguousDeclaration(declaration, "external ", context, render)
                    add(
                        DerivedDeclaration(
                            sourceFileName,
                            namespace,
                            fileName = "${name}.kt",
                            body,
                        )
                    )
                    suspendBody?.let {
                        add(
                            DerivedDeclaration(
                                sourceFileName,
                                namespace,
                                fileName = "${name}.suspend.kt",
                                body = suspendBody,
                            )
                        )
                    }
                }
            }
            .toTypedArray()

        return generateDerivedDeclarations(declarations, context)
    }
}
