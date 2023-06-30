package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{dark: 'dark', light: 'light', unknown: 'unknown'}/*union*/)""")
sealed external interface SystemPreferencesGetEffectiveAppearanceResult {
    companion object {
        val dark: SystemPreferencesGetEffectiveAppearanceResult
        val light: SystemPreferencesGetEffectiveAppearanceResult
        val unknown: SystemPreferencesGetEffectiveAppearanceResult
    }
}
