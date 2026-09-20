package wrappersgenerator.tanstack.react.virtual.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import js.numbers.contains
import typescript.*

// `useVirtualizer(options: PartialKeys<ReactVirtualizerOptions<S, I>, 'scrollToFn' | ...>)`
private class OptionsVariant(
    val name: String,
    val typeParameters: List<TypeParameterDeclaration>,
    val optionalKeys: Set<String>,
    val optionsReference: TypeReferenceNode,
)

class ConvertUseVirtualizerOptions : Plugin {
    private val variants = mutableMapOf<String, OptionsVariant>()

    override suspend fun setup(context: Context) = Unit

    override suspend fun traverse(node: Node, context: Context) = Unit

    override suspend fun render(node: Node, context: Context, next: Render<Node>): String? = nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "PartialKeys")

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())
        ensure(typeArguments.size == 2)

        val optionsReference = typeArguments.first()
        ensure(isTypeReferenceNode(optionsReference))

        val keysArgument = typeArguments.last()
        ensure(isUnionTypeNode(keysArgument))

        val keys = keysArgument.types.asArray().map { keyType ->
            ensure(isLiteralTypeNode(keyType))

            val literal = keyType.literal
            ensure(isStringLiteral(literal))
            literal.text
        }.toSet()

        val function = ensureNotNull(enclosingFunction(node))
        val name = "${ensureNotNull(function.name).text.replaceFirstChar(Char::uppercaseChar)}Options"
        val typeParameters = function.typeParameters?.asArray().orEmpty().toList()

        variants[name] = OptionsVariant(
            name = name,
            typeParameters = typeParameters,
            optionalKeys = keys,
            optionsReference = optionsReference,
        )

        "$name<${typeParameters.map { next(it.name) }.joinToString()}>"
    }

    override suspend fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        if (variants.isEmpty()) return emptyArray()

        val declarations = variants.values.mapNotNull { variant ->
            val members = collectMembers(variant.optionsReference, context)
                ?.filter(::isPropertySignature)
                ?.takeIf { it.isNotEmpty() }
                ?: return@mapNotNull null

            var body = members.map { member ->
                if (
                    isPropertySignature(member) &&
                    member.questionToken == null &&
                    member.name.let { isIdentifier(it) && it.text in variant.optionalKeys }
                ) {
                    "val ${render(member.name)}: ${renderNullable(member.type, true, context, render)}"
                } else {
                    render(member)
                }
            }.joinToString("\n")

            for ((from, to) in typeArgumentSubstitutions(variant.optionsReference, context, render)) {
                body = body.replace(Regex("\\b$from\\b"), to)
            }

            val typeParameters = variant.typeParameters.map { render(it) }.joinToString()

            DerivedDeclaration(
                sourceFileName = variant.optionsReference.getSourceFileOrNull()?.fileName
                    ?: return@mapNotNull null,
                namespace = null,
                fileName = "${variant.name}.kt",
                // language=kotlin
                body = """
                @kotlinx.js.JsPlainObject
                external interface ${variant.name}<$typeParameters> {
                $body
                }
                """.trimIndent(),
            )
        }

        return generateDerivedDeclarations(declarations.toTypedArray(), context)
    }

    // `ReactVirtualizerOptions<S, I> = VirtualizerOptions<S, I> & { ... }`
    private fun collectMembers(reference: TypeReferenceNode, context: Context): List<Node>? {
        val declaration = resolveDeclaration(reference.typeName, context)
            ?: return null

        return when {
            isInterfaceDeclaration(declaration) -> declaration.members.asArray().toList()

            isTypeAliasDeclaration(declaration) -> {
                val type = declaration.type

                when {
                    isTypeLiteralNode(type) -> type.members.asArray().toList()

                    isIntersectionTypeNode(type) ->
                        type.types.asArray().flatMap { part ->
                            when {
                                isTypeLiteralNode(part) -> part.members.asArray().toList()
                                isTypeReferenceNode(part) -> collectMembers(part, context) ?: return null
                                else -> return null
                            }
                        }

                    else -> null
                }
            }

            else -> null
        }
    }
}

val convertUseVirtualizerOptions: Plugin = ConvertUseVirtualizerOptions()

fun resolveDeclaration(typeName: EntityName, context: Context): Node? {
    val typeChecker = context.requireService(typeScriptServiceKey).program.getTypeChecker()

    var symbol = typeChecker.getSymbolAtLocation(typeName)
        ?: return null

    if (SymbolFlags.Alias in symbol.flags) {
        symbol = typeChecker.getAliasedSymbol(symbol)
    }

    return symbol.declarations?.firstOrNull()
}

// `useVirtualizer(options: PartialKeys<...>)`
private fun enclosingFunction(node: Node) = nullable {
    val parameter = ensureNotNull(node.getParentOrNull())
    ensure(isParameter(parameter))

    val function = ensureNotNull(parameter.getParentOrNull())
    ensure(isFunctionDeclaration(function))

    function
}

// `ReactVirtualizerOptions<Window, TItemElement>` -> `TScrollElement` is `web.window.Window`
private suspend fun typeArgumentSubstitutions(
    reference: TypeReferenceNode,
    context: Context,
    render: Render<Node>,
): Map<String, String> {
    val declaration = resolveDeclaration(reference.typeName, context)

    val typeParameters = when {
        declaration == null -> null
        isTypeAliasDeclaration(declaration) -> declaration.typeParameters
        isInterfaceDeclaration(declaration) -> declaration.typeParameters
        else -> null
    }?.asArray().orEmpty()

    val typeArguments = reference.typeArguments?.asArray().orEmpty()

    return typeParameters
        .zip(typeArguments) { typeParameter, typeArgument ->
            typeParameter.name.text to render(typeArgument)
        }
        .filter { (from, to) -> from != to }
        .toMap()
}
