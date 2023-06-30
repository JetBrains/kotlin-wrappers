package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket', other: 'other'}/*union*/)""")
sealed external interface OnCompletedListenerDetailsResourceType {
    companion object {
        val mainFrame: OnCompletedListenerDetailsResourceType
        val subFrame: OnCompletedListenerDetailsResourceType
        val stylesheet: OnCompletedListenerDetailsResourceType
        val script: OnCompletedListenerDetailsResourceType
        val image: OnCompletedListenerDetailsResourceType
        val font: OnCompletedListenerDetailsResourceType
        val `object`: OnCompletedListenerDetailsResourceType
        val xhr: OnCompletedListenerDetailsResourceType
        val ping: OnCompletedListenerDetailsResourceType
        val cspReport: OnCompletedListenerDetailsResourceType
        val media: OnCompletedListenerDetailsResourceType
        val webSocket: OnCompletedListenerDetailsResourceType
        val other: OnCompletedListenerDetailsResourceType
    }
}
