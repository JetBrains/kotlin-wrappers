// Automatically generated - do not modify!

package web.dom

import web.geometry.DOMRect
import web.geometry.DOMRectList

sealed external class Range :
    AbstractRange {
    /** Returns the node, furthest away from the document, that is an ancestor of both range's start node and end node. */
    val commonAncestorContainer: Node
    fun cloneContents(): DocumentFragment
    fun cloneRange(): Range
    fun collapse(toStart: Boolean = definedExternally)
    fun compareBoundaryPoints(
        how: Number,
        sourceRange: Range,
    ): Number

    /** Returns −1 if the point is before the range, 0 if the point is in the range, and 1 if the point is after the range. */
    fun comparePoint(
        node: Node,
        offset: Number,
    ): Number

    fun createContextualFragment(fragment: String): DocumentFragment
    fun deleteContents()
    fun detach()
    fun extractContents(): DocumentFragment
    fun getBoundingClientRect(): DOMRect
    fun getClientRects(): DOMRectList
    fun insertNode(node: Node)

    /** Returns whether range intersects node. */
    fun intersectsNode(node: Node): Boolean
    fun isPointInRange(
        node: Node,
        offset: Number,
    ): Boolean

    fun selectNode(node: Node)
    fun selectNodeContents(node: Node)
    fun setEnd(
        node: Node,
        offset: Number,
    )

    fun setEndAfter(node: Node)
    fun setEndBefore(node: Node)
    fun setStart(
        node: Node,
        offset: Number,
    )

    fun setStartAfter(node: Node)
    fun setStartBefore(node: Node)
    fun surroundContents(newParent: Node)
    val END_TO_END: Short
    val END_TO_START: Short
    val START_TO_END: Short
    val START_TO_START: Short

    companion object {
        val END_TO_END: Short
        val END_TO_START: Short
        val START_TO_END: Short
        val START_TO_START: Short
    }
}
