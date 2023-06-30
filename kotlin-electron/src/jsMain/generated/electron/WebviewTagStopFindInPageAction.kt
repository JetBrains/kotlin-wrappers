package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{clearSelection: 'clearSelection', keepSelection: 'keepSelection', activateSelection: 'activateSelection'}/*union*/)""")
sealed external interface WebviewTagStopFindInPageAction {
    companion object {
        val clearSelection: WebviewTagStopFindInPageAction
        val keepSelection: WebviewTagStopFindInPageAction
        val activateSelection: WebviewTagStopFindInPageAction
    }
}
