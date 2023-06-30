package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{MENU_WILL_CLOSE: 'menu-will-close', MENU_WILL_SHOW: 'menu-will-show'}/*union*/)""")
sealed external interface MenuEvent : node.events.EventType {
    object MENU_WILL_CLOSE : MenuEvent
    object MENU_WILL_SHOW : MenuEvent
}
