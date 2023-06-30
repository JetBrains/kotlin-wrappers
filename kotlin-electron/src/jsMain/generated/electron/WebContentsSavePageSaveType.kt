package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{HTMLOnly: 'HTMLOnly', HTMLComplete: 'HTMLComplete', MHTML: 'MHTML'}/*union*/)""")
sealed external interface WebContentsSavePageSaveType {
    companion object {
        val HTMLOnly: WebContentsSavePageSaveType
        val HTMLComplete: WebContentsSavePageSaveType
        val MHTML: WebContentsSavePageSaveType
    }
}
