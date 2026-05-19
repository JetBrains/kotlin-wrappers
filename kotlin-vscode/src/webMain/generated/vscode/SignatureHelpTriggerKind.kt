// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * How a [SignatureHelpProvider] was triggered.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpTriggerKind)
 */
sealed /* enum */
external interface SignatureHelpTriggerKind {
    companion object {
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
}
