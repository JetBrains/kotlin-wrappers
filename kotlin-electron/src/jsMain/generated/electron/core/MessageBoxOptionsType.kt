package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', info: 'info', error: 'error', question: 'question', warning: 'warning'}/*union*/)""")
sealed external interface MessageBoxOptionsType {
    companion object {
        val none: MessageBoxOptionsType
        val info: MessageBoxOptionsType
        val error: MessageBoxOptionsType
        val question: MessageBoxOptionsType
        val warning: MessageBoxOptionsType
    }
}
