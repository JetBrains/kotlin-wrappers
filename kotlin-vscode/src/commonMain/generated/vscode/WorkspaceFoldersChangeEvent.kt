// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event describing a change to the set of [workspace folders][workspace.workspaceFolders].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFoldersChangeEvent)
 */
external interface WorkspaceFoldersChangeEvent {
    /**
     * Added workspace folders.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFoldersChangeEvent.added)
     */
    val added: ReadonlyArray<WorkspaceFolder>

    /**
     * Removed workspace folders.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFoldersChangeEvent.removed)
     */
    val removed: ReadonlyArray<WorkspaceFolder>
}
