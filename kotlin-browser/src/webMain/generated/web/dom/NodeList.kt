// Automatically generated - do not modify!

package web.dom

import js.collections.ListLike

/**
 * **`NodeList`** objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as document.querySelectorAll().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList)
 */
abstract /* open */
external class NodeList<T : Node>
private constructor() :
    ListLike<T> {
    /**
     * Returns a node from a NodeList by index. This method doesn't throw exceptions as long as you provide arguments. A value of null is returned if the index is out of range, and a TypeError is thrown if no argument is provided.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList/item)
     */
    fun item(index: Int): T?
}
