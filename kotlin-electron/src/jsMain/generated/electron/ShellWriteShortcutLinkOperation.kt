package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{create: 'create', update: 'update', replace: 'replace'}/*union*/)""")
sealed external interface ShellWriteShortcutLinkOperation {
    companion object {
        val create: ShellWriteShortcutLinkOperation
        val update: ShellWriteShortcutLinkOperation
        val replace: ShellWriteShortcutLinkOperation
    }
}
