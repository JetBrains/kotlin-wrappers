// Automatically generated - do not modify!

package vscode

/**
 * A status bar item is a status bar contribution that can
 * show text and icons and run a command on click.
 */
external interface StatusBarItem {
    /**
     * The identifier of this item.
     *
     * *Note*: if no identifier was provided by the {@linkcode window.createStatusBarItem}
     * method, the identifier will match the {@link Extension.id extension identifier}.
     */
    val id: String

    /**
     * The alignment of this item.
     */
    val alignment: StatusBarAlignment

    /**
     * The priority of this item. Higher value means the item should
     * be shown more to the left.
     */
    val priority: Int?

    /**
     * The name of the entry, like 'Python Language Indicator', 'Git Status' etc.
     * Try to keep the length of the name short, yet descriptive enough that
     * users can understand what the status bar item is about.
     */
    var name: String?

    /**
     * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
     *
     * `My text $(icon-name) contains icons like $(icon-name) this one.`
     *
     * Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
     * `light-bulb`, `thumbsup`, `zap` etc.
     */
    var text: String

    /**
     * The tooltip text when you hover over this entry.
     */
    var tooltip: Any /* string | MarkdownString */?

    /**
     * The foreground color for this entry.
     */
    var color: Any /* string | ThemeColor */?

    /**
     * The background color for this entry.
     *
     * *Note*: only the following colors are supported:
     * * `new ThemeColor('statusBarItem.errorBackground')`
     * * `new ThemeColor('statusBarItem.warningBackground')`
     *
     * More background colors may be supported in the future.
     *
     * *Note*: when a background color is set, the statusbar may override
     * the `color` choice to ensure the entry is readable in all themes.
     */
    var backgroundColor: ThemeColor?

    /**
     * {@linkcode Command} or identifier of a command to run on click.
     *
     * The command must be {@link commands.getCommands known}.
     *
     * Note that if this is a {@linkcode Command} object, only the {@linkcode Command.command command} and {@linkcode Command.arguments arguments}
     * are used by the editor.
     */
    var command: Any /* string | Command */?

    /**
     * Accessibility information used when a screen reader interacts with this StatusBar item
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * Shows the entry in the status bar.
     */
//  show(): void

    /**
     * Hide the entry in the status bar.
     */
//  hide(): void

    /**
     * Dispose and free associated resources. Call
     * {@link StatusBarItem.hide hide}.
     */
//  dispose(): void
}
