// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.JsPlainObject

/**
 * Metadata about a registered {@linkcode SignatureHelpProvider}.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpProviderMetadata)
 */
@JsPlainObject
external interface SignatureHelpProviderMetadata {
    /**
     * List of characters that trigger signature help.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpProviderMetadata.triggerCharacters)
     */
    val triggerCharacters: ReadonlyArray<JsString>

    /**
     * List of characters that re-trigger signature help.
     *
     * These trigger characters are only active when signature help is already showing. All trigger characters
     * are also counted as re-trigger characters.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelpProviderMetadata.retriggerCharacters)
     */
    val retriggerCharacters: ReadonlyArray<JsString>
}
