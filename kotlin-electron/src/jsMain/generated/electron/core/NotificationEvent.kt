package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ACTION: 'action', CLICK: 'click', CLOSE: 'close', FAILED: 'failed', REPLY: 'reply', SHOW: 'show'}/*union*/)""")
sealed external interface NotificationEvent : node.events.EventType {
    object ACTION : NotificationEvent
    object CLICK : NotificationEvent
    object CLOSE : NotificationEvent
    object FAILED : NotificationEvent
    object REPLY : NotificationEvent
    object SHOW : NotificationEvent
}
