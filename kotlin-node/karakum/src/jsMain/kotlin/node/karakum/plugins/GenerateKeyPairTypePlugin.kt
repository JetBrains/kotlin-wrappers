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
import node.karakum.util.impure
import node.karakum.util.nullable
import typescript.*

private fun isGenerateKeyPairType(node: Node) = nullable {
    val literalType = ensureNotNull(node.getParentOrNull())
    ensure(isLiteralTypeNode(literalType))

    val parameter = ensureNotNull(literalType.getParentOrNull())
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

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

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
            ensure(isStringLiteral(node))
            ensure(isGenerateKeyPairType(node))

            "KeyType.${camelize(node.text)}"
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
