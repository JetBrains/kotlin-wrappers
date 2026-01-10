// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * Represents an item that can be selected from a list of items.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem)
 */
@JsPlainObject
external interface QuickPickItem {
    /**
     * A human-readable string which is rendered prominently.
     *
     * Supports rendering of [theme icons][ThemeIcon] via the `$(<name>)`-syntax.
     *
     * **Note:** When [kind][QuickPickItem.kind] is set to [QuickPickItemKind.Default] (so a regular
     * item instead of a separator), it supports rendering of [theme icons][ThemeIcon] via the
     * `$(<name>)`-syntax.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.label)
     */
    var label: String

    /**
     * The kind of this item that determines how it is rendered in the quick pick.
     *
     * When not specified, the default is [QuickPickItemKind.Default].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.kind)
     */
    var kind: QuickPickItemKind?

    /**
     * The icon for the item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.iconPath)
     */
    var iconPath: IconPath?

    /**
     * A human-readable string which is rendered less prominently in the same line.
     *
     * Supports rendering of [theme icons][ThemeIcon] via the `$(<name>)`-syntax.
     *
     * **Note:** This property is ignored when [kind][QuickPickItem.kind] is set to
     * [QuickPickItemKind.Separator].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.description)
     */
    var description: String?

    /**
     * A human-readable string which is rendered less prominently in a separate line.
     *
     * Supports rendering of [theme icons][ThemeIcon] via the `$(<name>)`-syntax.
     *
     * **Note:** This property is ignored when [kind][QuickPickItem.kind] is set to
     * [QuickPickItemKind.Separator].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.detail)
     */
    var detail: String?

    /**
     * A [Uri] representing the resource associated with this item.
     *
     * When set, this property is used to automatically derive several item properties if they are not explicitly provided:
     * - **Label**: Derived from the resource's file name when [label][QuickPickItem.label] is not provided or is empty.
     * - **Description**: Derived from the resource's path when [description][QuickPickItem.description] is not provided or is empty.
     * - **Icon**: Derived from the current file icon theme when [iconPath][QuickPickItem.iconPath] is set to
     *   [ThemeIcon.File] or [ThemeIcon.Folder].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.resourceUri)
     */
    var resourceUri: Uri?

    /**
     * Optional flag indicating if this item is initially selected.
     *
     * This is only honored when using the [showQuickPick][window.showQuickPick] API. To do the same
     * thing with the [createQuickPick][window.createQuickPick] API, simply set the
     * [selectedItems][QuickPick.selectedItems] to the items you want selected initially.
     *
     * **Note:** This is only honored when the picker allows multiple selections.
     *
     * @see [QuickPickOptions.canPickMany]
     *
     * **Note:** This property is ignored when [kind][QuickPickItem.kind] is set to
     * [QuickPickItemKind.Separator].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.picked)
     */
    var picked: Boolean?

    /**
     * Determines if this item is always shown, even when filtered out by the user's input.
     *
     * **Note:** This property is ignored when [kind][QuickPickItem.kind] is set to
     * [QuickPickItemKind.Separator].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.alwaysShow)
     */
    var alwaysShow: Boolean?

    /**
     * Optional buttons that will be rendered on this particular item.
     *
     * These buttons will trigger an [QuickPickItemButtonEvent] when pressed. Buttons are only rendered
     * when using a quick pick created by the [createQuickPick][window.createQuickPick] API. Buttons are
     * not rendered when using the [showQuickPick][window.showQuickPick] API.
     *
     * **Note:** This property is ignored when [kind][QuickPickItem.kind] is set to
     * [QuickPickItemKind.Separator].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.buttons)
     */
    var buttons: ReadonlyArray<QuickInputButton>?
}
