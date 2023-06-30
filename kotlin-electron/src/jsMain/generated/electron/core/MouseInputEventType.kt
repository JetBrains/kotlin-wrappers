package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mouseDown: 'mouseDown', mouseUp: 'mouseUp', mouseEnter: 'mouseEnter', mouseLeave: 'mouseLeave', contextMenu: 'contextMenu', mouseWheel: 'mouseWheel', mouseMove: 'mouseMove'}/*union*/)""")
sealed external interface MouseInputEventType {
    companion object {
        val mouseDown: MouseInputEventType
        val mouseUp: MouseInputEventType
        val mouseEnter: MouseInputEventType
        val mouseLeave: MouseInputEventType
        val contextMenu: MouseInputEventType
        val mouseWheel: MouseInputEventType
        val mouseMove: MouseInputEventType
    }
}
