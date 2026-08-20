package tanstack.react.virtual.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import js.numbers.contains
import typescript.*

private class OptionsVariant(
    val declaration: String,
    val reference: String,
    val excludedKeys: Set<String>,
    val substitution: Pair<String, String>?,
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

        val variant = if ("getScrollElement" in keys) {
            OptionsVariant(
                declaration = "UseWindowVirtualizerOptions<TItemElement : web.dom.Element>",
                reference = "UseWindowVirtualizerOptions<TItemElement>",
                excludedKeys = keys,
                substitution = "TScrollElement" to "web.window.Window",
                optionsReference = optionsReference,
            )
        } else {
            OptionsVariant(
                declaration = "UseVirtualizerOptions<TScrollElement : web.events.EventTarget, TItemElement : web.dom.Element>",
                reference = "UseVirtualizerOptions<TScrollElement, TItemElement>",
                excludedKeys = keys,
                substitution = null,
                optionsReference = optionsReference,
            )
        }

        variants[variant.reference] = variant

        variant.reference
    }

    override suspend fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        if (variants.isEmpty()) return emptyArray()

        val typeScriptService = context.lookupService(typeScriptServiceKey) ?: return emptyArray()
        val typeChecker = typeScriptService.program.getTypeChecker()

        val declarations = variants.values.mapNotNull { variant ->
            val members = collectMembers(variant.optionsReference, typeChecker)
                ?.filter { member ->
                    isPropertySignature(member) &&
                            member.name.let { !isIdentifier(it) || it.text !in variant.excludedKeys }
                }
                ?.takeIf { it.isNotEmpty() }
                ?: return@mapNotNull null

            var body = members.map { member -> render(member) }.joinToString("\n")

            variant.substitution?.let { (from, to) ->
                body = body.replace(from, to)
            }

            val name = variant.declaration.substringBefore("<")

            DerivedDeclaration(
                sourceFileName = variant.optionsReference.getSourceFileOrNull()?.fileName
                    ?: return@mapNotNull null,
                namespace = null,
                fileName = "$name.kt",
                body = "@kotlinx.js.JsPlainObject\nexternal interface ${variant.declaration} {\n" +
                        body.prependIndent("    ") +
                        "\n}",
            )
        }

        return generateDerivedDeclarations(declarations.toTypedArray(), context)
    }

    // `ReactVirtualizerOptions<S, I> = VirtualizerOptions<S, I> & { ... }`
    private fun collectMembers(reference: TypeReferenceNode, typeChecker: TypeChecker): List<Node>? {
        val declaration = resolveDeclaration(reference.typeName, typeChecker)
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
                                isTypeReferenceNode(part) -> collectMembers(part, typeChecker) ?: return null
                                else -> return null
                            }
                        }

                    else -> null
                }
            }

            else -> null
        }
    }

    private fun resolveDeclaration(typeName: EntityName, typeChecker: TypeChecker): Node? {
        var symbol = typeChecker.getSymbolAtLocation(typeName)
            ?: return null

        if (SymbolFlags.Alias in symbol.flags) {
            symbol = typeChecker.getAliasedSymbol(symbol)
        }

        return symbol.declarations?.firstOrNull()
    }
}

val convertUseVirtualizerOptions: Plugin = ConvertUseVirtualizerOptions()
