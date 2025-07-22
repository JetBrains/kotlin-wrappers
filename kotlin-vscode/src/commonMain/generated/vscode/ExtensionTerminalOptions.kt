// Automatically generated - do not modify!

package vscode

/**
 * Value-object describing what options a virtual process terminal should use.
 */
external interface ExtensionTerminalOptions {
    /**
     * A human-readable string which will be used to represent the terminal in the UI.
     */
//  name: string

    /**
     * An implementation of {@link Pseudoterminal} that allows an extension to
     * control a terminal.
     */
//  pty: Pseudoterminal

    /**
     * The icon path or {@link ThemeIcon} for the terminal.
     */
//  iconPath?: IconPath

    /**
     * The icon {@link ThemeColor} for the terminal.
     * The standard `terminal.ansi*` theme keys are
     * recommended for the best contrast and consistency across themes.
     */
//  color?: ThemeColor

    /**
     * The {@link TerminalLocation} or {@link TerminalEditorLocationOptions} or {@link TerminalSplitLocationOptions} for the terminal.
     */
//  location?: TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions

    /**
     * Opt-out of the default terminal persistence on restart and reload.
     * This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled.
     */
//  isTransient?: boolean
}
