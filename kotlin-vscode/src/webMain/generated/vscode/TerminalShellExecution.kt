// Automatically generated - do not modify!

package vscode

import js.iterable.AsyncIterable
import kotlin.js.JsString

/**
 * A command that was executed in a terminal.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecution)
 */
external interface TerminalShellExecution {
    /**
     * The command line that was executed. The [confidence][TerminalShellExecutionCommandLineConfidence]
     * of this value depends on the specific shell's shell integration implementation. This
     * value may become more accurate after [window.onDidEndTerminalShellExecution] is
     * fired.
     *
     * @example
     * // Log the details of the command line on start and end
     * window.onDidStartTerminalShellExecution(event => {
     *   const commandLine = event.execution.commandLine;
     *   console.log(`Command started\n${summarizeCommandLine(commandLine)}`);
     * });
     * window.onDidEndTerminalShellExecution(event => {
     *   const commandLine = event.execution.commandLine;
     *   console.log(`Command ended\n${summarizeCommandLine(commandLine)}`);
     * });
     * function summarizeCommandLine(commandLine: TerminalShellExecutionCommandLine) {
     *   return [
     *     `  Command line: ${command.commandLine.value}`,
     *     `  Confidence: ${command.commandLine.confidence}`,
     *     `  Trusted: ${command.commandLine.isTrusted}
     *   ].join('\n');
     * }
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecution.commandLine)
     */
    val commandLine: TerminalShellExecutionCommandLine

    /**
     * The working directory that was reported by the shell when this command executed. This
     * [Uri] may represent a file on another machine (eg. ssh into another machine). This
     * requires the shell integration to support working directory reporting.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecution.cwd)
     */
    val cwd: Uri?

    /**
     * Creates a stream of raw data (including escape sequences) that is written to the
     * terminal. This will only include data that was written after `read` was called for
     * the first time, ie. you must call `read` immediately after the command is executed via
     * [TerminalShellIntegration.executeCommand] or
     * [window.onDidStartTerminalShellExecution] to not miss any data.
     *
     * @example
     * // Log all data written to the terminal for a command
     * const command = term.shellIntegration.executeCommand({ commandLine: 'echo "Hello world"' });
     * const stream = command.read();
     * for await (const data of stream) {
     *   console.log(data);
     * }
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellExecution.read)
     */
    fun read(): AsyncIterable<JsString>
}
