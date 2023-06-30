package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket', other: 'other'}/*union*/)""")
sealed external interface OnHeadersReceivedListenerDetailsResourceType {
    companion object {
        val mainFrame: OnHeadersReceivedListenerDetailsResourceType
        val subFrame: OnHeadersReceivedListenerDetailsResourceType
        val stylesheet: OnHeadersReceivedListenerDetailsResourceType
        val script: OnHeadersReceivedListenerDetailsResourceType
        val image: OnHeadersReceivedListenerDetailsResourceType
        val font: OnHeadersReceivedListenerDetailsResourceType
        val `object`: OnHeadersReceivedListenerDetailsResourceType
        val xhr: OnHeadersReceivedListenerDetailsResourceType
        val ping: OnHeadersReceivedListenerDetailsResourceType
        val cspReport: OnHeadersReceivedListenerDetailsResourceType
        val media: OnHeadersReceivedListenerDetailsResourceType
        val webSocket: OnHeadersReceivedListenerDetailsResourceType
        val other: OnHeadersReceivedListenerDetailsResourceType
    }
}
