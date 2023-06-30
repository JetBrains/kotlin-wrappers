package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{clearSelection: 'clearSelection', keepSelection: 'keepSelection', activateSelection: 'activateSelection'}/*union*/)""")
sealed external interface WebContentsStopFindInPageAction {
    companion object {
        val clearSelection: WebContentsStopFindInPageAction
        val keepSelection: WebContentsStopFindInPageAction
        val activateSelection: WebContentsStopFindInPageAction
    }
}
