// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * The location of the terminal.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLocation)
 */
sealed /* enum */
external interface TerminalLocation {
    companion object {
        /**
         * In the terminal view
         */
        val Panel: TerminalLocation // 1

        /**
         * In the editor area
         */
        val Editor: TerminalLocation // 2
    }
}
