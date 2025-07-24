// Automatically generated - do not modify!

package vscode

import js.core.JsString
import js.objects.Record

/**
 * Value-object describing what options a terminal should use.
 */
external interface TerminalOptions {
    /**
     * A human-readable string which will be used to represent the terminal in the UI.
     */
    var name: String?

    /**
     * A path to a custom shell executable to be used in the terminal.
     */
    var shellPath: String?

    /**
     * Args for the custom shell executable. A string can be used on Windows only which allows
     * specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
     */
    var shellArgs: Any /* string[] | string */?

    /**
     * A path or Uri for the current working directory to be used for the terminal.
     */
    var cwd: Any /* string | Uri */?

    /**
     * Object with environment variables that will be added to the editor process.
     */
    var env: Record<JsString, Boolean?>?

    /**
     * Whether the terminal process environment should be exactly as provided in
     * `TerminalOptions.env`. When this is false (default), the environment will be based on the
     * window's environment and also apply configured platform settings like
     * `terminal.integrated.env.windows` on top. When this is true, the complete environment
     * must be provided as nothing will be inherited from the process or any configuration.
     */
    var strictEnv: Boolean?

    /**
     * When enabled the terminal will run the process as normal but not be surfaced to the user
     * until `Terminal.show` is called. The typical usage for this is when you need to run
     * something that may need interactivity but only want to tell the user about it when
     * interaction is needed. Note that the terminals will still be exposed to all extensions
     * as normal. The hidden terminals will not be restored when the workspace is next opened.
     */
    var hideFromUser: Boolean?

    /**
     * A message to write to the terminal on first launch, note that this is not sent to the
     * process but, rather written directly to the terminal. This supports escape sequences such
     * a setting text style.
     */
    var message: String?

    /**
     * The icon path or {@link ThemeIcon} for the terminal.
     */
    var iconPath: IconPath?

    /**
     * The icon {@link ThemeColor} for the terminal.
     * The `terminal.ansi*` theme keys are
     * recommended for the best contrast and consistency across themes.
     */
    var color: ThemeColor?

    /**
     * The {@link TerminalLocation} or {@link TerminalEditorLocationOptions} or {@link TerminalSplitLocationOptions} for the terminal.
     */
    var location: Any /* TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions */?

    /**
     * Opt-out of the default terminal persistence on restart and reload.
     * This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled.
     */
    var isTransient: Boolean?
}
