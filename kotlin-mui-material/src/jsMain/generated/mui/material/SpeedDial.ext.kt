// Automatically generated - do not modify!

package mui.material

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{toggle: 'toggle', blur: 'blur', mouseLeave: 'mouseLeave', escapeKeyDown: 'escapeKeyDown'}/*union*/)""")
sealed external interface CloseReason {
    companion object {
        val toggle: CloseReason
        val blur: CloseReason
        val mouseLeave: CloseReason
        val escapeKeyDown: CloseReason
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{toggle: 'toggle', focus: 'focus', mouseEnter: 'mouseEnter'}/*union*/)""")
sealed external interface OpenReason {
    companion object {
        val toggle: OpenReason
        val focus: OpenReason
        val mouseEnter: OpenReason
    }
}

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{up: 'up', down: 'down', left: 'left', right: 'right'}/*union*/)""")
sealed external interface SpeedDialDirection {
    companion object {
        val up: SpeedDialDirection
        val down: SpeedDialDirection
        val left: SpeedDialDirection
        val right: SpeedDialDirection
    }
}
