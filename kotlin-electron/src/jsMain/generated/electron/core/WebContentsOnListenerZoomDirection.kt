package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{`in`: 'in', out: 'out'}/*union*/)""")
sealed external interface WebContentsOnListenerZoomDirection {
    companion object {
        val `in`: WebContentsOnListenerZoomDirection
        val out: WebContentsOnListenerZoomDirection
    }
}
