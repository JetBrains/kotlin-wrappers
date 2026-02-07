// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * An event describing change to tabs.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabChangeEvent)
 */
@JsPlainObject
external interface TabChangeEvent {
    /**
     * The tabs that have been opened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabChangeEvent.opened)
     */
    val opened: ReadonlyArray<Tab>

    /**
     * The tabs that have been closed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabChangeEvent.closed)
     */
    val closed: ReadonlyArray<Tab>

    /**
     * Tabs that have changed, e.g have changed
     * their [active][Tab.isActive] state.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabChangeEvent.changed)
     */
    val changed: ReadonlyArray<Tab>
}
