package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{DOM_READY: 'dom-ready'}/*union*/)""")
sealed external interface WebFrameMainEvent : node.events.EventType {
    object DOM_READY : WebFrameMainEvent
}
