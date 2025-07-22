// Automatically generated - do not modify!

package vscode

/**
 * An event signalling that a terminal's shell integration has changed.
 */
external interface TerminalShellIntegrationChangeEvent {
    /**
     * The terminal that shell integration has been activated in.
     */
    val terminal: Terminal

    /**
     * The shell integration object.
     */
    val shellIntegration: TerminalShellIntegration
}
