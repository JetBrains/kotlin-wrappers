// Automatically generated - do not modify!

package vscode

/**
 * An individual terminal instance within the integrated terminal.
 */
external interface Terminal {
    /**
    // ORIGINAL SOURCE


    /**
     * The name of the terminal.
    */
    readonly name: string;

    /**
     * The process ID of the shell process.
    */
    readonly processId: Thenable<number | undefined>;

    /**
     * The object used to initialize the terminal, this is useful for example to detecting the
     * shell type of when the terminal was not launched by this extension or for detecting what
     * folder the shell was launched in.
    */
    readonly creationOptions: Readonly<TerminalOptions | ExtensionTerminalOptions>;

    /**
     * The exit status of the terminal, this will be undefined while the terminal is active.
     *
     * **Example:** Show a notification with the exit code when the terminal exits with a
     * non-zero exit code.
     * ```typescript
     * window.onDidCloseTerminal(t => {
     *   if (t.exitStatus && t.exitStatus.code) {
     *   	vscode.window.showInformationMessage(`Exit code: ${t.exitStatus.code}`);
     *   }
     * });
     * ```
    */
    readonly exitStatus: TerminalExitStatus | undefined;

    /**
     * The current state of the {@link Terminal}.
    */
    readonly state: TerminalState;

    /**
     * An object that contains [shell integration](https://code.visualstudio.com/docs/terminal/shell-integration)-powered
     * features for the terminal. This will always be `undefined` immediately after the terminal
     * is created. Listen to {@link window.onDidChangeTerminalShellIntegration} to be notified
     * when shell integration is activated for a terminal.
     *
     * Note that this object may remain undefined if shell integration never activates. For
     * example Command Prompt does not support shell integration and a user's shell setup could
     * conflict with the automatic shell integration activation.
    */
    readonly shellIntegration: TerminalShellIntegration | undefined;

    /**
     * Send text to the terminal. The text is written to the stdin of the underlying pty process
     * (shell) of the terminal.
     *
     * @param text The text to send.
     * @param shouldExecute Indicates that the text being sent should be executed rather than just inserted in the terminal.
     * The character(s) added are `\n` or `\r\n`, depending on the platform. This defaults to `true`.
    */
    sendText(text: string, shouldExecute?: boolean): void;

    /**
     * Show the terminal panel and reveal this terminal in the UI.
     *
     * @param preserveFocus When `true` the terminal will not take focus.
    */
    show(preserveFocus?: boolean): void;

    /**
     * Hide the terminal panel if this terminal is currently showing.
    */
    hide(): void;

    /**
     * Dispose and free associated resources.
    */
    dispose(): void;

    // ORIGINAL SOURCE
     **/
}
