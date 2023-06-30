package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket', other: 'other'}/*union*/)""")
sealed external interface OnResponseStartedListenerDetailsResourceType {
    companion object {
        val mainFrame: OnResponseStartedListenerDetailsResourceType
        val subFrame: OnResponseStartedListenerDetailsResourceType
        val stylesheet: OnResponseStartedListenerDetailsResourceType
        val script: OnResponseStartedListenerDetailsResourceType
        val image: OnResponseStartedListenerDetailsResourceType
        val font: OnResponseStartedListenerDetailsResourceType
        val `object`: OnResponseStartedListenerDetailsResourceType
        val xhr: OnResponseStartedListenerDetailsResourceType
        val ping: OnResponseStartedListenerDetailsResourceType
        val cspReport: OnResponseStartedListenerDetailsResourceType
        val media: OnResponseStartedListenerDetailsResourceType
        val webSocket: OnResponseStartedListenerDetailsResourceType
        val other: OnResponseStartedListenerDetailsResourceType
    }
}
