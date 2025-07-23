// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * [Shell integration](https://code.visualstudio.com/docs/terminal/shell-integration)-powered capabilities owned by a terminal.
 */
external interface TerminalShellIntegration {
    /**
     * The current working directory of the terminal. This {@link Uri} may represent a file on
     * another machine (eg. ssh into another machine). This requires the shell integration to
     * support working directory reporting.
     */
    val cwd: Uri?

    /**
     * Execute a command, sending ^C as necessary to interrupt any running command if needed.
     *
     * @param commandLine The command line to execute, this is the exact text that will be sent
     * to the terminal.
     *
     * @example
     * // Execute a command in a terminal immediately after being created
     * const myTerm = window.createTerminal();
     * window.onDidChangeTerminalShellIntegration(async ({ terminal, shellIntegration }) => {
     *   if (terminal === myTerm) {
     *     const execution = shellIntegration.executeCommand('echo "Hello world"');
     *     window.onDidEndTerminalShellExecution(event => {
     *       if (event.execution === execution) {
     *         console.log(`Command exited with code ${event.exitCode}`);
     *       }
     *     });
     *   }
     * }));
     * // Fallback to sendText if there is no shell integration within 3 seconds of launching
     * setTimeout(() => {
     *   if (!myTerm.shellIntegration) {
     *     myTerm.sendText('echo "Hello world"');
     *     // Without shell integration, we can't know when the command has finished or what the
     *     // exit code was.
     *   }
     * }, 3000);
     *
     * @example
     * // Send command to terminal that has been alive for a while
     * const commandLine = 'echo "Hello world"';
     * if (term.shellIntegration) {
     *   const execution = shellIntegration.executeCommand({ commandLine });
     *   window.onDidEndTerminalShellExecution(event => {
     *     if (event.execution === execution) {
     *       console.log(`Command exited with code ${event.exitCode}`);
     *     }
     *   });
     * } else {
     *   term.sendText(commandLine);
     *   // Without shell integration, we can't know when the command has finished or what the
     *   // exit code was.
     * }
     */
    fun executeCommand(commandLine: String): TerminalShellExecution

    /**
     * Execute a command, sending ^C as necessary to interrupt any running command if needed.
     *
     * *Note* This is not guaranteed to work as [shell integration](https://code.visualstudio.com/docs/terminal/shell-integration)
     * must be activated. Check whether {@link TerminalShellExecution.exitCode} is rejected to
     * verify whether it was successful.
     *
     * @param executable A command to run.
     * @param args Arguments to launch the executable with. The arguments will be escaped such
     * that they are interpreted as single arguments when the argument both contains whitespace
     * and does not include any single quote, double quote or backtick characters.
     *
     * Note that this escaping is not intended to be a security measure, be careful when passing
     * untrusted data to this API as strings like `$(...)` can often be used in shells to
     * execute code within a string.
     *
     * @example
     * // Execute a command in a terminal immediately after being created
     * const myTerm = window.createTerminal();
     * window.onDidChangeTerminalShellIntegration(async ({ terminal, shellIntegration }) => {
     *   if (terminal === myTerm) {
     *     const command = shellIntegration.executeCommand({
     *       command: 'echo',
     *       args: ['Hello world']
     *     });
     *     const code = await command.exitCode;
     *     console.log(`Command exited with code ${code}`);
     *   }
     * }));
     * // Fallback to sendText if there is no shell integration within 3 seconds of launching
     * setTimeout(() => {
     *   if (!myTerm.shellIntegration) {
     *     myTerm.sendText('echo "Hello world"');
     *     // Without shell integration, we can't know when the command has finished or what the
     *     // exit code was.
     *   }
     * }, 3000);
     *
     * @example
     * // Send command to terminal that has been alive for a while
     * const commandLine = 'echo "Hello world"';
     * if (term.shellIntegration) {
     *   const command = term.shellIntegration.executeCommand({
     *     command: 'echo',
     *     args: ['Hello world']
     *   });
     *   const code = await command.exitCode;
     *   console.log(`Command exited with code ${code}`);
     * } else {
     *   term.sendText(commandLine);
     *   // Without shell integration, we can't know when the command has finished or what the
     *   // exit code was.
     * }
     */
    fun executeCommand(
        executable: String,
        args: ReadonlyArray<String>,
    ): TerminalShellExecution
}
