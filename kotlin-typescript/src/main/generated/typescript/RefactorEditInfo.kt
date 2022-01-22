// Automatically generated - do not modify!

package typescript

/**
 * A set of edits to make in response to a refactor action, plus an optional
 * location where renaming should be invoked from
 */
external interface RefactorEditInfo {
    var edits: ReadonlyArray<FileTextChanges>
    var renameFilename: String?
    var renameLocation: Int?
    var commands: ReadonlyArray<CodeActionCommand>?
}
