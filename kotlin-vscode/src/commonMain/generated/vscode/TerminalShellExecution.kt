// Automatically generated - do not modify!

package vscode

/**
 * A command that was executed in a terminal.
 */
external interface TerminalShellExecution {
    /**
     * The command line that was executed. The {@link TerminalShellExecutionCommandLineConfidence confidence}
     * of this value depends on the specific shell's shell integration implementation. This
     * value may become more accurate after {@link window.onDidEndTerminalShellExecution} is
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
     */
//  readonly commandLine: TerminalShellExecutionCommandLine;

    /**
     * The working directory that was reported by the shell when this command executed. This
     * {@link Uri} may represent a file on another machine (eg. ssh into another machine). This
     * requires the shell integration to support working directory reporting.
     */
//  readonly cwd: Uri | undefined;

    /**
     * Creates a stream of raw data (including escape sequences) that is written to the
     * terminal. This will only include data that was written after `read` was called for
     * the first time, ie. you must call `read` immediately after the command is executed via
     * {@link TerminalShellIntegration.executeCommand} or
     * {@link window.onDidStartTerminalShellExecution} to not miss any data.
     *
     * @example
     * // Log all data written to the terminal for a command
     * const command = term.shellIntegration.executeCommand({ commandLine: 'echo "Hello world"' });
     * const stream = command.read();
     * for await (const data of stream) {
     *   console.log(data);
     * }
     */
//  read(): AsyncIterable<string>;
}
