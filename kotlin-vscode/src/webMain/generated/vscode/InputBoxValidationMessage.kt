// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Represents a validation message for an [InputBox].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBoxValidationMessage)
 */
@JsPlainObject
external interface InputBoxValidationMessage {
    /**
     * The validation message to display to the user.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBoxValidationMessage.message)
     */
    val message: String

    /**
     * The severity level of the validation message.
     *
     * **Note:** When using [InputBoxValidationSeverity.Error], the user will not be able to accept
     * the input (e.g., by pressing Enter). [Info][InputBoxValidationSeverity.Info] and
     * [Warning][InputBoxValidationSeverity.Warning] severities will still allow the input to be accepted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBoxValidationMessage.severity)
     */
    val severity: InputBoxValidationSeverity
}
