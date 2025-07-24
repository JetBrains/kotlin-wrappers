// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny

/**
 * The event that is fired when there is a change in {@link TreeView.selection tree view's selection}
 */
external interface TreeViewSelectionChangeEvent<T : JsAny?> {
    /**
     * Selected elements.
     */
    val selection: ReadonlyArray<T>
}
