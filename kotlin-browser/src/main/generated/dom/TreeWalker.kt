// Automatically generated - do not modify!

package dom

import kotlinx.js.JsLong

sealed external class TreeWalker {
    var currentNode: Node
    val filter: NodeFilter?
    val root: Node
    val whatToShow: JsLong
    fun firstChild(): Node?
    fun lastChild(): Node?
    fun nextNode(): Node?
    fun nextSibling(): Node?
    fun parentNode(): Node?
    fun previousNode(): Node?
    fun previousSibling(): Node?
}
