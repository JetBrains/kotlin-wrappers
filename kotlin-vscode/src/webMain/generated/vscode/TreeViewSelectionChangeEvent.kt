// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.objects.JsPlainObject

/**
 * The event that is fired when there is a change in [tree view's selection][TreeView.selection]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeViewSelectionChangeEvent)
 */
@JsPlainObject
external interface TreeViewSelectionChangeEvent<T : JsAny?> {
    /**
     * Selected elements.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeViewSelectionChangeEvent.selection)
     */
    val selection: ReadonlyArray<T>
}
