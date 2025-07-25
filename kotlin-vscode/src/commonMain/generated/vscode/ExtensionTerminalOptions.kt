// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.objects.JsPlainObject

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
}
