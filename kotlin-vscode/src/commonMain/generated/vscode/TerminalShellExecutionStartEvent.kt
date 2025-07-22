// Automatically generated - do not modify!

package vscode

/**
 * An event signalling that an execution has started in a terminal.
 */
external interface TerminalShellExecutionStartEvent {
    /**
    // ORIGINAL SOURCE

    /**
     * The terminal that shell integration has been activated in.
    */
    readonly terminal: Terminal;

    /**
     * The shell integration object.
    */
    readonly shellIntegration: TerminalShellIntegration;

    /**
     * The terminal shell execution that has ended.
    */
    readonly execution: TerminalShellExecution;

    // ORIGINAL SOURCE
     **/
}
