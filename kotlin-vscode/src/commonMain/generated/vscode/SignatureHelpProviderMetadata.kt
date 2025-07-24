// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString

/**
 * Metadata about a registered {@linkcode SignatureHelpProvider}.
 */
external interface SignatureHelpProviderMetadata {
    /**
     * List of characters that trigger signature help.
     */
    val triggerCharacters: ReadonlyArray<JsString>

    /**
     * List of characters that re-trigger signature help.
     *
     * These trigger characters are only active when signature help is already showing. All trigger characters
     * are also counted as re-trigger characters.
     */
    val retriggerCharacters: ReadonlyArray<JsString>
}
