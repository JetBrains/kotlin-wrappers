package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{progressing: 'progressing', interrupted: 'interrupted'}/*union*/)""")
sealed external interface DownloadItemRemoveListenerListenerState {
    companion object {
        val progressing: DownloadItemRemoveListenerListenerState
        val interrupted: DownloadItemRemoveListenerListenerState
    }
}
