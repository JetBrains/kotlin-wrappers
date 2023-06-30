package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{DETACH: 'detach', MESSAGE: 'message'}/*union*/)""")
sealed external interface DebuggerEvent : node.events.EventType {
    object DETACH : DebuggerEvent
    object MESSAGE : DebuggerEvent
}
