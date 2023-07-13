package electron.core


external interface MoveToApplicationsFolderOptions {
    /**
     * A handler for potential conflict in move failure.
     */
    var conflictHandler: ((conflictType: MoveToApplicationsFolderOptionsConflictTypeConflictType) -> Boolean)?
}
