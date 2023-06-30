package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{`in`: 'in', out: 'out'}/*union*/)""")
sealed external interface WebContentsAddListenerListenerZoomDirection {
    companion object {
        val `in`: WebContentsAddListenerListenerZoomDirection
        val out: WebContentsAddListenerListenerZoomDirection
    }
}
