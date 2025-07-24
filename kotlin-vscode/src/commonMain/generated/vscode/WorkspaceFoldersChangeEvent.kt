// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event describing a change to the set of [workspace folders][workspace.workspaceFolders].
 */
external interface WorkspaceFoldersChangeEvent {
    /**
     * Added workspace folders.
     */
    val added: ReadonlyArray<WorkspaceFolder>

    /**
     * Removed workspace folders.
     */
    val removed: ReadonlyArray<WorkspaceFolder>
}
