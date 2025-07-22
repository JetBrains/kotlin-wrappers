// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an item that can be selected from
 * a list of items.
 */
external interface QuickPickItem {
    /**
     * A human-readable string which is rendered prominent. Supports rendering of {@link ThemeIcon theme icons} via
     * the `$(<name>)`-syntax.
     *
     * Note: When {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Default} (so a regular item
     * instead of a separator), it supports rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
     */
    var label: String

    /**
     * The kind of QuickPickItem that will determine how this item is rendered in the quick pick. When not specified,
     * the default is {@link QuickPickItemKind.Default}.
     */
    var kind: QuickPickItemKind?

    /**
     * The icon path or {@link ThemeIcon} for the QuickPickItem.
     */
    var iconPath: IconPath?

    /**
     * A human-readable string which is rendered less prominent in the same line. Supports rendering of
     * {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
     *
     * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
     */
    var description: String?

    /**
     * A human-readable string which is rendered less prominent in a separate line. Supports rendering of
     * {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
     *
     * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
     */
    var detail: String?

    /**
     * Optional flag indicating if this item is picked initially. This is only honored when using
     * the {@link window.showQuickPick showQuickPick()} API. To do the same thing with
     * the {@link window.createQuickPick createQuickPick()} API, simply set the {@link QuickPick.selectedItems}
     * to the items you want picked initially.
     * (*Note:* This is only honored when the picker allows multiple selections.)
     *
     * @see {@link QuickPickOptions.canPickMany}
     *
     * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
     */
    var picked: Boolean?

    /**
     * Always show this item.
     *
     * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
     */
    var alwaysShow: Boolean?

    /**
     * Optional buttons that will be rendered on this particular item. These buttons will trigger
     * an {@link QuickPickItemButtonEvent} when clicked. Buttons are only rendered when using a quickpick
     * created by the {@link window.createQuickPick createQuickPick()} API. Buttons are not rendered when using
     * the {@link window.showQuickPick showQuickPick()} API.
     *
     * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
     */
    var buttons: ReadonlyArray<QuickInputButton>?
}
