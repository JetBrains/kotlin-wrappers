// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Options to configure the behavior of the [workspace folder][WorkspaceFolder] pick UI.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFolderPickOptions)
 */
@JsPlainObject
external interface WorkspaceFolderPickOptions {
    /**
     * An optional string to show as placeholder in the input box to guide the user.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFolderPickOptions.placeHolder)
     */
    var placeHolder: String?

    /**
     * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
     * This setting is ignored on iPad and is always `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceFolderPickOptions.ignoreFocusOut)
     */
    var ignoreFocusOut: Boolean?
}
