package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{selection: 'selection', clipboard: 'clipboard'}/*union*/)""")
sealed external interface ClipboardReadTextType {
    companion object {
        val selection: ClipboardReadTextType
        val clipboard: ClipboardReadTextType
    }
}
