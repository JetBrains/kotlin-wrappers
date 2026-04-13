// Automatically generated - do not modify!

package typescript

/**
 * Signals that the user manually requested signature help.
 * The language service will unconditionally attempt to provide a result.
 */
@kotlinx.js.JsPlainObject
external interface SignatureHelpInvokedReason : SignatureHelpTriggerReason {
    var kind: String // "invoked"
    var triggerCharacter: Nothing?
}
