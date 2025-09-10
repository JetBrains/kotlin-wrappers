// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A tree item is an UI element of the tree. Tree items are created by the [data provider][TreeDataProvider].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem)
 */
open external class TreeItem {
    /**
     * A human-readable string describing this item. When `falsy`, it is derived from [resourceUri][TreeItem.resourceUri].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.label)
     */
    var label: JsAny /* string | TreeItemLabel */?

    /**
     * Optional id for the tree item that has to be unique across tree. The id is used to preserve the selection and expansion state of the tree item.
     *
     * If not provided, an id is generated using the tree item's label. **Note** that when labels change, ids will change and that selection and expansion state cannot be kept stable anymore.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.id)
     */
    var id: String?

    /**
     * The icon path or [ThemeIcon] for the tree item.
     * When `falsy`, [Folder Theme Icon} is assigned, if item is collapsible otherwise {@link ThemeIcon.File File Theme Icon][ThemeIcon.Folder].
     * When a file or folder [ThemeIcon] is specified, icon is derived from the current file icon theme for the specified theme icon using [resourceUri][TreeItem.resourceUri] (if provided).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.iconPath)
     */
    var iconPath: JsAny /* string | IconPath */?

    /**
     * A human-readable string which is rendered less prominent.
     * When `true`, it is derived from [resourceUri][TreeItem.resourceUri] and when `falsy`, it is not shown.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.description)
     */
    var description: JsAny /* string | boolean */?

    /**
     * The [Uri] of the resource representing this item.
     *
     * Will be used to derive the [label][TreeItem.label], when it is not provided.
     * Will be used to derive the icon from current file icon theme, when [iconPath][TreeItem.iconPath] has [ThemeIcon] value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.resourceUri)
     */
    var resourceUri: Uri?

    /**
     * The tooltip text when you hover over this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.tooltip)
     */
    var tooltip: JsAny /* string | MarkdownString */?

    /**
     * The [Command] that should be executed when the tree item is selected.
     *
     * Please use `vscode.open` or `vscode.diff` as command IDs when the tree item is opening
     * something in the editor. Using these commands ensures that the resulting editor will
     * appear consistent with how other built-in trees open editors.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.command)
     */
    var command: Command?

    /**
     * [TreeItemCollapsibleState] of the tree item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.collapsibleState)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.contextValue)
     */
    var contextValue: String?

    /**
     * Accessibility information used when screen reader interacts with this tree item.
     * Generally, a TreeItem has no need to set the `role` of the accessibilityInformation;
     * however, there are cases where a TreeItem is not displayed in a tree-like way where setting the `role` may make sense.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.accessibilityInformation)
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * [TreeItemCheckboxState][TreeItemCheckboxState] of the tree item.
     * [onDidChangeTreeData} should be fired when {@link TreeItem.checkboxState checkboxState][TreeDataProvider.onDidChangeTreeData] changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.checkboxState)
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
     * @param collapsibleState [TreeItemCollapsibleState] of the tree item. Default is [TreeItemCollapsibleState.None]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.constructor)
     */
    constructor(
        label: JsAny, /* string | TreeItemLabel */
        collapsibleState: TreeItemCollapsibleState = definedExternally,
    )

    /**
     * @param resourceUri The [Uri] of the resource representing this item.
     * @param collapsibleState [TreeItemCollapsibleState] of the tree item. Default is [TreeItemCollapsibleState.None]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItem.constructor)
     */
    constructor(
        resourceUri: Uri,
        collapsibleState: TreeItemCollapsibleState = definedExternally,
    )
}
