// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface ActivationArguments {
// Docs: https://electronjs.org/docs/api/structures/activation-arguments
    /**
     * For `'action'` type, the index of the button that was clicked.
     */
    var actionIndex: Double?

    /**
     * The raw activation arguments string from Windows.
     */
    var arguments: String

    /**
     * For `'reply'` type, the text the user entered in the reply field.
     */
    var reply: String?

    /**
     * The type of activation that launched the app: `'click'`, `'action'`, or
     * `'reply'`.
     */
    var type: String

    /**
     * A dictionary of all user inputs from the notification.
     */
    var userInputs: js.objects.ReadonlyRecord<String, String>?
}
