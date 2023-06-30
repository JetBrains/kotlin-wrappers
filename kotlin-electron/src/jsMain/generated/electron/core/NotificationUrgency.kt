package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{normal: 'normal', critical: 'critical', low: 'low'}/*union*/)""")
sealed external interface NotificationUrgency {
    companion object {
        val normal: NotificationUrgency
        val critical: NotificationUrgency
        val low: NotificationUrgency
    }
}
