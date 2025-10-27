package node.karakum.plugins

import arrow.core.raise.impure
import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.constIdentifier
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import typescript.*

private fun isSessionPostMethod(node: Node) = nullable {
    val literalType = ensureNotNull(node.getParentOrNull())
    ensure(isLiteralTypeNode(literalType))

    val parameter = ensureNotNull(literalType.getParentOrNull())
    ensure(isParameter(parameter))

    val parameterName = parameter.name
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "method")

    val method = ensureNotNull(parameter.getParentOrNull())
    ensure(isMethodSignature(method))

    val methodName = ensureNotNull(method.name)
    ensure(isIdentifier(methodName))
    ensure(methodName.text == "post")

    val interfaceNode = ensureNotNull(method.getParentOrNull())
    ensure(isInterfaceDeclaration(interfaceNode))
    ensure(interfaceNode.name.text == "Session")
} != null

class InspectorSessionMethodPlugin : Plugin {
    private lateinit var sourceFileName: String
    private var namespace: ModuleDeclaration? = null
    private val methods = mutableSetOf<String>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isStringLiteral(node))
        ensure(isSessionPostMethod(node))

        methods += node.text

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

        sourceFileName = node.getSourceFileOrNull()?.fileName ?: "generated.d.ts"
        namespace = typeScriptService.findClosestNamespace(node)
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        ensure(isStringLiteral(node))
        ensure(isSessionPostMethod(node))

        "SessionMethod.${constIdentifier(node.text)}"
    }

    override fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        val name = "SessionMethod"

        val entries = methods.map { eventName ->
            val key = constIdentifier(eventName)
            key to eventName
        }

        val body = entries.joinToString("\n") { (key) -> "sealed interface $key : $name" }

        val companionBody = entries.joinToString("\n") { (key, value) ->
            """
                @seskar.js.JsValue("$value")
                val ${key}: $key
            """.trimIndent()
        }

        val fileBody = """
            sealed external interface $name {
            $body

            companion object {
            $companionBody
            }
            }
        """.trimIndent()

        val declaration = DerivedDeclaration(
            sourceFileName,
            namespace,
            fileName = "${name}.kt",
            fileBody,
        )

        return generateDerivedDeclarations(arrayOf(declaration), context)
    }

}
