package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{DISPLAY_ADDED: 'display-added', DISPLAY_METRICS_CHANGED: 'display-metrics-changed', DISPLAY_REMOVED: 'display-removed'}/*union*/)""")
sealed external interface ScreenEvent : node.events.EventType {
    object DISPLAY_ADDED : ScreenEvent
    object DISPLAY_METRICS_CHANGED : ScreenEvent
    object DISPLAY_REMOVED : ScreenEvent
}
