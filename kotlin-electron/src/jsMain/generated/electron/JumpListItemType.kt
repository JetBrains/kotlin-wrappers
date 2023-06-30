package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{task: 'task', separator: 'separator', file: 'file'}/*union*/)""")
sealed external interface JumpListItemType {
    companion object {
        val task: JumpListItemType
        val separator: JumpListItemType
        val file: JumpListItemType
    }
}
