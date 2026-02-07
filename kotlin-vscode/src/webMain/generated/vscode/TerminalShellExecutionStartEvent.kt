// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * An event signalling that an execution has started in a terminal.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionStartEvent)
 */
@JsPlainObject
external interface TerminalShellExecutionStartEvent {
    /**
     * The terminal that shell integration has been activated in.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionStartEvent.terminal)
     */
    val terminal: Terminal

    /**
     * The shell integration object.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionStartEvent.shellIntegration)
     */
    val shellIntegration: TerminalShellIntegration

    /**
     * The terminal shell execution that has ended.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionStartEvent.execution)
     */
    val execution: TerminalShellExecution
}
