// Automatically generated - do not modify!

package dom

sealed external class NodeIterator {
    val filter: NodeFilter?
    val pointerBeforeReferenceNode: Boolean
    val referenceNode: Node
    val root: Node
    val whatToShow: Number
    fun nextNode(): Node?
    fun previousNode(): Node?
}
