package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CONSOLE_MESSAGE: 'console-message', REGISTRATION_COMPLETED: 'registration-completed'}/*union*/)""")
sealed external interface ServiceWorkersEvent : node.events.EventType {
    object CONSOLE_MESSAGE : ServiceWorkersEvent
    object REGISTRATION_COMPLETED : ServiceWorkersEvent
}
