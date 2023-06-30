package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket', other: 'other'}/*union*/)""")
sealed external interface OnBeforeRequestListenerDetailsResourceType {
    companion object {
        val mainFrame: OnBeforeRequestListenerDetailsResourceType
        val subFrame: OnBeforeRequestListenerDetailsResourceType
        val stylesheet: OnBeforeRequestListenerDetailsResourceType
        val script: OnBeforeRequestListenerDetailsResourceType
        val image: OnBeforeRequestListenerDetailsResourceType
        val font: OnBeforeRequestListenerDetailsResourceType
        val `object`: OnBeforeRequestListenerDetailsResourceType
        val xhr: OnBeforeRequestListenerDetailsResourceType
        val ping: OnBeforeRequestListenerDetailsResourceType
        val cspReport: OnBeforeRequestListenerDetailsResourceType
        val media: OnBeforeRequestListenerDetailsResourceType
        val webSocket: OnBeforeRequestListenerDetailsResourceType
        val other: OnBeforeRequestListenerDetailsResourceType
    }
}
