package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{microphone: 'microphone', camera: 'camera', screen: 'screen'}/*union*/)""")
sealed external interface SystemPreferencesGetMediaAccessStatusMediaType {
    companion object {
        val microphone: SystemPreferencesGetMediaAccessStatusMediaType
        val camera: SystemPreferencesGetMediaAccessStatusMediaType
        val screen: SystemPreferencesGetMediaAccessStatusMediaType
    }
}
