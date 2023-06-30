package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket', other: 'other'}/*union*/)""")
sealed external interface OnErrorOccurredListenerDetailsResourceType {
    companion object {
        val mainFrame: OnErrorOccurredListenerDetailsResourceType
        val subFrame: OnErrorOccurredListenerDetailsResourceType
        val stylesheet: OnErrorOccurredListenerDetailsResourceType
        val script: OnErrorOccurredListenerDetailsResourceType
        val image: OnErrorOccurredListenerDetailsResourceType
        val font: OnErrorOccurredListenerDetailsResourceType
        val `object`: OnErrorOccurredListenerDetailsResourceType
        val xhr: OnErrorOccurredListenerDetailsResourceType
        val ping: OnErrorOccurredListenerDetailsResourceType
        val cspReport: OnErrorOccurredListenerDetailsResourceType
        val media: OnErrorOccurredListenerDetailsResourceType
        val webSocket: OnErrorOccurredListenerDetailsResourceType
        val other: OnErrorOccurredListenerDetailsResourceType
    }
}
