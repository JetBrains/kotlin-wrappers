// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Additional data for entries of a workspace edit. Supports to label entries and marks entries
 * as needing confirmation by the user. The editor groups edits with equal labels into tree nodes,
 * for instance all edits labelled with "Changes in Strings" would be a tree node.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEditEntryMetadata)
 */
@JsPlainObject
external interface WorkspaceEditEntryMetadata {
    /**
     * A flag which indicates that user confirmation is needed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEditEntryMetadata.needsConfirmation)
     */
    var needsConfirmation: Boolean

    /**
     * A human-readable string which is rendered prominent.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEditEntryMetadata.label)
     */
    var label: String

    /**
     * A human-readable string which is rendered less prominent on the same line.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEditEntryMetadata.description)
     */
    var description: String?

    /**
     * The icon path or [ThemeIcon] for the edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEditEntryMetadata.iconPath)
     */
    var iconPath: IconPath?
}
