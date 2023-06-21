// Automatically generated - do not modify!

package web.dom

import js.collections.ListLike

sealed external class NodeList<T : Node> :
    ListLike<T> {
    /**
     * Returns the node with index index from the collection. The nodes are sorted in tree order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList/item)
     */
    fun item(index: Int): T?
}
