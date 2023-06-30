package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CHANGED: 'changed'}/*union*/)""")
sealed external interface CookiesEvent : node.events.EventType {
    object CHANGED : CookiesEvent
}
