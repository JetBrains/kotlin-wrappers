package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', mouse: 'mouse', keyboard: 'keyboard', touch: 'touch', touchMenu: 'touchMenu', longPress: 'longPress', longTap: 'longTap', touchHandle: 'touchHandle', stylus: 'stylus', adjustSelection: 'adjustSelection', adjustSelectionReset: 'adjustSelectionReset'}/*union*/)""")
sealed external interface ContextMenuParamsMenuSourceType {
    companion object {
        val none: ContextMenuParamsMenuSourceType
        val mouse: ContextMenuParamsMenuSourceType
        val keyboard: ContextMenuParamsMenuSourceType
        val touch: ContextMenuParamsMenuSourceType
        val touchMenu: ContextMenuParamsMenuSourceType
        val longPress: ContextMenuParamsMenuSourceType
        val longTap: ContextMenuParamsMenuSourceType
        val touchHandle: ContextMenuParamsMenuSourceType
        val stylus: ContextMenuParamsMenuSourceType
        val adjustSelection: ContextMenuParamsMenuSourceType
        val adjustSelectionReset: ContextMenuParamsMenuSourceType
    }
}
