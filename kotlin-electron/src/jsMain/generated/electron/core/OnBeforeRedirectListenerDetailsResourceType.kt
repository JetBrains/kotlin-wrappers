package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket', other: 'other'}/*union*/)""")
sealed external interface OnBeforeRedirectListenerDetailsResourceType {
    companion object {
        val mainFrame: OnBeforeRedirectListenerDetailsResourceType
        val subFrame: OnBeforeRedirectListenerDetailsResourceType
        val stylesheet: OnBeforeRedirectListenerDetailsResourceType
        val script: OnBeforeRedirectListenerDetailsResourceType
        val image: OnBeforeRedirectListenerDetailsResourceType
        val font: OnBeforeRedirectListenerDetailsResourceType
        val `object`: OnBeforeRedirectListenerDetailsResourceType
        val xhr: OnBeforeRedirectListenerDetailsResourceType
        val ping: OnBeforeRedirectListenerDetailsResourceType
        val cspReport: OnBeforeRedirectListenerDetailsResourceType
        val media: OnBeforeRedirectListenerDetailsResourceType
        val webSocket: OnBeforeRedirectListenerDetailsResourceType
        val other: OnBeforeRedirectListenerDetailsResourceType
    }
}
