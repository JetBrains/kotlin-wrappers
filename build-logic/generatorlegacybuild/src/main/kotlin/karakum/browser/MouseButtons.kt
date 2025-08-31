package karakum.browser

import karakum.common.CommonUnionConverter.unionBodyByConstants
import karakum.common.UnionConstant

internal const val MOUSE_BUTTON = "MouseButton"
internal const val MOUSE_BUTTONS = "MouseButtons"

private val MOUSE_BUTTON_CONSTANTS = listOf(
    ButtonConstant(
        name = "MAIN",
        value = 0,
        description = "Main button pressed, usually the left button or the un-initialized state"
    ),
    ButtonConstant(
        name = "AUXILIARY",
        value = 1,
        description = "Auxiliary button pressed, usually the wheel button or the middle button (if present)"
    ),
    ButtonConstant(name = "SECONDARY", value = 2, description = "Secondary button pressed, usually the right button"),
    ButtonConstant(name = "FOURTH", value = 3, description = "Fourth button, typically the Browser Back button"),
    ButtonConstant(name = "FIFTH", value = 4, description = "Fifth button, typically the Browser Forward button"),
)

private val MOUSE_BUTTONS_CONSTANTS = listOf(
    ButtonConstant(name = "NONE", value = 0, description = "No button or un-initialized"),
    ButtonConstant(name = "PRIMARY", value = 1, description = "Primary button (usually the left button)"),
    ButtonConstant(name = "SECONDARY", value = 2, description = "Secondary button (usually the right button)"),
    ButtonConstant(
        name = "AUXILIARY",
        value = 4,
        description = "Auxiliary button (usually the mouse wheel button or middle button)"
    ),
    ButtonConstant(name = "FOURTH", value = 8, description = """4th button (typically the "Browser Back" button)"""),
    ButtonConstant(name = "FIFTH", value = 16, description = """5th button (typically the "Browser Forward" button)"""),
)

private data class ButtonConstant(
    val name: String,
    val value: Int,
    val description: String,
)

internal fun mouseButtonTypes(): Sequence<ConversionResult> {
    return sequenceOf(
        mouseButtonType(
            type = MOUSE_BUTTON,
            constants = MOUSE_BUTTON_CONSTANTS,
        ),
        mouseButtonType(
            type = MOUSE_BUTTONS,
            parentType = "Bitmask<$MOUSE_BUTTONS>",
            constants = MOUSE_BUTTONS_CONSTANTS,
        )
    )
}

private fun mouseButtonType(
    type: String,
    parentType: String? = null,
    constants: List<ButtonConstant>,
): ConversionResult {
    var body = unionBodyByConstants(
        name = type,
        constants = constants.map { constant ->
            UnionConstant(
                name = constant.name,
                value = constant.value.toString(),
                originalValue = true,
                comment = """
                    /**
                     * ${constant.description}
                     */
                    """.trimIndent()
            )
        }
    )

    if (parentType != null) {
        body = body.replaceFirst(type, "$type:\n$parentType")
    }

    return ConversionResult(
        name = type,
        body = body,
        pkg = "web.mouse",
    )
}
