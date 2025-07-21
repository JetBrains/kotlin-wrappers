// Automatically generated - do not modify!

package web.dom

/**
 * The **`NodeIterator`** interface represents an iterator to traverse nodes of a DOM subtree in document order.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator)
 */
open external class NodeIterator
private constructor() {
    /**
     * The **`NodeIterator.filter`** read-only property returns a `NodeFilter` object, that is an object which implements an `acceptNode(node)` method, used to screen nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/filter)
     */
    val filter: NodeFilter?

    /**
     * The **`NodeIterator.pointerBeforeReferenceNode`** read-only property returns a boolean flag that indicates whether the `NodeFilter` is anchored before (if this value is `true`) or after (if this value is `false`) the anchor node indicated by the NodeIterator.referenceNode property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/pointerBeforeReferenceNode)
     */
    val pointerBeforeReferenceNode: Boolean

    /**
     * The **`NodeIterator.referenceNode`** read-only property returns the Node to which the iterator is anchored; as new nodes are inserted, the iterator remains anchored to the reference node as specified by this property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/referenceNode)
     */
    val referenceNode: Node

    /**
     * The **`NodeIterator.root`** read-only property represents the Node that is the root of what the NodeIterator traverses.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/root)
     */
    val root: Node

    /**
     * The **`NodeIterator.whatToShow`** read-only property represents an `unsigned integer` representing a bitmask signifying what types of nodes should be returned by the NodeIterator.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/whatToShow)
     */
    val whatToShow: Int

    /**
     * The **`NodeIterator.nextNode()`** method returns the next node in the set represented by the NodeIterator and advances the position of the iterator within the set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/nextNode)
     */
    fun nextNode(): Node?

    /**
     * The **`NodeIterator.previousNode()`** method returns the previous node in the set represented by the NodeIterator and moves the position of the iterator backwards within the set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/previousNode)
     */
    fun previousNode(): Node?
}
