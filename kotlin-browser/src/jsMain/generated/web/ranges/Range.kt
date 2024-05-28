// Automatically generated - do not modify!

package web.ranges

import web.dom.DocumentFragment
import web.dom.Node
import web.geometry.DOMRect
import web.geometry.DOMRectList

/**
 * A fragment of a document that can contain nodes and parts of text nodes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range)
 */
external class Range :
    AbstractRange {
    /**
     * Returns the node, furthest away from the document, that is an ancestor of both range's start node and end node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/commonAncestorContainer)
     */
    val commonAncestorContainer: Node

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/cloneContents)
     */
    fun cloneContents(): DocumentFragment

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/cloneRange)
     */
    fun cloneRange(): Range

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/collapse)
     */
    fun collapse(toStart: Boolean = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/compareBoundaryPoints)
     */
    fun compareBoundaryPoints(
        how: CompareMethod,
        sourceRange: Range,
    ): Short

    /**
     * Returns −1 if the point is before the range, 0 if the point is in the range, and 1 if the point is after the range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/comparePoint)
     */
    fun comparePoint(
        node: Node,
        offset: Int,
    ): Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/createContextualFragment)
     */
    fun createContextualFragment(string: String): DocumentFragment

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/deleteContents)
     */
    fun deleteContents()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/detach)
     */
    fun detach()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/extractContents)
     */
    fun extractContents(): DocumentFragment

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/getBoundingClientRect)
     */
    fun getBoundingClientRect(): DOMRect

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/getClientRects)
     */
    fun getClientRects(): DOMRectList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/insertNode)
     */
    fun insertNode(node: Node)

    /**
     * Returns whether range intersects node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/intersectsNode)
     */
    fun intersectsNode(node: Node): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/isPointInRange)
     */
    fun isPointInRange(
        node: Node,
        offset: Int,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/selectNode)
     */
    fun selectNode(node: Node)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/selectNodeContents)
     */
    fun selectNodeContents(node: Node)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEnd)
     */
    fun setEnd(
        node: Node,
        offset: Int,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEndAfter)
     */
    fun setEndAfter(node: Node)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEndBefore)
     */
    fun setEndBefore(node: Node)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStart)
     */
    fun setStart(
        node: Node,
        offset: Int,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStartAfter)
     */
    fun setStartAfter(node: Node)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStartBefore)
     */
    fun setStartBefore(node: Node)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/surroundContents)
     */
    fun surroundContents(newParent: Node)
    val START_TO_START: CompareMethod
    val START_TO_END: CompareMethod
    val END_TO_END: CompareMethod
    val END_TO_START: CompareMethod

    companion object {
        val START_TO_START: CompareMethod
        val START_TO_END: CompareMethod
        val END_TO_END: CompareMethod
        val END_TO_START: CompareMethod
    }

    sealed interface CompareMethod
}
