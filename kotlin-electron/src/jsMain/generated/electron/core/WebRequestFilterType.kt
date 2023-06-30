package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{mainFrame: 'mainFrame', subFrame: 'subFrame', stylesheet: 'stylesheet', script: 'script', image: 'image', font: 'font', `object`: 'object', xhr: 'xhr', ping: 'ping', cspReport: 'cspReport', media: 'media', webSocket: 'webSocket'}/*union*/)""")
sealed external interface WebRequestFilterType {
    companion object {
        val mainFrame: WebRequestFilterType
        val subFrame: WebRequestFilterType
        val stylesheet: WebRequestFilterType
        val script: WebRequestFilterType
        val image: WebRequestFilterType
        val font: WebRequestFilterType
        val `object`: WebRequestFilterType
        val xhr: WebRequestFilterType
        val ping: WebRequestFilterType
        val cspReport: WebRequestFilterType
        val media: WebRequestFilterType
        val webSocket: WebRequestFilterType
    }
}
