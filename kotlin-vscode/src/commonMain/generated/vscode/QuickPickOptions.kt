// Automatically generated - do not modify!

package vscode

/**
 * Options to configure the behavior of the quick pick UI.
 */
external interface QuickPickOptions {
    /**
     * An optional string that represents the title of the quick pick.
     */
    var title: String?

    /**
     * An optional flag to include the description when filtering the picks.
     */
    var matchOnDescription: Boolean?

    /**
     * An optional flag to include the detail when filtering the picks.
     */
    var matchOnDetail: Boolean?

    /**
     * An optional string to show as placeholder in the input box to guide the user what to pick on.
     */
    var placeHolder: String?

    /**
     * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
     * This setting is ignored on iPad and is always false.
     */
    var ignoreFocusOut: Boolean?

    /**
     * An optional flag to make the picker accept multiple selections, if true the result is an array of picks.
     */
    var canPickMany: Boolean?

    /**
     * An optional function that is invoked whenever an item is selected.
     */
//  onDidSelectItem?(item: QuickPickItem | string): any
}
