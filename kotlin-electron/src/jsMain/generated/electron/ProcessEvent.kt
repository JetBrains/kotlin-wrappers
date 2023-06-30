package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{LOADED: 'loaded'}/*union*/)""")
sealed external interface ProcessEvent : node.events.EventType {
    object LOADED : ProcessEvent
}
