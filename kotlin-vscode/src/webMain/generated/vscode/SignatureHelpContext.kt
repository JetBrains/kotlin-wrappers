// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Additional information about the context in which a
 * {@linkcode SignatureHelpProvider.provideSignatureHelp SignatureHelpProvider} was triggered.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpContext)
 */
@JsPlainObject
external interface SignatureHelpContext {
    /**
     * Action that caused signature help to be triggered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpContext.triggerKind)
     */
    val triggerKind: SignatureHelpTriggerKind

    /**
     * Character that caused signature help to be triggered.
     *
     * This is `undefined` when signature help is not triggered by typing, such as when manually invoking
     * signature help or when moving the cursor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpContext.triggerCharacter)
     */
    val triggerCharacter: String?

    /**
     * `true` if signature help was already showing when it was triggered.
     *
     * Retriggers occur when the signature help is already active and can be caused by actions such as
     * typing a trigger character, a cursor move, or document content changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpContext.isRetrigger)
     */
    val isRetrigger: Boolean

    /**
     * The currently active {@linkcode SignatureHelp}.
     *
     * The `activeSignatureHelp` has its {@linkcode SignatureHelp.activeSignature activeSignature} field updated based on
     * the user arrowing through available signatures.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpContext.activeSignatureHelp)
     */
    val activeSignatureHelp: SignatureHelp?
}
