package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{progressing: 'progressing', interrupted: 'interrupted'}/*union*/)""")
sealed external interface DownloadItemUpdatedListenerState {
    companion object {
        val progressing: DownloadItemUpdatedListenerState
        val interrupted: DownloadItemUpdatedListenerState
    }
}
