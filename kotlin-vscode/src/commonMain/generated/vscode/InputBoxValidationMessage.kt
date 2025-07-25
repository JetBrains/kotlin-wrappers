// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Object to configure the behavior of the validation message.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBoxValidationMessage)
 */
@JsPlainObject
external interface InputBoxValidationMessage {
    /**
     * The validation message to display.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBoxValidationMessage.message)
     */
    val message: String

    /**
     * The severity of the validation message.
     * NOTE: When using `InputBoxValidationSeverity.Error`, the user will not be allowed to accept (hit ENTER) the input.
     * `Info` and `Warning` will still allow the InputBox to accept the input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBoxValidationMessage.severity)
     */
    val severity: InputBoxValidationSeverity
}
