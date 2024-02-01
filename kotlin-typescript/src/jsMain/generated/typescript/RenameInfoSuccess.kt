// Automatically generated - do not modify!

package typescript

sealed external interface RenameInfoSuccess : Union.RenameInfoSuccess_ {
    var canRename: Boolean /* true */

    /**
     * File or directory to rename.
     * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
     */
    var fileToRename: String?
    var displayName: String

    /**
     * Full display name of item to be renamed.
     * If item to be renamed is a file, then this is the original text of the module specifer
     */
    var fullDisplayName: String
    var kind: ScriptElementKind
    var kindModifiers: String
    var triggerSpan: TextSpan
}
