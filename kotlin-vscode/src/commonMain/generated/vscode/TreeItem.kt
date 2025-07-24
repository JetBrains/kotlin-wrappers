// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny

/**
 * A tree item is an UI element of the tree. Tree items are created by the {@link TreeDataProvider data provider}.
 */
open external class TreeItem {
    /**
     * A human-readable string describing this item. When `falsy`, it is derived from {@link TreeItem.resourceUri resourceUri}.
     */
    var label: JsAny /* string | TreeItemLabel */?

    /**
     * Optional id for the tree item that has to be unique across tree. The id is used to preserve the selection and expansion state of the tree item.
     *
     * If not provided, an id is generated using the tree item's label. **Note** that when labels change, ids will change and that selection and expansion state cannot be kept stable anymore.
     */
    var id: String?

    /**
     * The icon path or {@link ThemeIcon} for the tree item.
     * When `falsy`, {@link ThemeIcon.Folder Folder Theme Icon} is assigned, if item is collapsible otherwise {@link ThemeIcon.File File Theme Icon}.
     * When a file or folder {@link ThemeIcon} is specified, icon is derived from the current file icon theme for the specified theme icon using {@link TreeItem.resourceUri resourceUri} (if provided).
     */
    var iconPath: JsAny /* string | IconPath */?

    /**
     * A human-readable string which is rendered less prominent.
     * When `true`, it is derived from {@link TreeItem.resourceUri resourceUri} and when `falsy`, it is not shown.
     */
    var description: JsAny /* string | boolean */?

    /**
     * The {@link Uri} of the resource representing this item.
     *
     * Will be used to derive the {@link TreeItem.label label}, when it is not provided.
     * Will be used to derive the icon from current file icon theme, when {@link TreeItem.iconPath iconPath} has {@link ThemeIcon} value.
     */
    var resourceUri: Uri?

    /**
     * The tooltip text when you hover over this item.
     */
    var tooltip: JsAny /* string | MarkdownString */?

    /**
     * The {@link Command} that should be executed when the tree item is selected.
     *
     * Please use `vscode.open` or `vscode.diff` as command IDs when the tree item is opening
     * something in the editor. Using these commands ensures that the resulting editor will
     * appear consistent with how other built-in trees open editors.
     */
    var command: Command?

    /**
     * {@link TreeItemCollapsibleState} of the tree item.
     */
    var collapsibleState: TreeItemCollapsibleState?

    /**
     * Context value of the tree item. This can be used to contribute item specific actions in the tree.
     * For example, a tree item is given a context value as `folder`. When contributing actions to `view/item/context`
     * using `menus` extension point, you can specify context value for key `viewItem` in `when` expression like `viewItem == folder`.
     * ```json
     * "contributes": {
     *   "menus": {
     *     "view/item/context": [
     *       {
     *         "command": "extension.deleteFolder",
     *         "when": "viewItem == folder"
     *       }
     *     ]
     *   }
     * }
     * ```
     * This will show action `extension.deleteFolder` only for items with `contextValue` is `folder`.
     */
    var contextValue: String?

    /**
     * Accessibility information used when screen reader interacts with this tree item.
     * Generally, a TreeItem has no need to set the `role` of the accessibilityInformation;
     * however, there are cases where a TreeItem is not displayed in a tree-like way where setting the `role` may make sense.
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * {@link TreeItemCheckboxState TreeItemCheckboxState} of the tree item.
     * {@link TreeDataProvider.onDidChangeTreeData onDidChangeTreeData} should be fired when {@link TreeItem.checkboxState checkboxState} changes.
     */
    /*
    checkboxState?: TreeItemCheckboxState | {
        /**
         * The {@link TreeItemCheckboxState} of the tree item
         */
        readonly state: TreeItemCheckboxState;
        /**
         * A tooltip for the checkbox
         */
        readonly tooltip?: string;
        /**
         * Accessibility information used when screen readers interact with this checkbox
         */
        readonly accessibilityInformation?: AccessibilityInformation;
    }
    */

    /**
     * @param label A human-readable string describing this item
     * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
     */
    constructor(
        label: JsAny, /* string | TreeItemLabel */
        collapsibleState: TreeItemCollapsibleState = definedExternally,
    )

    /**
     * @param resourceUri The {@link Uri} of the resource representing this item.
     * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
     */
    constructor(
        resourceUri: Uri,
        collapsibleState: TreeItemCollapsibleState = definedExternally,
    )
}
