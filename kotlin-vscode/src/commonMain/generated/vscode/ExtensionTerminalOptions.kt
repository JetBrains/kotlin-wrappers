// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Value-object describing what options a virtual process terminal should use.
 */
external interface ExtensionTerminalOptions {
    /**
     * A human-readable string which will be used to represent the terminal in the UI.
     */
    var name: String

    /**
     * An implementation of [Pseudoterminal] that allows an extension to
     * control a terminal.
     */
    var pty: Pseudoterminal

    /**
     * The icon path or [ThemeIcon] for the terminal.
     */
    var iconPath: IconPath?

    /**
     * The icon [ThemeColor] for the terminal.
     * The standard `terminal.ansi*` theme keys are
     * recommended for the best contrast and consistency across themes.
     */
    var color: ThemeColor?

    /**
     * The [TerminalLocation] or [TerminalEditorLocationOptions] or [TerminalSplitLocationOptions] for the terminal.
     */
    var location: JsAny /* TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions */?

    /**
     * Opt-out of the default terminal persistence on restart and reload.
     * This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled.
     */
    var isTransient: Boolean?
}
