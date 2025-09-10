// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsInt
import js.core.JsString
import js.core.Void
import kotlin.js.JsAny

/**
 * A concrete [QuickInput] to let the user input a text value.
 *
 * Note that in many cases the more convenient [window.showInputBox]
 * is easier to use. [window.createInputBox] should be used
 * when [window.showInputBox] does not offer the required flexibility.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox)
 */
external interface InputBox :
    QuickInput {
    /**
     * Current input value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.value)
     */
    var value: String

    /**
     * Selection range in the input value. Defined as tuple of two number where the
     * first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
     * pre-filled value will be selected, when empty (start equals end) only the cursor will be set,
     * otherwise the defined range will be selected.
     *
     * This property does not get updated when the user types or makes a selection,
     * but it can be updated by the extension.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.valueSelection)
     */
    var valueSelection: Tuple2<JsInt, JsInt>?

    /**
     * Optional placeholder shown when no value has been input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.placeholder)
     */
    var placeholder: String?

    /**
     * If the input value should be hidden. Defaults to false.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.password)
     */
    var password: Boolean

    /**
     * An event signaling when the value has changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.onDidChangeValue)
     */
    val onDidChangeValue: Event<JsString>

    /**
     * An event signaling when the user indicated acceptance of the input value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.onDidAccept)
     */
    val onDidAccept: Event<Void>

    /**
     * Buttons for actions in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.buttons)
     */
    var buttons: ReadonlyArray<QuickInputButton>

    /**
     * An event signaling when a button was triggered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.onDidTriggerButton)
     */
    val onDidTriggerButton: Event<QuickInputButton>

    /**
     * An optional prompt text providing some ask or explanation to the user.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.prompt)
     */
    var prompt: String?

    /**
     * An optional validation message indicating a problem with the current input value.
     * By returning a string, the InputBox will use a default [InputBoxValidationSeverity] of Error.
     * Returning undefined clears the validation message.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBox.validationMessage)
     */
    var validationMessage: JsAny /* string | InputBoxValidationMessage */?
}
