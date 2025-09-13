// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * Value-object describing what options a virtual process terminal should use.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionTerminalOptions)
 */
@JsPlainObject
external interface ExtensionTerminalOptions {
    /**
     * A human-readable string which will be used to represent the terminal in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionTerminalOptions.name)
     */
    var name: String

    /**
     * An implementation of [Pseudoterminal] that allows an extension to
     * control a terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionTerminalOptions.pty)
     */
    var pty: Pseudoterminal

    /**
     * The icon path or [ThemeIcon] for the terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionTerminalOptions.iconPath)
     */
    var iconPath: IconPath?

    /**
     * The icon [ThemeColor] for the terminal.
     * The standard `terminal.ansi*` theme keys are
     * recommended for the best contrast and consistency across themes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionTerminalOptions.color)
     */
    var color: ThemeColor?

    /**
     * The [TerminalLocation] or [TerminalEditorLocationOptions] or [TerminalSplitLocationOptions] for the terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionTerminalOptions.location)
     */
    var location: JsAny /* TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions */?

    /**
     * Opt-out of the default terminal persistence on restart and reload.
     * This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionTerminalOptions.isTransient)
     */
    var isTransient: Boolean?

    /**
     * The nonce to use to verify shell integration sequences are coming from a trusted source.
     * An example impact of UX of this is if the command line is reported with a nonce, it will
     * not need to verify with the user that the command line is correct before rerunning it
     * via the [shell integration command decoration](https://code.visualstudio.com/docs/terminal/shell-integration#_command-decorations-and-the-overview-ruler).
     *
     * This should be used if the terminal includes [custom shell integration support](https://code.visualstudio.com/docs/terminal/shell-integration#_supported-escape-sequences).
     * It should be set to a random GUID. Inside the [Pseudoterminal] implementation, this value
     * can be passed through in the relevant sequences to make them trusted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionTerminalOptions.shellIntegrationNonce)
     */
    var shellIntegrationNonce: String?
}
