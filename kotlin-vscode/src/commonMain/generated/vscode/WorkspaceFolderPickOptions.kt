// Automatically generated - do not modify!

package vscode

/**
 * Options to configure the behaviour of the [workspace folder][WorkspaceFolder] pick UI.
 */
external interface WorkspaceFolderPickOptions {
    /**
     * An optional string to show as placeholder in the input box to guide the user what to pick on.
     */
    var placeHolder: String?

    /**
     * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
     * This setting is ignored on iPad and is always false.
     */
    var ignoreFocusOut: Boolean?
}
