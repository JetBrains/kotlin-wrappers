package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{notDetermined: 'not-determined', granted: 'granted', denied: 'denied', restricted: 'restricted', unknown: 'unknown'}/*union*/)""")
sealed external interface SystemPreferencesGetMediaAccessStatusResult {
    companion object {
        val notDetermined: SystemPreferencesGetMediaAccessStatusResult
        val granted: SystemPreferencesGetMediaAccessStatusResult
        val denied: SystemPreferencesGetMediaAccessStatusResult
        val restricted: SystemPreferencesGetMediaAccessStatusResult
        val unknown: SystemPreferencesGetMediaAccessStatusResult
    }
}
