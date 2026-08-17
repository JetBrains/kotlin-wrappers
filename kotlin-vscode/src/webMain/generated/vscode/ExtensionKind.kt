// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * In a remote window the extension kind describes if an extension
 * runs where the UI (window) runs or if an extension runs remotely.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionKind)
 */
/* enum */
external class ExtensionKind
private constructor() {

    /**
     * Extension runs where the UI runs.
     */
    val UI: ExtensionKind // 1

    /**
     * Extension runs where the remote extension host runs.
     */
    val Workspace: ExtensionKind // 2
}
