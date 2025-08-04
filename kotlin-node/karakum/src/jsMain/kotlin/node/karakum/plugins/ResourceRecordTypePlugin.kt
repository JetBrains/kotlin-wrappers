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
import io.github.sgrishchenko.karakum.util.constIdentifier
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import node.karakum.util.impure
import node.karakum.util.nullable
import typescript.*

private fun isRrtypeParameterType(node: Node) = nullable {
    val literalType = ensureNotNull(node.getParentOrNull())
    ensure(isLiteralTypeNode(literalType))

    val parameter = ensureNotNull(literalType.getParentOrNull())
    ensure(isParameter(parameter))

    val parameterName = parameter.name
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "rrtype")

    nullable {
        val function = ensureNotNull(parameter.getParentOrNull())
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)
        ensure(functionName.text == "resolve")
    } ?: nullable {
        val callSignature = ensureNotNull(parameter.getParentOrNull())
        ensure(isCallSignatureDeclaration(callSignature))
    }
} != null

class ResourceRecordTypePlugin : Plugin {
    private lateinit var sourceFileName: String
    private var namespace: ModuleDeclaration? = null
    private val rrtypes = mutableSetOf<String>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isStringLiteral(node))
        ensure(isRrtypeParameterType(node))

        rrtypes += node.text

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

        val sourceFileName = node.getSourceFileOrNull()?.fileName ?: "generated.d.ts"
        // generate the same entity for promise and callback API
        ensure(!sourceFileName.endsWith("promises.d.ts"))

        this@ResourceRecordTypePlugin.sourceFileName = sourceFileName
        namespace = typeScriptService.findClosestNamespace(node)
    }

    override fun render(node: Node, context: Context, next: Render<Node>, ) = nullable {
        ensure(isStringLiteral(node))
        ensure(isRrtypeParameterType(node))

        "ResourceRecordType.${camelize(node.text)}"
    }

    override fun generate(context: Context, render: Render<Node>, ): ReadonlyArray<GeneratedFile> {
        val name = "ResourceRecordType"

        val entries = rrtypes.map { eventName ->
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
