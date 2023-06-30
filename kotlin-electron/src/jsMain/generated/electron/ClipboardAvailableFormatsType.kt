package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{selection: 'selection', clipboard: 'clipboard'}/*union*/)""")
sealed external interface ClipboardAvailableFormatsType {
    companion object {
        val selection: ClipboardAvailableFormatsType
        val clipboard: ClipboardAvailableFormatsType
    }
}
