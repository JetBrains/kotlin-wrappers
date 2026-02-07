// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Represents an action that is shown with an information, warning, or
 * error message.
 *
 * @see [showInformationMessage][window.showInformationMessage]
 * @see [showWarningMessage][window.showWarningMessage]
 * @see [showErrorMessage][window.showErrorMessage]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#MessageItem)
 */
@JsPlainObject
external interface MessageItem {
    /**
     * A short title like 'Retry', 'Open Log' etc.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#MessageItem.title)
     */
    var title: String

    /**
     * A hint for modal dialogs that the item should be triggered
     * when the user cancels the dialog (e.g. by pressing the ESC
     * key).
     *
     * Note: this option is ignored for non-modal messages.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#MessageItem.isCloseAffordance)
     */
    var isCloseAffordance: Boolean?
}
