// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Provides information on a line in a terminal in order to provide links for it.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLinkContext)
 */
@JsPlainObject
external interface TerminalLinkContext {
    /**
     * This is the text from the unwrapped line in the terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLinkContext.line)
     */
    var line: String

    /**
     * The terminal the link belongs to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLinkContext.terminal)
     */
    var terminal: Terminal
}
