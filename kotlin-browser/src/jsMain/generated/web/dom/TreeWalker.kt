// Automatically generated - do not modify!

package web.dom

/**
 * The nodes of a document subtree and a position within them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker)
 */
external class TreeWalker
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/currentNode)
     */
    var currentNode: Node

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/filter)
     */
    val filter: NodeFilter?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/root)
     */
    val root: Node

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/whatToShow)
     */
    val whatToShow: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/firstChild)
     */
    fun firstChild(): Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/lastChild)
     */
    fun lastChild(): Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextNode)
     */
    fun nextNode(): Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextSibling)
     */
    fun nextSibling(): Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/parentNode)
     */
    fun parentNode(): Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousNode)
     */
    fun previousNode(): Node?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousSibling)
     */
    fun previousSibling(): Node?
}
