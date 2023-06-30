package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{dark: 'dark', light: 'light', unknown: 'unknown'}/*union*/)""")
sealed external interface SystemPreferencesEffectiveAppearance {
    companion object {
        val dark: SystemPreferencesEffectiveAppearance
        val light: SystemPreferencesEffectiveAppearance
        val unknown: SystemPreferencesEffectiveAppearance
    }
}
