// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsInt
import js.core.JsString
import js.core.Void

/**
 * A concrete {@link QuickInput} to let the user input a text value.
 *
 * Note that in many cases the more convenient {@link window.showInputBox}
 * is easier to use. {@link window.createInputBox} should be used
 * when {@link window.showInputBox} does not offer the required flexibility.
 */
external interface InputBox :
    QuickInput {
    /**
     * Current input value.
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
     */
    var valueSelection: Tuple2<JsInt, JsInt>?

    /**
     * Optional placeholder shown when no value has been input.
     */
    var placeholder: String?

    /**
     * If the input value should be hidden. Defaults to false.
     */
    var password: Boolean

    /**
     * An event signaling when the value has changed.
     */
    val onDidChangeValue: Event<JsString>

    /**
     * An event signaling when the user indicated acceptance of the input value.
     */
    val onDidAccept: Event<Void>

    /**
     * Buttons for actions in the UI.
     */
    var buttons: ReadonlyArray<QuickInputButton>

    /**
     * An event signaling when a button was triggered.
     */
    val onDidTriggerButton: Event<QuickInputButton>

    /**
     * An optional prompt text providing some ask or explanation to the user.
     */
    var prompt: String?

    /**
     * An optional validation message indicating a problem with the current input value.
     * By returning a string, the InputBox will use a default {@link InputBoxValidationSeverity} of Error.
     * Returning undefined clears the validation message.
     */
    var validationMessage: Any /* string | InputBoxValidationMessage */?
}
