// Automatically generated - do not modify!

package web.dom

import js.core.JsLong

sealed external class NodeIterator {
    val filter: NodeFilter?
    val pointerBeforeReferenceNode: Boolean
    val referenceNode: Node
    val root: Node
    val whatToShow: JsLong
    fun nextNode(): Node?
    fun previousNode(): Node?
}
