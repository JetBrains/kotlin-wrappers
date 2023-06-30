package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{exists: 'exists', existsAndRunning: 'existsAndRunning'}/*union*/)""")
sealed external interface MoveToApplicationsFolderOptionsConflictTypeConflictType {
    companion object {
        val exists: MoveToApplicationsFolderOptionsConflictTypeConflictType
        val existsAndRunning: MoveToApplicationsFolderOptionsConflictTypeConflictType
    }
}
