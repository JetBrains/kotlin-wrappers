package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.util.camelize
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

private val keyGroups = setOf(
    "mlDsa",
    "mlKem",
    "slhDsa",
)

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

        val typeGroups = keyGroups.joinToString("\n") {
            "sealed interface $it : $name"
        }

        val types = keys.joinToString("\n") { key ->
            val group = keyGroups.find { key.startsWith(it) }

            "sealed interface $key : $name${ifPresent(group) { ", $group" }}"
        }

        val companionBody = entries.joinToString("\n") { (key, value) ->
            """
                @seskar.js.JsValue("$value")
                val $key: $key
            """.trimIndent()
        }

        """
            sealed external interface $name {
            $typeGroups
            $types

            companion object {
            $companionBody
            }
            }
        """.trimIndent()
    }
}
