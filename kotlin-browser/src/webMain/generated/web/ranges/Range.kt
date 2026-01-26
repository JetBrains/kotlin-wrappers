// Automatically generated - do not modify!

package web.ranges

import web.dom.DocumentFragment
import web.dom.Node
import web.geometry.DOMRect
import web.geometry.DOMRectList
import web.trustedtypes.TrustedHTML
import kotlin.js.definedExternally

/**
 * The **`Range`** interface represents a fragment of a document that can contain nodes and parts of text nodes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range)
 */
open external class Range :
    AbstractRange {
    /**
     * The **`Range.commonAncestorContainer`** read-only property returns the deepest — or furthest down the document tree — Node that contains both boundary points of the Range. This means that if startContainer and endContainer both refer to the same node, this node is the common ancestor container.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/commonAncestorContainer)
     */
    val commonAncestorContainer: Node

    /**
     * The **`cloneContents()`** method of the Range interface copies the selected Node children of the range's commonAncestorContainer and puts them in a new DocumentFragment object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/cloneContents)
     */
    fun cloneContents(): DocumentFragment

    /**
     * The **`Range.cloneRange()`** method returns a Range object with boundary points identical to the cloned Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/cloneRange)
     */
    fun cloneRange(): Range

    /**
     * The **`collapse()`** method of the Range interface collapses the Range to one of its boundary points.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/collapse)
     */
    fun collapse(toStart: Boolean = definedExternally)

    /**
     * The **`compareBoundaryPoints()`** method of the Range interface compares the boundary points of the Range with those of another range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/compareBoundaryPoints)
     */
    fun compareBoundaryPoints(
        how: CompareMethod,
        sourceRange: Range,
    ): Short

    /**
     * The **`comparePoint()`** method of the Range interface determines whether a specified point is before, within, or after the Range. The point is specified by a reference node and an offset within that node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/comparePoint)
     */
    fun comparePoint(
        node: Node,
        offset: Int,
    ): Short

    /**
     * The **`Range.createContextualFragment()`** method of the Range interface returns a DocumentFragment representing the parsed input HTML or XML.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/createContextualFragment)
     */
    fun createContextualFragment(string: TrustedHTML): DocumentFragment
    fun createContextualFragment(string: String): DocumentFragment

    /**
     * The **`Range.deleteContents()`** method removes all completely-selected nodes within this range from the document. For the partially selected nodes at the start or end of the range, only the selected portion of the text is deleted, while the node itself remains intact. Afterwards, the range is collapsed to the end of the last selected node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/deleteContents)
     */
    fun deleteContents()

    /**
     * The **`Range.detach()`** method does nothing. It used to disable the Range object and enable the browser to release associated resources. The method has been kept for compatibility.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/detach)
     */
    fun detach()

    /**
     * The **`extractContents()`** method of the Range interface is similar to a combination of Range.cloneContents() and Range.deleteContents(). It removes the child Nodes of the range from the document, clones them, and returns them as a new DocumentFragment object. For partially selected nodes, only the selected text is deleted, but all containing parent nodes up to the common ancestor are cloned as well, resulting in two copies of these nodes, one in the original document and one in the extracted fragment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/extractContents)
     */
    fun extractContents(): DocumentFragment

    /**
     * The **`Range.getBoundingClientRect()`** method returns a DOMRect object that bounds the contents of the range; this is a rectangle enclosing the union of the bounding rectangles for all the elements in the range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/getBoundingClientRect)
     */
    fun getBoundingClientRect(): DOMRect

    /**
     * The **`Range.getClientRects()`** method returns a list of DOMRect objects representing the area of the screen occupied by the range. This is created by aggregating the results of calls to Element.getClientRects() for all the elements in the range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/getClientRects)
     */
    fun getClientRects(): DOMRectList

    /**
     * The **`Range.insertNode()`** method inserts a node at the start of the Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/insertNode)
     */
    fun insertNode(node: Node)

    /**
     * The **`Range.intersectsNode()`** method returns a boolean indicating whether the given Node intersects the Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/intersectsNode)
     */
    fun intersectsNode(node: Node): Boolean

    /**
     * The **`isPointInRange()`** method of the Range interface determines whether a specified point is within the Range. The point is specified by a reference node and an offset within that node. It is equivalent to calling Range.comparePoint() and checking if the result is 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/isPointInRange)
     */
    fun isPointInRange(
        node: Node,
        offset: Int,
    ): Boolean

    /**
     * The **`Range.selectNode()`** method sets the Range to contain the Node and its contents. The parent Node of the start and end of the Range will be the same as the parent of the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/selectNode)
     */
    fun selectNode(node: Node)

    /**
     * The **`Range.selectNodeContents()`** method sets the Range to contain the contents of a Node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/selectNodeContents)
     */
    fun selectNodeContents(node: Node)

    /**
     * The **`Range.setEnd()`** method sets the end position of a Range to be located at the given offset into the specified node. Setting the end point above (higher in the document) than the start point will result in a collapsed range with the start and end points both set to the specified end position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEnd)
     */
    fun setEnd(
        node: Node,
        offset: Int,
    )

    /**
     * The **`Range.setEndAfter()`** method sets the end position of a Range relative to another Node. The parent Node of end of the Range will be the same as that for the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEndAfter)
     */
    fun setEndAfter(node: Node)

    /**
     * The **`Range.setEndBefore()`** method sets the end position of a Range relative to another Node. The parent Node of end of the Range will be the same as that for the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEndBefore)
     */
    fun setEndBefore(node: Node)

    /**
     * The **`Range.setStart()`** method sets the start position of a Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStart)
     */
    fun setStart(
        node: Node,
        offset: Int,
    )

    /**
     * The **`Range.setStartAfter()`** method sets the start position of a Range relative to a Node. The parent Node of the start of the Range will be the same as that for the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStartAfter)
     */
    fun setStartAfter(node: Node)

    /**
     * The **`Range.setStartBefore()`** method sets the start position of a Range relative to another Node. The parent Node of the start of the Range will be the same as that for the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStartBefore)
     */
    fun setStartBefore(node: Node)

    /**
     * The **`surroundContents()`** method of the Range interface surrounds the selected content by a provided node. It extracts the contents of the range, replaces the children of newParent with the extracted contents, inserts newParent at the location of the extracted contents, and makes the range select newParent.
     *
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
