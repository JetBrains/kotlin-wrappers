package node.fs


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CLOSE: 'close', DATA: 'data', END: 'end', ERROR: 'error', OPEN: 'open', PAUSE: 'pause', READABLE: 'readable', READY: 'ready', RESUME: 'resume'}/*union*/)""")
sealed external interface ReadStreamEvent : node.events.EventType {
    object CLOSE : ReadStreamEvent
    object DATA : ReadStreamEvent
    object END : ReadStreamEvent
    object ERROR : ReadStreamEvent
    object OPEN : ReadStreamEvent
    object PAUSE : ReadStreamEvent
    object READABLE : ReadStreamEvent
    object READY : ReadStreamEvent
    object RESUME : ReadStreamEvent
}
