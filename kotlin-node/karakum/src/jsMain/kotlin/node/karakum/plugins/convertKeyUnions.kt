package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.camelize
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

val convertKeyUnions = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("crypto.d.ts"))

        ensure(isTypeAliasDeclaration(node))
        ensure(
            node.name.text == "KeyType"
                    || node.name.text == "KeyFormat"
        )

        val union = node.type
        ensure(isUnionTypeNode(union))

        val name = render(node.name)

        val entries = union.types.asArray()
            .mapNotNull {
                nullable {
                    ensure(isLiteralTypeNode(it))

                    val literal = it.literal
                    ensure(isStringLiteral(literal))

                    val value = literal.text
                    val key = camelize(value)

                    key to value
                }
            }

        val keys = entries.map { (key) -> key }

        val body = keys.joinToString("\n") { "sealed interface $it : $name" }

        val companionBody = entries.joinToString("\n") { (key, value) ->
            """
                @seskar.js.JsValue("$value")
                val $key: $key
            """.trimIndent()
        }

        """
            sealed external interface $name {
            $body

            companion object {
            $companionBody
            }
            }
        """.trimIndent()
    }
}
