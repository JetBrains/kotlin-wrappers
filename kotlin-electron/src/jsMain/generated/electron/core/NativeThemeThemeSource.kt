package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{system: 'system', light: 'light', dark: 'dark'}/*union*/)""")
sealed external interface NativeThemeThemeSource {
    companion object {
        val system: NativeThemeThemeSource
        val light: NativeThemeThemeSource
        val dark: NativeThemeThemeSource
    }
}
