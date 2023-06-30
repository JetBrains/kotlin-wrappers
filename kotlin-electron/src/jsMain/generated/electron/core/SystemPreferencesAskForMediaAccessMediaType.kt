package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{microphone: 'microphone', camera: 'camera'}/*union*/)""")
sealed external interface SystemPreferencesAskForMediaAccessMediaType {
    companion object {
        val microphone: SystemPreferencesAskForMediaAccessMediaType
        val camera: SystemPreferencesAskForMediaAccessMediaType
    }
}
