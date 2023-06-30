package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ABORT: 'abort', CLOSE: 'close', ERROR: 'error', FINISH: 'finish', LOGIN: 'login', REDIRECT: 'redirect', RESPONSE: 'response'}/*union*/)""")
sealed external interface ClientRequestEvent : node.events.EventType {
    object ABORT : ClientRequestEvent
    object CLOSE : ClientRequestEvent
    object ERROR : ClientRequestEvent
    object FINISH : ClientRequestEvent
    object LOGIN : ClientRequestEvent
    object REDIRECT : ClientRequestEvent
    object RESPONSE : ClientRequestEvent
}
