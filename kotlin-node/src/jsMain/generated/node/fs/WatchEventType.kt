package node.fs


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{rename: 'rename', change: 'change'}/*union*/)""")
sealed external interface WatchEventType {
    companion object {
        val rename: WatchEventType
        val change: WatchEventType
    }
}
