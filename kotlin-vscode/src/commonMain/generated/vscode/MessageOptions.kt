// Automatically generated - do not modify!

package vscode

/**
 * Options to configure the behavior of the message.
 *
 * @see [showInformationMessage][window.showInformationMessage]
 * @see [showWarningMessage][window.showWarningMessage]
 * @see [showErrorMessage][window.showErrorMessage]
 */
external interface MessageOptions {
    /**
     * Indicates that this message should be modal.
     */
    var modal: Boolean?

    /**
     * Human-readable detail message that is rendered less prominent. _Note_ that detail
     * is only shown for [modal][MessageOptions.modal] messages.
     */
    var detail: String?
}
