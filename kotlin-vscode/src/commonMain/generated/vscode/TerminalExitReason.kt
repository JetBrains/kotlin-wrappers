// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Terminal exit reason kind.
 */
sealed /* enum */
external interface TerminalExitReason {
    companion object {
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
}
