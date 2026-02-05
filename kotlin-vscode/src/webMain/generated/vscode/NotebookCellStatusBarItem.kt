// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * A contribution to a cell's status bar
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItem)
 */
open external class NotebookCellStatusBarItem {
    /**
     * The text to show for the item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItem.text)
     */
    var text: String

    /**
     * Whether the item is aligned to the left or right.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItem.alignment)
     */
    var alignment: NotebookCellStatusBarAlignment

    /**
     * An optional [Command] or identifier of a command to run on click.
     *
     * The command must be [known][commands.getCommands].
     *
     * Note that if this is a [Command] object, only the [command} and {@linkcode Command.arguments arguments][Command.command]
     * are used by the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItem.command)
     */
    var command: JsAny /* string | Command */?

    /**
     * A tooltip to show when the item is hovered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItem.tooltip)
     */
    var tooltip: String?

    /**
     * The priority of the item. A higher value item will be shown more to the left.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItem.priority)
     */
    var priority: Int?

    /**
     * Accessibility information used when a screen reader interacts with this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItem.accessibilityInformation)
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * Creates a new NotebookCellStatusBarItem.
     * @param text The text to show for the item.
     * @param alignment Whether the item is aligned to the left or right.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItem.constructor)
     */
    constructor(
        text: String,
        alignment: NotebookCellStatusBarAlignment,
    )
}
