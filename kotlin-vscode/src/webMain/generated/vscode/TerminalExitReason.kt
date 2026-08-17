// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Terminal exit reason kind.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalExitReason)
 */
/* enum */
external class TerminalExitReason
private constructor() {
    /**
     * Unknown reason.
     */
    val Unknown: TerminalExitReason // 0

    /**
     * The window closed/reloaded.
     */
    val Shutdown: TerminalExitReason // 1

    /**
     * The shell process exited.
     */
    val Process: TerminalExitReason // 2

    /**
     * The user closed the terminal.
     */
    val User: TerminalExitReason // 3

    /**
     * An extension disposed the terminal.
     */
    val Extension: TerminalExitReason // 4
}
