// Automatically generated - do not modify!

package dom

sealed external class TreeWalker {
    var currentNode: Node
    val filter: NodeFilter?
    val root: Node
    val whatToShow: Number
    fun firstChild(): Node?
    fun lastChild(): Node?
    fun nextNode(): Node?
    fun nextSibling(): Node?
    fun parentNode(): Node?
    fun previousNode(): Node?
    fun previousSibling(): Node?
}
