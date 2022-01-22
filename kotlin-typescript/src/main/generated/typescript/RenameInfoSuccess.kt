// Automatically generated - do not modify!

package typescript

external interface RenameInfoSuccess {
    var canRename: Boolean /* true */

    /**
     * File or directory to rename.
     * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
     */
    var fileToRename: String?
    var displayName: String
    var fullDisplayName: String
    var kind: ScriptElementKind
    var kindModifiers: String
    var triggerSpan: TextSpan
}
