// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A tree item is an UI element of the tree. Tree items are created by the {@link TreeDataProvider data provider}.
 */
open external class TreeItem {
    /**
     * A human-readable string describing this item. When `falsy`, it is derived from {@link TreeItem.resourceUri resourceUri}.
     */
//  label?: string | TreeItemLabel

    /**
     * Optional id for the tree item that has to be unique across tree. The id is used to preserve the selection and expansion state of the tree item.
     *
     * If not provided, an id is generated using the tree item's label. **Note** that when labels change, ids will change and that selection and expansion state cannot be kept stable anymore.
     */
//  id?: string

    /**
     * The icon path or {@link ThemeIcon} for the tree item.
     * When `falsy`, {@link ThemeIcon.Folder Folder Theme Icon} is assigned, if item is collapsible otherwise {@link ThemeIcon.File File Theme Icon}.
     * When a file or folder {@link ThemeIcon} is specified, icon is derived from the current file icon theme for the specified theme icon using {@link TreeItem.resourceUri resourceUri} (if provided).
     */
//  iconPath?: string | IconPath

    /**
     * A human-readable string which is rendered less prominent.
     * When `true`, it is derived from {@link TreeItem.resourceUri resourceUri} and when `falsy`, it is not shown.
     */
//  description?: string | boolean

    /**
     * The {@link Uri} of the resource representing this item.
     *
     * Will be used to derive the {@link TreeItem.label label}, when it is not provided.
     * Will be used to derive the icon from current file icon theme, when {@link TreeItem.iconPath iconPath} has {@link ThemeIcon} value.
     */
//  resourceUri?: Uri

    /**
     * The tooltip text when you hover over this item.
     */
//  tooltip?: string | MarkdownString | undefined

    /**
     * The {@link Command} that should be executed when the tree item is selected.
     *
     * Please use `vscode.open` or `vscode.diff` as command IDs when the tree item is opening
     * something in the editor. Using these commands ensures that the resulting editor will
     * appear consistent with how other built-in trees open editors.
     */
//  command?: Command

    /**
     * {@link TreeItemCollapsibleState} of the tree item.
     */
//  collapsibleState?: TreeItemCollapsibleState

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
//  contextValue?: string

    /**
     * Accessibility information used when screen reader interacts with this tree item.
     * Generally, a TreeItem has no need to set the `role` of the accessibilityInformation;
     * however, there are cases where a TreeItem is not displayed in a tree-like way where setting the `role` may make sense.
     */
//  accessibilityInformation?: AccessibilityInformation

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
//  constructor(label: string | TreeItemLabel, collapsibleState?: TreeItemCollapsibleState)

    /**
     * @param resourceUri The {@link Uri} of the resource representing this item.
     * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
     */
//  constructor(resourceUri: Uri, collapsibleState?: TreeItemCollapsibleState)
}
