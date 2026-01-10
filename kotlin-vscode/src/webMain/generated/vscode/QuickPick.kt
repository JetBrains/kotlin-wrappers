// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void
import kotlin.js.JsString

/**
 * A concrete [QuickInput] to let the user pick an item from a list of items of type `T`.
 *
 * The items can be filtered through a filter text field and there is an option
 * [canSelectMany][QuickPick.canSelectMany] to allow for selecting multiple items.
 *
 * Note that in many cases the more convenient [window.showQuickPick] is easier to use.
 * [window.createQuickPick] should be used when [window.showQuickPick] does not offer
 * the required flexibility.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick)
 */
external interface QuickPick<
        T :
        QuickPickItem,
        > :
    QuickInput {
    /**
     * The current value of the filter text.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.value)
     */
    var value: String

    /**
     * Optional placeholder text displayed in the filter text box when no value has been entered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.placeholder)
     */
    var placeholder: String?

    /**
     * Optional text that provides instructions or context to the user.
     *
     * The prompt is displayed below the input box and above the list of items.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.prompt)
     */
    var prompt: String?

    /**
     * An event signaling when the value of the filter text has changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.onDidChangeValue)
     */
    val onDidChangeValue: Event<JsString>

    /**
     * An event signaling when the user indicated acceptance of the selected item(s).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.onDidAccept)
     */
    val onDidAccept: Event<Void>

    /**
     * Buttons for actions in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.buttons)
     */
    var buttons: ReadonlyArray<QuickInputButton>

    /**
     * An event signaling when a button was triggered.
     *
     * This event fires for buttons stored in the [buttons][QuickPick.buttons] array. This event does
     * not fire for buttons on a [QuickPickItem].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.onDidTriggerButton)
     */
    val onDidTriggerButton: Event<QuickInputButton>

    /**
     * An event signaling when a button in a particular [QuickPickItem] was triggered.
     *
     * This event does not fire for buttons in the title bar which are part of [buttons][QuickPick.buttons].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.onDidTriggerItemButton)
     */
    val onDidTriggerItemButton: Event<QuickPickItemButtonEvent<T>>

    /**
     * Items to pick from. This can be read and updated by the extension.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.items)
     */
    var items: ReadonlyArray<T>

    /**
     * Determines if multiple items can be selected at the same time. Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.canSelectMany)
     */
    var canSelectMany: Boolean

    /**
     * Determines if the filter text should also be matched against the [description][QuickPickItem.description] of the items. Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.matchOnDescription)
     */
    var matchOnDescription: Boolean

    /**
     * Determines if the filter text should also be matched against the [detail][QuickPickItem.detail] of the items. Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.matchOnDetail)
     */
    var matchOnDetail: Boolean

    /**
     * Determines if the scroll position is maintained when the quick pick items are updated. Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.keepScrollPosition)
     */
    var keepScrollPosition: Boolean?

    /**
     * Active items. This can be read and updated by the extension.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.activeItems)
     */
    var activeItems: ReadonlyArray<T>

    /**
     * An event signaling when the active items have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.onDidChangeActive)
     */
    val onDidChangeActive: Event<ReadonlyArray<T>>

    /**
     * Selected items. This can be read and updated by the extension.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.selectedItems)
     */
    var selectedItems: ReadonlyArray<T>

    /**
     * An event signaling when the selected items have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPick.onDidChangeSelection)
     */
    val onDidChangeSelection: Event<ReadonlyArray<T>>
}
