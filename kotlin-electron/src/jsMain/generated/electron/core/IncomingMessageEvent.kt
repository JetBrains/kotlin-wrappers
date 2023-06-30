package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ABORTED: 'aborted', DATA: 'data', END: 'end', ERROR: 'error'}/*union*/)""")
sealed external interface IncomingMessageEvent : node.events.EventType {
    object ABORTED : IncomingMessageEvent
    object DATA : IncomingMessageEvent
    object END : IncomingMessageEvent
    object ERROR : IncomingMessageEvent
}
