// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Represents the input box in the Source Control viewlet.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlInputBox)
 */
@JsPlainObject
external interface SourceControlInputBox {
    /**
     * Setter and getter for the contents of the input box.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlInputBox.value)
     */
    var value: String

    /**
     * A string to show as placeholder in the input box to guide the user.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlInputBox.placeholder)
     */
    var placeholder: String

    /**
     * Controls whether the input box is enabled (default is `true`).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlInputBox.enabled)
     */
    var enabled: Boolean

    /**
     * Controls whether the input box is visible (default is `true`).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlInputBox.visible)
     */
    var visible: Boolean
}
