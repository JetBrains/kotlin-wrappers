// Automatically generated - do not modify!

package vscode

/**
 * A concrete {@link QuickInput} to let the user pick an item from a
 * list of items of type T. The items can be filtered through a filter text field and
 * there is an option {@link QuickPick.canSelectMany canSelectMany} to allow for
 * selecting multiple items.
 *
 * Note that in many cases the more convenient {@link window.showQuickPick}
 * is easier to use. {@link window.createQuickPick} should be used
 * when {@link window.showQuickPick} does not offer the required flexibility.
 */
external interface QuickPick<
        T :
        QuickPickItem,
        > :
    QuickInput {
    /**
    // ORIGINAL SOURCE


    /**
     * Current value of the filter text.
    */
    value: string;

    /**
     * Optional placeholder shown in the filter textbox when no filter has been entered.
    */
    placeholder: string | undefined;

    /**
     * An event signaling when the value of the filter text has changed.
    */
    readonly onDidChangeValue: Event<string>;

    /**
     * An event signaling when the user indicated acceptance of the selected item(s).
    */
    readonly onDidAccept: Event<void>;

    /**
     * Buttons for actions in the UI.
    */
    buttons: readonly QuickInputButton[];

    /**
     * An event signaling when a top level button (buttons stored in {@link buttons}) was triggered.
     * This event does not fire for buttons on a {@link QuickPickItem}.
    */
    readonly onDidTriggerButton: Event<QuickInputButton>;

    /**
     * An event signaling when a button in a particular {@link QuickPickItem} was triggered.
     * This event does not fire for buttons in the title bar.
    */
    readonly onDidTriggerItemButton: Event<QuickPickItemButtonEvent<T>>;

    /**
     * Items to pick from. This can be read and updated by the extension.
    */
    items: readonly T[];

    /**
     * If multiple items can be selected at the same time. Defaults to false.
    */
    canSelectMany: boolean;

    /**
     * If the filter text should also be matched against the description of the items. Defaults to false.
    */
    matchOnDescription: boolean;

    /**
     * If the filter text should also be matched against the detail of the items. Defaults to false.
    */
    matchOnDetail: boolean;

    /**
     * An optional flag to maintain the scroll position of the quick pick when the quick pick items are updated. Defaults to false.
    */
    keepScrollPosition?: boolean;

    /**
     * Active items. This can be read and updated by the extension.
    */
    activeItems: readonly T[];

    /**
     * An event signaling when the active items have changed.
    */
    readonly onDidChangeActive: Event<readonly T[]>;

    /**
     * Selected items. This can be read and updated by the extension.
    */
    selectedItems: readonly T[];

    /**
     * An event signaling when the selected items have changed.
    */
    readonly onDidChangeSelection: Event<readonly T[]>;

    // ORIGINAL SOURCE
     **/
}
