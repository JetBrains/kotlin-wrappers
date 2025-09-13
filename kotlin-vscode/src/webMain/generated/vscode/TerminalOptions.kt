// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject
import js.objects.Record
import kotlin.js.JsAny
import kotlin.js.JsBoolean
import kotlin.js.JsString

/**
 * Value-object describing what options a terminal should use.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions)
 */
@JsPlainObject
external interface TerminalOptions {
    /**
     * A human-readable string which will be used to represent the terminal in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.name)
     */
    var name: String?

    /**
     * A path to a custom shell executable to be used in the terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.shellPath)
     */
    var shellPath: String?

    /**
     * Args for the custom shell executable. A string can be used on Windows only which allows
     * specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.shellArgs)
     */
    var shellArgs: JsAny /* string[] | string */?

    /**
     * A path or Uri for the current working directory to be used for the terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.cwd)
     */
    var cwd: JsAny /* string | Uri */?

    /**
     * Object with environment variables that will be added to the editor process.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.env)
     */
    var env: Record<JsString, JsBoolean?>?

    /**
     * Whether the terminal process environment should be exactly as provided in
     * `TerminalOptions.env`. When this is false (default), the environment will be based on the
     * window's environment and also apply configured platform settings like
     * `terminal.integrated.env.windows` on top. When this is true, the complete environment
     * must be provided as nothing will be inherited from the process or any configuration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.strictEnv)
     */
    var strictEnv: Boolean?

    /**
     * When enabled the terminal will run the process as normal but not be surfaced to the user
     * until `Terminal.show` is called. The typical usage for this is when you need to run
     * something that may need interactivity but only want to tell the user about it when
     * interaction is needed. Note that the terminals will still be exposed to all extensions
     * as normal. The hidden terminals will not be restored when the workspace is next opened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.hideFromUser)
     */
    var hideFromUser: Boolean?

    /**
     * A message to write to the terminal on first launch, note that this is not sent to the
     * process but, rather written directly to the terminal. This supports escape sequences such
     * a setting text style.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.message)
     */
    var message: String?

    /**
     * The icon path or [ThemeIcon] for the terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.iconPath)
     */
    var iconPath: IconPath?

    /**
     * The icon [ThemeColor] for the terminal.
     * The `terminal.ansi*` theme keys are
     * recommended for the best contrast and consistency across themes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.color)
     */
    var color: ThemeColor?

    /**
     * The [TerminalLocation] or [TerminalEditorLocationOptions] or [TerminalSplitLocationOptions] for the terminal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.location)
     */
    var location: JsAny /* TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions */?

    /**
     * Opt-out of the default terminal persistence on restart and reload.
     * This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.isTransient)
     */
    var isTransient: Boolean?

    /**
     * The nonce to use to verify shell integration sequences are coming from a trusted source.
     * An example impact of UX of this is if the command line is reported with a nonce, it will
     * not need to verify with the user that the command line is correct before rerunning it
     * via the [shell integration command decoration](https://code.visualstudio.com/docs/terminal/shell-integration#_command-decorations-and-the-overview-ruler).
     *
     * This should be used if the terminal includes [custom shell integration support](https://code.visualstudio.com/docs/terminal/shell-integration#_supported-escape-sequences).
     * It should be set to a random GUID which will then set the `VSCODE_NONCE` environment
     * variable. Inside the shell, this should then be removed from the environment so as to
     * protect it from general access. Once that is done it can be passed through in the
     * relevant sequences to make them trusted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalOptions.shellIntegrationNonce)
     */
    var shellIntegrationNonce: String?
}
