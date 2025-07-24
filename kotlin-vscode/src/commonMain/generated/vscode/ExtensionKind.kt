// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * In a remote window the extension kind describes if an extension
 * runs where the UI (window) runs or if an extension runs remotely.
 */
sealed /* enum */
external interface ExtensionKind {
    companion object {
        /**
         * Extension runs where the UI runs.
         */
        val UI: ExtensionKind // 1

        /**
         * Extension runs where the remote extension host runs.
         */
        val Workspace: ExtensionKind // 2
    }
}
