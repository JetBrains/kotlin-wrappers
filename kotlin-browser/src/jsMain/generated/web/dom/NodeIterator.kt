// Automatically generated - do not modify!

package web.dom

import js.core.JsLong

/**
 * An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator)
 */
sealed external class NodeIterator {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/filter) */
    val filter: NodeFilter?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/pointerBeforeReferenceNode) */
    val pointerBeforeReferenceNode: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/referenceNode) */
    val referenceNode: Node

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/root) */
    val root: Node

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/whatToShow) */
    val whatToShow: JsLong

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/nextNode) */
    fun nextNode(): Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/previousNode) */
    fun previousNode(): Node?
}
