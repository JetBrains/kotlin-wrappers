// Automatically generated - do not modify!

package web.dom

import js.core.ArrayLike
import js.core.JsIterable

sealed external class NodeList<T : Node> :
    ArrayLike<T>,
    JsIterable<T> {
    /** Returns the node with index index from the collection. The nodes are sorted in tree order. */
    fun item(index: Int): T?

    /**
     * Performs the specified action for each node in an list.
     * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the list.
     * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
     */
    fun forEach(action: (item: T) -> Unit)
}
