// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * Options to configure the behavior of the quick pick UI.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions)
 */
@JsPlainObject
external interface QuickPickOptions {
    /**
     * An optional string that represents the title of the quick pick.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.title)
     */
    var title: String?

    /**
     * An optional flag to include the description when filtering the picks.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.matchOnDescription)
     */
    var matchOnDescription: Boolean?

    /**
     * An optional flag to include the detail when filtering the picks.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.matchOnDetail)
     */
    var matchOnDetail: Boolean?

    /**
     * An optional string to show as placeholder in the input box to guide the user what to pick on.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.placeHolder)
     */
    var placeHolder: String?

    /**
     * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
     * This setting is ignored on iPad and is always false.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickPickOptions.ignoreFocusOut)
     */
    var ignoreFocusOut: Boolean?

    /**
     * An optional flag to make the picker accept multiple selections, if true the result is an array of picks.
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
