package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{small: 'small', normal: 'normal', large: 'large'}/*union*/)""")
sealed external interface FileIconOptionsSize {
    companion object {
        val small: FileIconOptionsSize
        val normal: FileIconOptionsSize
        val large: FileIconOptionsSize
    }
}
