package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{UPDATED: 'updated'}/*union*/)""")
sealed external interface NativeThemeEvent : node.events.EventType {
    object UPDATED : NativeThemeEvent
}
