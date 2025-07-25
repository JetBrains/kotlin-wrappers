// Automatically generated - do not modify!

package vscode

/**
 * Represents how a terminal exited.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalExitStatus)
 */
external interface TerminalExitStatus {
    /**
     * The exit code that a terminal exited with, it can have the following values:
     * - Zero: the terminal process or custom execution succeeded.
     * - Non-zero: the terminal process or custom execution failed.
     * - `undefined`: the user forcibly closed the terminal or a custom execution exited
     *   without providing an exit code.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalExitStatus.code)
     */
    val code: Int?

    /**
     * The reason that triggered the exit of a terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalExitStatus.reason)
     */
    val reason: TerminalExitReason
}
