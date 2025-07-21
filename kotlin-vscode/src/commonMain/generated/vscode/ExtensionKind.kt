// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

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
