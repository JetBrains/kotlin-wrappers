// Automatically generated - do not modify!

package vscode

import kotlin.js.JsAny

/**
 * A status bar item is a status bar contribution that can
 * show text and icons and run a command on click.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem)
 */
external interface StatusBarItem :
    DisposableLike {
    /**
     * The identifier of this item.
     *
     * *Note*: if no identifier was provided by the [window.createStatusBarItem]
     * method, the identifier will match the [extension identifier][Extension.id].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.id)
     */
    val id: String

    /**
     * The alignment of this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.alignment)
     */
    val alignment: StatusBarAlignment

    /**
     * The priority of this item. Higher value means the item should
     * be shown more to the left.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.priority)
     */
    val priority: Int?

    /**
     * The name of the entry, like 'Python Language Indicator', 'Git Status' etc.
     * Try to keep the length of the name short, yet descriptive enough that
     * users can understand what the status bar item is about.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.name)
     */
    var name: String?

    /**
     * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
     *
     * `My text $(icon-name) contains icons like $(icon-name) this one.`
     *
     * Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
     * `light-bulb`, `thumbsup`, `zap` etc.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.text)
     */
    var text: String

    /**
     * The tooltip text when you hover over this entry.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.tooltip)
     */
    var tooltip: JsAny /* string | MarkdownString */?

    /**
     * The foreground color for this entry.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.color)
     */
    var color: JsAny /* string | ThemeColor */?

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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.backgroundColor)
     */
    var backgroundColor: ThemeColor?

    /**
     * [Command] or identifier of a command to run on click.
     *
     * The command must be [known][commands.getCommands].
     *
     * Note that if this is a [Command] object, only the [command} and {@linkcode Command.arguments arguments][Command.command]
     * are used by the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.command)
     */
    var command: JsAny /* string | Command */?

    /**
     * Accessibility information used when a screen reader interacts with this StatusBar item
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.accessibilityInformation)
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * Shows the entry in the status bar.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.show)
     */
    fun show()

    /**
     * Hide the entry in the status bar.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.hide)
     */
    fun hide()

    /**
     * Dispose and free associated resources. Call
     * [hide][StatusBarItem.hide].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatusBarItem.dispose)
     */
    override fun dispose()
}
