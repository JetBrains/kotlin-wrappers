// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsAny
import js.objects.JsPlainObject

/**
 * An event describing the change in a tree item's checkbox state.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeCheckboxChangeEvent)
 */
@JsPlainObject
external interface TreeCheckboxChangeEvent<T : JsAny?> {
    /**
     * The items that were checked or unchecked.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeCheckboxChangeEvent.items)
     */
    val items: ReadonlyArray<Tuple2<T, TreeItemCheckboxState>>
}
