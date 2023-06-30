package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{BEFORE_QUIT_FOR_UPDATE: 'before-quit-for-update', CHECKING_FOR_UPDATE: 'checking-for-update', ERROR: 'error', UPDATE_AVAILABLE: 'update-available', UPDATE_DOWNLOADED: 'update-downloaded', UPDATE_NOT_AVAILABLE: 'update-not-available'}/*union*/)""")
sealed external interface AutoUpdaterEvent : node.events.EventType {
    object BEFORE_QUIT_FOR_UPDATE : AutoUpdaterEvent
    object CHECKING_FOR_UPDATE : AutoUpdaterEvent
    object ERROR : AutoUpdaterEvent
    object UPDATE_AVAILABLE : AutoUpdaterEvent
    object UPDATE_DOWNLOADED : AutoUpdaterEvent
    object UPDATE_NOT_AVAILABLE : AutoUpdaterEvent
}
