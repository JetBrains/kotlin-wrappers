// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an item that can be selected from
 * a list of items.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem)
 */
external interface QuickPickItem {
    /**
     * A human-readable string which is rendered prominent. Supports rendering of [theme icons][ThemeIcon] via
     * the `$(<name>)`-syntax.
     *
     * Note: When [kind][QuickPickItem.kind] is set to [QuickPickItemKind.Default] (so a regular item
     * instead of a separator), it supports rendering of [theme icons][ThemeIcon] via the `$(<name>)`-syntax.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.label)
     */
    var label: String

    /**
     * The kind of QuickPickItem that will determine how this item is rendered in the quick pick. When not specified,
     * the default is [QuickPickItemKind.Default].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.kind)
     */
    var kind: QuickPickItemKind?

    /**
     * The icon path or [ThemeIcon] for the QuickPickItem.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.iconPath)
     */
    var iconPath: IconPath?

    /**
     * A human-readable string which is rendered less prominent in the same line. Supports rendering of
     * [theme icons][ThemeIcon] via the `$(<name>)`-syntax.
     *
     * Note: this property is ignored when [kind][QuickPickItem.kind] is set to [QuickPickItemKind.Separator]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.description)
     */
    var description: String?

    /**
     * A human-readable string which is rendered less prominent in a separate line. Supports rendering of
     * [theme icons][ThemeIcon] via the `$(<name>)`-syntax.
     *
     * Note: this property is ignored when [kind][QuickPickItem.kind] is set to [QuickPickItemKind.Separator]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.detail)
     */
    var detail: String?

    /**
     * Optional flag indicating if this item is picked initially. This is only honored when using
     * the [showQuickPick()][window.showQuickPick] API. To do the same thing with
     * the [createQuickPick()][window.createQuickPick] API, simply set the [QuickPick.selectedItems]
     * to the items you want picked initially.
     * (*Note:* This is only honored when the picker allows multiple selections.)
     *
     * @see [QuickPickOptions.canPickMany]
     *
     * Note: this property is ignored when [kind][QuickPickItem.kind] is set to [QuickPickItemKind.Separator]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.picked)
     */
    var picked: Boolean?

    /**
     * Always show this item.
     *
     * Note: this property is ignored when [kind][QuickPickItem.kind] is set to [QuickPickItemKind.Separator]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.alwaysShow)
     */
    var alwaysShow: Boolean?

    /**
     * Optional buttons that will be rendered on this particular item. These buttons will trigger
     * an [QuickPickItemButtonEvent] when clicked. Buttons are only rendered when using a quickpick
     * created by the [createQuickPick()][window.createQuickPick] API. Buttons are not rendered when using
     * the [showQuickPick()][window.showQuickPick] API.
     *
     * Note: this property is ignored when [kind][QuickPickItem.kind] is set to [QuickPickItemKind.Separator]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickItem.buttons)
     */
    var buttons: ReadonlyArray<QuickInputButton>?
}
