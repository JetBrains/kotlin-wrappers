// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event describing a change to the set of {@link workspace.workspaceFolders workspace folders}.
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
