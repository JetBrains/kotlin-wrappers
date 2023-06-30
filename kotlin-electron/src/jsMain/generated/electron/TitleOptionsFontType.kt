package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{monospaced: 'monospaced', monospacedDigit: 'monospacedDigit'}/*union*/)""")
sealed external interface TitleOptionsFontType {
    companion object {
        val monospaced: TitleOptionsFontType
        val monospacedDigit: TitleOptionsFontType
    }
}
