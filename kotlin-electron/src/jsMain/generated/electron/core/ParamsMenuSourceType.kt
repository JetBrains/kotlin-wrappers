package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', mouse: 'mouse', keyboard: 'keyboard', touch: 'touch', touchMenu: 'touchMenu', longPress: 'longPress', longTap: 'longTap', touchHandle: 'touchHandle', stylus: 'stylus', adjustSelection: 'adjustSelection', adjustSelectionReset: 'adjustSelectionReset'}/*union*/)""")
sealed external interface ParamsMenuSourceType {
    companion object {
        val none: ParamsMenuSourceType
        val mouse: ParamsMenuSourceType
        val keyboard: ParamsMenuSourceType
        val touch: ParamsMenuSourceType
        val touchMenu: ParamsMenuSourceType
        val longPress: ParamsMenuSourceType
        val longTap: ParamsMenuSourceType
        val touchHandle: ParamsMenuSourceType
        val stylus: ParamsMenuSourceType
        val adjustSelection: ParamsMenuSourceType
        val adjustSelectionReset: ParamsMenuSourceType
    }
}
