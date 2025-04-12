package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.kebabToCamel

internal const val LENGTH_TYPE = "LengthType"

internal class LengthTypeConsumer : ParentConsumer {
    override fun apply(
        items: List<ConversionResult>,
    ): List<ConversionResult> {
        val lengthItems = items.filter {
            "// Globals | TLength | " in it.body
        }

        val simpleLengthItems = items.filter {
            "// TLength\n" in it.body
        }

        val parentMap = lengthItems.asSequence()
            .flatMap { item ->
                item.body
                    .substringAfter("// Globals | TLength | ")
                    .substringBefore("\n")
                    .splitToSequence(" | ")
                    .filter { !it.startsWith("(") }
                    .map { it.removeSurrounding("\"") }
                    .map { it to item.name }
            }
            .plus("auto" to AUTO_LENGTH)
            .groupBy({ it.first }, { it.second })

        val childTypes = parentMap.asSequence()
            .filter { it.key != "TLength" }
            .filter { it.key != "subgrid" }
            .sortedBy { it.key }
            .map {
                val name = it.key.kebabToCamel()
                    .replaceFirstChar(Char::uppercase)

                """
                    sealed interface $name: 
                        ${it.value.sorted().joinToString(",\n")}
                """.trimIndent()
            }
            .joinToString("\n\n")

        val lengthTypeParents = sequenceOf(
            AUTO_LENGTH,
            GRID_LENGTH,
            LENGTH_PROPERTY,

            GEOMETRY_POSITION,
            SHAPE_RADIUS,
        ).plus(simpleLengthItems.map { it.name })
            .sorted()

        val body = """
            sealed external interface $LENGTH_TYPE:
                ${lengthTypeParents.joinToString(",\n")} {
                
                $childTypes    
            }
        """.trimIndent()

        return items -
                lengthItems +
                lengthItems.map {
                    it.copy(body = "// $LENGTH_PROPERTY\n" + it.body.substringAfter("\n"))
                } -
                simpleLengthItems +
                simpleLengthItems.map {
                    it.copy(body = it.body.replaceFirst("// TLength\n", ""))
                } +
                ConversionResult(LENGTH_TYPE, body)
    }
}
