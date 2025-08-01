// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.core.JsInt
import js.promise.PromiseLike
import kotlin.js.definedExternally

/**
 * An individual terminal instance within the integrated terminal.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal)
 */
external interface Terminal :
    DisposableLike {
    /**
     * The name of the terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.name)
     */
    val name: String

    /**
     * The process ID of the shell process.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.processId)
     */
    val processId: PromiseLike<JsInt?>

    /**
     * The object used to initialize the terminal, this is useful for example to detecting the
     * shell type of when the terminal was not launched by this extension or for detecting what
     * folder the shell was launched in.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.creationOptions)
     */
    val creationOptions: JsAny /* Readonly<TerminalOptions | ExtensionTerminalOptions> */

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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.exitStatus)
     */
    val exitStatus: TerminalExitStatus?

    /**
     * The current state of the [Terminal].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.state)
     */
    val state: TerminalState

    /**
     * An object that contains [shell integration](https://code.visualstudio.com/docs/terminal/shell-integration)-powered
     * features for the terminal. This will always be `undefined` immediately after the terminal
     * is created. Listen to [window.onDidChangeTerminalShellIntegration] to be notified
     * when shell integration is activated for a terminal.
     *
     * Note that this object may remain undefined if shell integration never activates. For
     * example Command Prompt does not support shell integration and a user's shell setup could
     * conflict with the automatic shell integration activation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.shellIntegration)
     */
    val shellIntegration: TerminalShellIntegration?

    /**
     * Send text to the terminal. The text is written to the stdin of the underlying pty process
     * (shell) of the terminal.
     *
     * @param text The text to send.
     * @param shouldExecute Indicates that the text being sent should be executed rather than just inserted in the terminal.
     * The character(s) added are `\n` or `\r\n`, depending on the platform. This defaults to `true`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.sendText)
     */
    fun sendText(
        text: String,
        shouldExecute: Boolean = definedExternally,
    )

    /**
     * Show the terminal panel and reveal this terminal in the UI.
     *
     * @param preserveFocus When `true` the terminal will not take focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.show)
     */
    fun show(preserveFocus: Boolean = definedExternally)

    /**
     * Hide the terminal panel if this terminal is currently showing.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.hide)
     */
    fun hide()

    /**
     * Dispose and free associated resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Terminal.dispose)
     */
    override fun dispose()
}
