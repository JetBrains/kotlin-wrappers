package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{progressing: 'progressing', completed: 'completed', cancelled: 'cancelled', interrupted: 'interrupted'}/*union*/)""")
sealed external interface DownloadItemGetStateResult {
    companion object {
        val progressing: DownloadItemGetStateResult
        val completed: DownloadItemGetStateResult
        val cancelled: DownloadItemGetStateResult
        val interrupted: DownloadItemGetStateResult
    }
}
