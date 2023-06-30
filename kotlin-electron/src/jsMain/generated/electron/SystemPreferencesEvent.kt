package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ACCENT_COLOR_CHANGED: 'accent-color-changed', COLOR_CHANGED: 'color-changed', HIGH_CONTRAST_COLOR_SCHEME_CHANGED: 'high-contrast-color-scheme-changed', INVERTED_COLOR_SCHEME_CHANGED: 'inverted-color-scheme-changed'}/*union*/)""")
sealed external interface SystemPreferencesEvent : node.events.EventType {
    object ACCENT_COLOR_CHANGED : SystemPreferencesEvent
    object COLOR_CHANGED : SystemPreferencesEvent
    object HIGH_CONTRAST_COLOR_SCHEME_CHANGED : SystemPreferencesEvent
    object INVERTED_COLOR_SCHEME_CHANGED : SystemPreferencesEvent
}
