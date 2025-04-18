// Automatically generated - do not modify!

package web.dom

/**
 * The **`NodeIterator`** interface represents an iterator to traverse nodes of a DOM subtree in document order.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator)
 */
external class NodeIterator
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/filter)
     */
    val filter: NodeFilter?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/pointerBeforeReferenceNode)
     */
    val pointerBeforeReferenceNode: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/referenceNode)
     */
    val referenceNode: Node

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/root)
     */
    val root: Node

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/whatToShow)
     */
    val whatToShow: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/nextNode)
     */
    fun nextNode(): Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/previousNode)
     */
    fun previousNode(): Node?
}
