package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{dark: 'dark', light: 'light', unknown: 'unknown'}/*union*/)""")
sealed external interface SystemPreferencesGetAppLevelAppearanceResult {
    companion object {
        val dark: SystemPreferencesGetAppLevelAppearanceResult
        val light: SystemPreferencesGetAppLevelAppearanceResult
        val unknown: SystemPreferencesGetAppLevelAppearanceResult
    }
}
