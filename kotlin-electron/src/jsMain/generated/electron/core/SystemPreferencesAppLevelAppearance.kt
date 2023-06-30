package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{dark: 'dark', light: 'light', unknown: 'unknown'}/*union*/)""")
sealed external interface SystemPreferencesAppLevelAppearance {
    companion object {
        val dark: SystemPreferencesAppLevelAppearance
        val light: SystemPreferencesAppLevelAppearance
        val unknown: SystemPreferencesAppLevelAppearance
    }
}
