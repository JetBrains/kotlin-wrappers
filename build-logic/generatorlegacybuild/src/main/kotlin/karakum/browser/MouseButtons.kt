package karakum.browser

import karakum.common.CommonUnionConverter.unionBodyByConstants
import karakum.common.UnionConstant

internal const val MOUSE_BUTTON = "MouseButton"
internal const val MOUSE_BUTTONS = "MouseButtons"

private data class ButtonConstant(
    val name: String,
    val value: Int,
    val description: String,
)

internal fun mouseButtonTypes(): Sequence<ConversionResult> {
    return sequenceOf(
        mouseButtonType(
            type = MOUSE_BUTTON,
            contentPath = "MouseEvent/button",
        ),
        mouseButtonType(
            type = MOUSE_BUTTONS,
            parentType = "Bitmask<$MOUSE_BUTTONS>",
            contentPath = "MouseEvent/buttons",
        ),
    )
}

private fun mouseButtonType(
    type: String,
    parentType: String? = null,
    contentPath: String,
): ConversionResult {
    val constants = getApiDirectory(contentPath)!!
        .resolve("index.md")
        .readText()
        .substringAfter("## Value\n", "")
        .substringBefore("\n#", "")
        .splitToSequence("\n- ")
        .drop(1)
        .map { it.substringBefore("\n") }
        .map { line ->
            val value = line
                .substringBefore(": ")
                // TODO: fix in MDN
                .trim()
                .removeSurrounding("`")

            val description = line
                .substringAfter(": ")
                .replace("_", "\"")

            val name = when {
                description.startsWith("No button") -> "NONE"
                description.startsWith("4th button") -> "FOURTH"
                description.startsWith("5th button") -> "FIFTH"
                else -> description.substringBefore(" ").uppercase()
            }

            val comment = """
            /**
             * $description
             *
             * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$contentPath#value)
             */
            """.trimIndent()

            UnionConstant(
                name = name,
                value = value,
                originalValue = true,
                comment = comment,
            )
        }
        .toList()

    var body = unionBodyByConstants(
        name = type,
        constants = constants,
    )

    body = """
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$contentPath)
     */
    """.trimIndent()
        .plus("\n")
        .plus(body)

    if (parentType != null) {
        body = body.replaceFirst(type, "$type:\n$parentType")
    }

    return ConversionResult(
        name = type,
        body = body,
        pkg = "web.mouse",
    )
}
