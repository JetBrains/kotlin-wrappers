// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * An event signalling that an execution has ended in a terminal.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionEndEvent)
 */
@JsPlainObject
external interface TerminalShellExecutionEndEvent {
    /**
     * The terminal that shell integration has been activated in.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionEndEvent.terminal)
     */
    val terminal: Terminal

    /**
     * The shell integration object.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionEndEvent.shellIntegration)
     */
    val shellIntegration: TerminalShellIntegration

    /**
     * The terminal shell execution that has ended.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionEndEvent.execution)
     */
    val execution: TerminalShellExecution

    /**
     * The exit code reported by the shell.
     *
     * When this is `undefined` it can mean several things:
     *
     * - The shell either did not report an exit  code (ie. the shell integration script is
     *   misbehaving)
     * - The shell reported a command started before the command finished (eg. a sub-shell was
     *   opened).
     * - The user canceled the command via ctrl+c.
     * - The user pressed enter when there was no input.
     *
     * Generally this should not happen. Depending on the use case, it may be best to treat this
     * as a failure.
     *
     * @example
     * const execution = shellIntegration.executeCommand({
     *   command: 'echo',
     *   args: ['Hello world']
     * });
     * window.onDidEndTerminalShellExecution(event => {
     *   if (event.execution === execution) {
     *     if (event.exitCode === undefined) {
     * 	     console.log('Command finished but exit code is unknown');
     *     } else if (event.exitCode === 0) {
     * 	     console.log('Command succeeded');
     *     } else {
     * 	     console.log('Command failed');
     *     }
     *   }
     * });
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecutionEndEvent.exitCode)
     */
    val exitCode: Int?
}
