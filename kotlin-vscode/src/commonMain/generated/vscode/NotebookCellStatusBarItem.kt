// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A contribution to a cell's status bar
 */
open external class NotebookCellStatusBarItem {
    /**
     * The text to show for the item.
     */
    var text: String

    /**
     * Whether the item is aligned to the left or right.
     */
    var alignment: NotebookCellStatusBarAlignment

    /**
     * An optional {@linkcode Command} or identifier of a command to run on click.
     *
     * The command must be {@link commands.getCommands known}.
     *
     * Note that if this is a {@linkcode Command} object, only the {@linkcode Command.command command} and {@linkcode Command.arguments arguments}
     * are used by the editor.
     */
    var command: Any /* string | Command */?

    /**
     * A tooltip to show when the item is hovered.
     */
    var tooltip: String?

    /**
     * The priority of the item. A higher value item will be shown more to the left.
     */
    var priority: Int?

    /**
     * Accessibility information used when a screen reader interacts with this item.
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * Creates a new NotebookCellStatusBarItem.
     * @param text The text to show for the item.
     * @param alignment Whether the item is aligned to the left or right.
     */
//  constructor(text: string, alignment: NotebookCellStatusBarAlignment)
}
