package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{small: 'small', large: 'large', flexible: 'flexible'}/*union*/)""")
sealed external interface TouchBarSpacerConstructorOptionsSize {
    companion object {
        val small: TouchBarSpacerConstructorOptionsSize
        val large: TouchBarSpacerConstructorOptionsSize
        val flexible: TouchBarSpacerConstructorOptionsSize
    }
}
