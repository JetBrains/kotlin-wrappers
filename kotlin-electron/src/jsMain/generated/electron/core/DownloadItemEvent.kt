package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{DONE: 'done', UPDATED: 'updated'}/*union*/)""")
sealed external interface DownloadItemEvent : node.events.EventType {
    object DONE : DownloadItemEvent
    object UPDATED : DownloadItemEvent
}
