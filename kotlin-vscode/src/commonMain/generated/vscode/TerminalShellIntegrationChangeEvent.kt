// Automatically generated - do not modify!

package vscode

/**
 * An event signalling that a terminal's shell integration has changed.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellIntegrationChangeEvent)
 */
external interface TerminalShellIntegrationChangeEvent {
    /**
     * The terminal that shell integration has been activated in.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellIntegrationChangeEvent.terminal)
     */
    val terminal: Terminal

    /**
     * The shell integration object.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalShellIntegrationChangeEvent.shellIntegration)
     */
    val shellIntegration: TerminalShellIntegration
}
