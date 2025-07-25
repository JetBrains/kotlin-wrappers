// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event describing changes to tab groups.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroupChangeEvent)
 */
external interface TabGroupChangeEvent {
    /**
     * Tab groups that have been opened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroupChangeEvent.opened)
     */
    val opened: ReadonlyArray<TabGroup>

    /**
     * Tab groups that have been closed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroupChangeEvent.closed)
     */
    val closed: ReadonlyArray<TabGroup>

    /**
     * Tab groups that have changed, e.g have changed
     * their [active][TabGroup.isActive] state.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroupChangeEvent.changed)
     */
    val changed: ReadonlyArray<TabGroup>
}
