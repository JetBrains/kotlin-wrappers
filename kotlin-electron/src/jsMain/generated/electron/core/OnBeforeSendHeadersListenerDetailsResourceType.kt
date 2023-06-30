package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket', other: 'other'}/*union*/)""")
sealed external interface OnBeforeSendHeadersListenerDetailsResourceType {
    companion object {
        val mainFrame: OnBeforeSendHeadersListenerDetailsResourceType
        val subFrame: OnBeforeSendHeadersListenerDetailsResourceType
        val stylesheet: OnBeforeSendHeadersListenerDetailsResourceType
        val script: OnBeforeSendHeadersListenerDetailsResourceType
        val image: OnBeforeSendHeadersListenerDetailsResourceType
        val font: OnBeforeSendHeadersListenerDetailsResourceType
        val `object`: OnBeforeSendHeadersListenerDetailsResourceType
        val xhr: OnBeforeSendHeadersListenerDetailsResourceType
        val ping: OnBeforeSendHeadersListenerDetailsResourceType
        val cspReport: OnBeforeSendHeadersListenerDetailsResourceType
        val media: OnBeforeSendHeadersListenerDetailsResourceType
        val webSocket: OnBeforeSendHeadersListenerDetailsResourceType
        val other: OnBeforeSendHeadersListenerDetailsResourceType
    }
}
