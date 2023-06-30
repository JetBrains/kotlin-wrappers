package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', info: 'info', error: 'error', question: 'question', warning: 'warning'}/*union*/)""")
sealed external interface MessageBoxSyncOptionsType {
    companion object {
        val none: MessageBoxSyncOptionsType
        val info: MessageBoxSyncOptionsType
        val error: MessageBoxSyncOptionsType
        val question: MessageBoxSyncOptionsType
        val warning: MessageBoxSyncOptionsType
    }
}
