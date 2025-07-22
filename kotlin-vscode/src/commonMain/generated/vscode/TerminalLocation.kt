// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * The location of the terminal.
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
