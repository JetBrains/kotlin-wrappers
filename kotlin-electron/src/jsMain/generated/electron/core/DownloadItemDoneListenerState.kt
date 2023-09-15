package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{completed: 'completed', cancelled: 'cancelled', interrupted: 'interrupted'}/*union*/)""")
sealed external interface DownloadItemDoneListenerState {
    companion object {
        val completed: DownloadItemDoneListenerState
        val cancelled: DownloadItemDoneListenerState
        val interrupted: DownloadItemDoneListenerState
    }
}
