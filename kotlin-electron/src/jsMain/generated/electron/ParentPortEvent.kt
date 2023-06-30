package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{MESSAGE: 'message'}/*union*/)""")
sealed external interface ParentPortEvent : node.events.EventType {
    object MESSAGE : ParentPortEvent
}
