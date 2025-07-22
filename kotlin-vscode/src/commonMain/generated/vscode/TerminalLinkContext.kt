// Automatically generated - do not modify!

package vscode

/**
 * Provides information on a line in a terminal in order to provide links for it.
 */
external interface TerminalLinkContext {
    /**
     * This is the text from the unwrapped line in the terminal.
     */
    var line: String

    /**
     * The terminal the link belongs to.
     */
    var terminal: Terminal
}
