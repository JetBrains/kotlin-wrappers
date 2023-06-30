package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{bottom: 'bottom', left: 'left', right: 'right', topLeft: 'top-left', topRight: 'top-right', bottomLeft: 'bottom-left', bottomRight: 'bottom-right'}/*union*/)""")
sealed external interface WillResizeDetailsEdge {
    companion object {
        val bottom: WillResizeDetailsEdge
        val left: WillResizeDetailsEdge
        val right: WillResizeDetailsEdge
        val topLeft: WillResizeDetailsEdge
        val topRight: WillResizeDetailsEdge
        val bottomLeft: WillResizeDetailsEdge
        val bottomRight: WillResizeDetailsEdge
    }
}
