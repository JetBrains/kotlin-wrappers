package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.camelize
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import arrow.core.raise.impure
import arrow.core.raise.nullable
import typescript.*

private val keyGroups = setOf(
    "mlDsa",
    "mlKem",
)

private fun isGenerateKeyPairType(node: Node) = nullable {
    ensureNotNull(
        nullable {
            ensure(
                isLiteralTypeNode(node)
                        && isStringLiteral(node.literal)
            )
        } ?: nullable {
            ensure(isUnionTypeNode(node))
            ensure(node.types.asArray().all {
                isLiteralTypeNode(it)
                        && isStringLiteral(it.literal)
            })
        }
    )

    val parameter = ensureNotNull(node.getParentOrNull())
    ensure(isParameter(parameter))

    val parameterName = parameter.name
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "type")

    val function = ensureNotNull(parameter.getParentOrNull())
    ensure(isFunctionDeclaration(function))

    val functionName = ensureNotNull(function.name)
    ensure(
        functionName.text == "generateKeyPair"
                || functionName.text == "generateKeyPairSync"
    )
} != null

private fun isGenerateKeyPairOptions(node: Node) = nullable {
    val parameter = ensureNotNull(node.getParentOrNull())
    ensure(isParameter(parameter))

    val parameterName = parameter.name
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "options")

    val function = ensureNotNull(parameter.getParentOrNull())
    ensure(isFunctionDeclaration(function))

    val functionName = ensureNotNull(function.name)
    ensure(
        functionName.text == "generateKeyPair"
                || functionName.text == "generateKeyPairSync"
    )
} != null

class GenerateKeyPairTypePlugin : Plugin {
    private val declarations = mutableMapOf<String, DerivedDeclaration>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isTypeReferenceNode(node))
        ensure(isGenerateKeyPairOptions(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))

        val typeArguments = ensureNotNull(node.typeArguments)

        val firstTypeArgument = typeArguments.asArray().first()
        ensure(isLiteralTypeNode(firstTypeArgument))

        val firstTypeArgumentLiteral = firstTypeArgument.literal
        ensure(isStringLiteral(firstTypeArgumentLiteral))

        val secondTypeArgument = typeArguments.asArray()[1]
        ensure(isLiteralTypeNode(secondTypeArgument))

        val secondTypeArgumentLiteral = secondTypeArgument.literal
        ensure(isStringLiteral(secondTypeArgumentLiteral))

        val originalName = typeName.text

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        val sourceFileName = node.getSourceFileOrNull()?.fileName ?: "generated.d.ts"
        val namespace = typeScriptService.findClosestNamespace(node)

        val publicFormat = firstTypeArgumentLiteral.text
        val privateFormat = secondTypeArgumentLiteral.text

        val name = originalName.replace("Options", "${publicFormat.replaceFirstChar { it.titlecase() }}${privateFormat.replaceFirstChar { it.titlecase() }}Options")

        declarations += name to DerivedDeclaration(
            sourceFileName,
            namespace,
            fileName = "${name}.kt",
            body = "external interface $name : ${originalName}<KeyFormat.${publicFormat}, KeyFormat.${privateFormat}>",
        )
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        nullable {
            ensure(isGenerateKeyPairType(node))

            nullable {
                ensure(isLiteralTypeNode(node))

                val literal = node.literal
                ensure(isStringLiteral(literal))

                "KeyType.${camelize(literal.text)}"
            } ?: nullable {
                ensure(isUnionTypeNode(node))

                val keyTypes = node.types.asArray().mapNotNull {
                    nullable {
                        ensure(isLiteralTypeNode(it))

                        val literal = it.literal
                        ensure(isStringLiteral(literal))

                        camelize(literal.text)
                    }
                }

                val keyGroup = keyGroups.first { keyGroup -> keyTypes.all { it.startsWith(keyGroup) } }

                "KeyType.${keyGroup}"
            }
        } ?: nullable {
            ensure(isTypeReferenceNode(node))
            ensure(isGenerateKeyPairOptions(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))

            val typeArguments = ensureNotNull(node.typeArguments)

            val firstTypeArgument = typeArguments.asArray().first()
            ensure(isLiteralTypeNode(firstTypeArgument))

            val firstTypeArgumentLiteral = firstTypeArgument.literal
            ensure(isStringLiteral(firstTypeArgumentLiteral))

            val secondTypeArgument = typeArguments.asArray()[1]
            ensure(isLiteralTypeNode(secondTypeArgument))

            val secondTypeArgumentLiteral = secondTypeArgument.literal
            ensure(isStringLiteral(secondTypeArgumentLiteral))

            val originalName = typeName.text

            val publicFormat = firstTypeArgumentLiteral.text
            val privateFormat = secondTypeArgumentLiteral.text

            originalName.replace("Options", "${publicFormat.replaceFirstChar { it.titlecase() }}${privateFormat.replaceFirstChar { it.titlecase() }}Options")
        }
    }

    override fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        return generateDerivedDeclarations(declarations.values.toTypedArray(), context)
    }

}
