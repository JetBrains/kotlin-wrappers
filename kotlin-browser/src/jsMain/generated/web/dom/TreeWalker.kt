// Automatically generated - do not modify!

package web.dom

import js.core.JsLong

sealed external class TreeWalker {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/currentNode) */
    var currentNode: Node

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/filter) */
    val filter: NodeFilter?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/root) */
    val root: Node

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/whatToShow) */
    val whatToShow: JsLong

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/firstChild) */
    fun firstChild(): Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/lastChild) */
    fun lastChild(): Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextNode) */
    fun nextNode(): Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextSibling) */
    fun nextSibling(): Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/parentNode) */
    fun parentNode(): Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousNode) */
    fun previousNode(): Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousSibling) */
    fun previousSibling(): Node?
}
