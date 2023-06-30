package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{default: 'default', includeSensitive: 'includeSensitive', everything: 'everything'}/*union*/)""")
sealed external interface StartLoggingOptionsCaptureMode {
    companion object {
        val default: StartLoggingOptionsCaptureMode
        val includeSensitive: StartLoggingOptionsCaptureMode
        val everything: StartLoggingOptionsCaptureMode
    }
}
