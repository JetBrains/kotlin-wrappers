package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CLOSE: 'close', MESSAGE: 'message'}/*union*/)""")
sealed external interface MessagePortMainEvent : node.events.EventType {
    object CLOSE : MessagePortMainEvent
    object MESSAGE : MessagePortMainEvent
}
