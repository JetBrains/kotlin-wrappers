package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{small: 'small', large: 'large', flexible: 'flexible'}/*union*/)""")
sealed external interface TouchBarSpacerSize {
    companion object {
        val small: TouchBarSpacerSize
        val large: TouchBarSpacerSize
        val flexible: TouchBarSpacerSize
    }
}
