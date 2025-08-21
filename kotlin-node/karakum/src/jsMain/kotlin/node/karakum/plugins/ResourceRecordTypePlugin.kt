package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import node.karakum.util.impure
import node.karakum.util.nullable
import typescript.*

private fun extractRrtypes(node: Node) = nullable {
    val parameter = ensureNotNull(node.getParentOrNull())
    ensure(isParameter(parameter))
    ensure(parameter.type === node)

    val parameterName = parameter.name
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "rrtype")

    val resolveSignature = ensureNotNull(parameter.getParentOrNull())
    ensureNotNull(
        nullable {
            ensure(isFunctionDeclaration(resolveSignature))

            val functionName = ensureNotNull(resolveSignature.name)
            ensure(functionName.text == "resolve")
        } ?: nullable {
            ensure(isCallSignatureDeclaration(resolveSignature))
        }
    )

    nullable {
        ensure(isLiteralTypeNode(node))

        val literal = node.literal
        ensure(isStringLiteral(literal))

        listOf(literal.text)
    } ?: nullable {
        ensure(isUnionTypeNode(node))
        ensure(node.types.asArray().all { isLiteralTypeNode(it) })

        node.types.asArray().mapNotNull {
            nullable {
                ensure(isLiteralTypeNode(it))

                val literal = it.literal
                ensure(isStringLiteral(literal))

                literal.text
            }
        }
    }
}

class ResourceRecordTypePlugin : Plugin {
    private lateinit var sourceFileName: String
    private var namespace: ModuleDeclaration? = null
    private val rrtypes = mutableSetOf<String>()
    private val stringRrtypes = mutableSetOf<String>()
    private val promiseApiDeclarations = mutableListOf<DerivedDeclaration>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        val types = ensureNotNull(extractRrtypes(node))

        rrtypes += types
        if (types.size > 1) stringRrtypes += types

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        // generate the same entity for promise and callback API
        ensure(!sourceFileName.endsWith("promises.d.ts"))

        this@ResourceRecordTypePlugin.sourceFileName = sourceFileName
        namespace = typeScriptService.findClosestNamespace(node)
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val types = ensureNotNull(extractRrtypes(node))

        nullable {
            ensure(types.size == 1)

            "ResourceRecordType.${types.first()}"
        } ?: run {
            "ResourceRecordType.StringRecord"
        }
    }

    override fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        val name = "ResourceRecordType"

        val body = rrtypes.joinToString("\n") {
            val marker = if (it in stringRrtypes) "StringRecord" else ""

            "sealed interface $it : $name${ifPresent(marker) { ", $marker"}}"
        }

        val companionBody = rrtypes.joinToString("\n") {
            """
                @seskar.js.JsValue("$it")
                val ${it}: $it
            """.trimIndent()
        }

        val fileBody = """
            sealed external interface $name {

            sealed interface StringRecord

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

        return generateDerivedDeclarations(promiseApiDeclarations.toTypedArray() + declaration, context)
    }

}
