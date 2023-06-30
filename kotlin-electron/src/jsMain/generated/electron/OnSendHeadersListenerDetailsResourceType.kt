package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket', other: 'other'}/*union*/)""")
sealed external interface OnSendHeadersListenerDetailsResourceType {
    companion object {
        val mainFrame: OnSendHeadersListenerDetailsResourceType
        val subFrame: OnSendHeadersListenerDetailsResourceType
        val stylesheet: OnSendHeadersListenerDetailsResourceType
        val script: OnSendHeadersListenerDetailsResourceType
        val image: OnSendHeadersListenerDetailsResourceType
        val font: OnSendHeadersListenerDetailsResourceType
        val `object`: OnSendHeadersListenerDetailsResourceType
        val xhr: OnSendHeadersListenerDetailsResourceType
        val ping: OnSendHeadersListenerDetailsResourceType
        val cspReport: OnSendHeadersListenerDetailsResourceType
        val media: OnSendHeadersListenerDetailsResourceType
        val webSocket: OnSendHeadersListenerDetailsResourceType
        val other: OnSendHeadersListenerDetailsResourceType
    }
}
