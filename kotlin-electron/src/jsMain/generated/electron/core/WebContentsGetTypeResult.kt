package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{backgroundPage: 'backgroundPage', window: 'window', browserView: 'browserView', remote: 'remote', webview: 'webview', offscreen: 'offscreen'}/*union*/)""")
sealed external interface WebContentsGetTypeResult {
    companion object {
        val backgroundPage: WebContentsGetTypeResult
        val window: WebContentsGetTypeResult
        val browserView: WebContentsGetTypeResult
        val remote: WebContentsGetTypeResult
        val webview: WebContentsGetTypeResult
        val offscreen: WebContentsGetTypeResult
    }
}
