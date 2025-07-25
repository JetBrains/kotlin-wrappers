// Automatically generated - do not modify!

package vscode

/**
 * A workspace folder is one of potentially many roots opened by the editor. All workspace folders
 * are equal which means there is no notion of an active or primary workspace folder.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFolder)
 */
external interface WorkspaceFolder {
    /**
     * The associated uri for this workspace folder.
     *
     * *Note:* The [Uri]-type was intentionally chosen such that future releases of the editor can support
     * workspace folders that are not stored on the local disk, e.g. `ftp://server/workspaces/foo`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFolder.uri)
     */
    val uri: Uri

    /**
     * The name of this workspace folder. Defaults to
     * the basename of its [uri-path][Uri.path]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFolder.name)
     */
    val name: String

    /**
     * The ordinal number of this workspace folder.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFolder.index)
     */
    val index: Int
}
