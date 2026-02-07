// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

/**
 * Options to configure the behavior of the quick pick UI.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions)
 */
@JsPlainObject
external interface QuickPickOptions {
    /**
     * An optional title for the quick pick.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.title)
     */
    var title: String?

    /**
     * Determines if the [description][QuickPickItem.description] should be included when filtering items. Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.matchOnDescription)
     */
    var matchOnDescription: Boolean?

    /**
     * Determines if the [detail][QuickPickItem.detail] should be included when filtering items. Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.matchOnDetail)
     */
    var matchOnDetail: Boolean?

    /**
     * An optional string to show as placeholder in the input box to guide the user.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.placeHolder)
     */
    var placeHolder: String?

    /**
     * Optional text that provides instructions or context to the user.
     *
     * The prompt is displayed below the input box and above the list of items.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.prompt)
     */
    var prompt: String?

    /**
     * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
     * This setting is ignored on iPad and is always `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.ignoreFocusOut)
     */
    var ignoreFocusOut: Boolean?

    /**
     * Determines if the picker allows multiple selections. When `true`, the result is an array of picks.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.canPickMany)
     */
    var canPickMany: Boolean?

    /**
     * An optional function that is invoked whenever an item is selected.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.onDidSelectItem)
     */
    var onDidSelectItem: ((item: JsAny /* QuickPickItem | string */) -> JsAny?)?
}
