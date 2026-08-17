// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * How a [SignatureHelpProvider] was triggered.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpTriggerKind)
 */
/* enum */
external class SignatureHelpTriggerKind
private constructor() {
    /**
     * Signature help was invoked manually by the user or by a command.
     */
    val Invoke: SignatureHelpTriggerKind // 1

    /**
     * Signature help was triggered by a trigger character.
     */
    val TriggerCharacter: SignatureHelpTriggerKind // 2

    /**
     * Signature help was triggered by the cursor moving or by the document content changing.
     */
    val ContentChange: SignatureHelpTriggerKind // 3
}
