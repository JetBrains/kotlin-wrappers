// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Options to configure the behavior of the message.
 *
 * @see [showInformationMessage][window.showInformationMessage]
 * @see [showWarningMessage][window.showWarningMessage]
 * @see [showErrorMessage][window.showErrorMessage]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#MessageOptions)
 */
@JsPlainObject
external interface MessageOptions {
    /**
     * Indicates that this message should be modal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#MessageOptions.modal)
     */
    var modal: Boolean?

    /**
     * Human-readable detail message that is rendered less prominent. _Note_ that detail
     * is only shown for [modal][MessageOptions.modal] messages.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#MessageOptions.detail)
     */
    var detail: String?
}
