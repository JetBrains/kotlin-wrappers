package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{RECEIVED_APNS_NOTIFICATION: 'received-apns-notification'}/*union*/)""")
sealed external interface PushNotificationsEvent : node.events.EventType {
    object RECEIVED_APNS_NOTIFICATION : PushNotificationsEvent
}
