package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{tasks: 'tasks', frequent: 'frequent', recent: 'recent', custom: 'custom'}/*union*/)""")
sealed external interface JumpListCategoryType {
    companion object {
        val tasks: JumpListCategoryType
        val frequent: JumpListCategoryType
        val recent: JumpListCategoryType
        val custom: JumpListCategoryType
    }
}
