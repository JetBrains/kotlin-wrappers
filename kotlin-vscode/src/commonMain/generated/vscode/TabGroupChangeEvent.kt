// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event describing changes to tab groups.
 */
external interface TabGroupChangeEvent {
    /**
     * Tab groups that have been opened.
     */
    val opened: ReadonlyArray<TabGroup>

    /**
     * Tab groups that have been closed.
     */
    val closed: ReadonlyArray<TabGroup>

    /**
     * Tab groups that have changed, e.g have changed
     * their [active][TabGroup.isActive] state.
     */
    val changed: ReadonlyArray<TabGroup>
}
