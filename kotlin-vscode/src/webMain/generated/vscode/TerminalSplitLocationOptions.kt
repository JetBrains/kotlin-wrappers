// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Uses the parent [Terminal]'s location for the terminal
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalSplitLocationOptions)
 */
@JsPlainObject
external interface TerminalSplitLocationOptions {
    /**
     * The parent terminal to split this terminal beside. This works whether the parent terminal
     * is in the panel or the editor area.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalSplitLocationOptions.parentTerminal)
     */
    var parentTerminal: Terminal
}
