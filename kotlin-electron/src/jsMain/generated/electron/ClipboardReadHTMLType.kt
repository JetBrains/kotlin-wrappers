package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{selection: 'selection', clipboard: 'clipboard'}/*union*/)""")
sealed external interface ClipboardReadHTMLType {
    companion object {
        val selection: ClipboardReadHTMLType
        val clipboard: ClipboardReadHTMLType
    }
}
