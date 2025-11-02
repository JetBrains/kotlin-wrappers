// Automatically generated - do not modify!

package web.dom

/**
 * The **`TreeWalker`** object represents the nodes of a document subtree and a position within them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker)
 */
open external class TreeWalker
private constructor() {
    /**
     * The **`TreeWalker.currentNode`** property represents the Node which the TreeWalker is currently pointing at.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/currentNode)
     */
    var currentNode: Node

    /**
     * The **`TreeWalker.filter`** read-only property returns the NodeFilter associated with the TreeWalker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/filter)
     */
    val filter: NodeFilter?

    /**
     * The **`TreeWalker.root`** read-only property returns the root Node that the TreeWalker traverses.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/root)
     */
    val root: Node

    /**
     * The **`TreeWalker.whatToShow`** read-only property returns a bitmask that indicates the types of nodes to show. Non-matching nodes are skipped, but their children may be included, if relevant.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/whatToShow)
     */
    val whatToShow: Int

    /**
     * The **`TreeWalker.firstChild()`** method moves the current Node to the first visible child of the current node, and returns the found child. If no such child exists, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/firstChild)
     */
    fun firstChild(): Node?

    /**
     * The **`TreeWalker.lastChild()`** method moves the current Node to the last visible child of the current node, and returns the found child. If no such child exists, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/lastChild)
     */
    fun lastChild(): Node?

    /**
     * The **`TreeWalker.nextNode()`** method moves the current Node to the next visible node in the document order, and returns the found node. If no such node exists, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextNode)
     */
    fun nextNode(): Node?

    /**
     * The **`TreeWalker.nextSibling()`** method moves the current Node to its next sibling, if any, and returns the found sibling. If there is no such node, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextSibling)
     */
    fun nextSibling(): Node?

    /**
     * The **`TreeWalker.parentNode()`** method moves the current Node to the first visible ancestor node in the document order, and returns the found node. If no such node exists, or if it is above the TreeWalker's root node, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/parentNode)
     */
    fun parentNode(): Node?

    /**
     * The **`TreeWalker.previousNode()`** method moves the current Node to the previous visible node in the document order, and returns the found node. If no such node exists, or if it is before that the root node defined at the object construction, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousNode)
     */
    fun previousNode(): Node?

    /**
     * The **`TreeWalker.previousSibling()`** method moves the current Node to its previous sibling, if any, and returns the found sibling. If there is no such node, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousSibling)
     */
    fun previousSibling(): Node?
}
