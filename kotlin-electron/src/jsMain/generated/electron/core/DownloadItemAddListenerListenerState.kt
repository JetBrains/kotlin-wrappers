package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{progressing: 'progressing', interrupted: 'interrupted'}/*union*/)""")
sealed external interface DownloadItemAddListenerListenerState {
    companion object {
        val progressing: DownloadItemAddListenerListenerState
        val interrupted: DownloadItemAddListenerListenerState
    }
}
