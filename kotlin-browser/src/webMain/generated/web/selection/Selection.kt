// Automatically generated - do not modify!

package web.selection

import js.array.ReadonlyArray
import web.dom.Node
import web.ranges.Range
import web.ranges.StaticRange
import kotlin.js.definedExternally

/**
 * A **`Selection`** object represents the range of text selected by the user or the current position of the caret. Each document is associated with a unique selection object, which can be retrieved by document.getSelection() or window.getSelection() and then be examined and modified.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection)
 */
open external class Selection
private constructor() {
    /**
     * The **`Selection.anchorNode`** read-only property returns the Node in which the selection begins. It can return null if selection never existed in the document (e.g., an iframe that was never clicked on, or the node belongs to another document tree).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/anchorNode)
     */
    val anchorNode: Node?

    /**
     * The **`Selection.anchorOffset`** read-only property returns the number of characters that the selection's anchor is offset within the Selection.anchorNode if said node is of type Text, CDATASection or Comment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/anchorOffset)
     */
    val anchorOffset: Int

    /**
     * The **`direction`** read-only property of the Selection interface is a string that provides the direction of the current selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/direction)
     */
    val direction: String

    /**
     * The **`Selection.focusNode`** read-only property returns the Node in which the selection ends. It can return null if selection never existed in the document (e.g., an iframe that was never clicked on, or the node belongs to another document tree).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/focusNode)
     */
    val focusNode: Node?

    /**
     * The **`Selection.focusOffset`** read-only property returns the number of characters that the selection's focus is offset within the Selection.focusNode if said node is of type Text, CDATASection or Comment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/focusOffset)
     */
    val focusOffset: Int

    /**
     * The **`Selection.isCollapsed`** read-only property returns a boolean value which indicates whether or not there is currently any text selected. No text is selected when the selection's start and end points are at the same position in the content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/isCollapsed)
     */
    val isCollapsed: Boolean

    /**
     * The **`Selection.rangeCount`** read-only property returns the number of ranges in the selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/rangeCount)
     */
    val rangeCount: Int

    /**
     * The **`type`** read-only property of the Selection interface returns a string describing the type of the current selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/type)
     */
    val type: String

    /**
     * The **`Selection.addRange()`** method adds a Range to a Selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/addRange)
     */
    fun addRange(range: Range)

    /**
     * The **`Selection.collapse()`** method collapses the current selection to a single point. The document is not modified. If the content is focused and editable, the caret will blink there.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapse)
     */
    fun collapse(
        node: Node?,
        offset: Int = definedExternally,
    )

    /**
     * The **`Selection.collapseToEnd()`** method collapses the selection to the end of the last range in the selection. If the content of the selection is focused and editable, the caret will blink there.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapseToEnd)
     */
    fun collapseToEnd()

    /**
     * The **`Selection.collapseToStart()`** method collapses the selection to the start of the first range in the selection. If the content of the selection is focused and editable, the caret will blink there.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapseToStart)
     */
    fun collapseToStart()

    /**
     * The **`Selection.containsNode()`** method indicates whether a specified node is part of the selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/containsNode)
     */
    fun containsNode(
        node: Node,
        allowPartialContainment: Boolean = definedExternally,
    ): Boolean

    /**
     * The **`deleteFromDocument()`** method of the Selection interface invokes the Range.deleteContents() method on the selected Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/deleteFromDocument)
     */
    fun deleteFromDocument()

    /**
     * The **`Selection.empty()`** method removes all ranges from the selection, leaving the anchorNode and focusNode properties equal to null and nothing selected. When this method is called, a selectionchange event is fired at the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/empty)
     */
    fun empty()

    /**
     * The **`Selection.extend()`** method moves the focus of the selection to a specified point. The anchor of the selection does not move. The selection will be from the anchor to the new focus, regardless of direction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/extend)
     */
    fun extend(
        node: Node,
        offset: Int = definedExternally,
    )

    /**
     * The **`Selection.getComposedRanges()`** method returns an array of StaticRange objects representing the current selection ranges, and can return ranges that potentially cross shadow boundaries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/getComposedRanges)
     */
    fun getComposedRanges(options: GetComposedRangesOptions = definedExternally): ReadonlyArray<StaticRange>

    /**
     * The **`getRangeAt()`** method of the Selection interface returns a range object representing a currently selected range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/getRangeAt)
     */
    fun getRangeAt(index: Int): Range

    /**
     * The **`Selection.modify()`** method applies a change to the current selection or cursor position, using simple textual commands.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/modify)
     */
    fun modify(
        alter: String = definedExternally,
        direction: String = definedExternally,
        granularity: String = definedExternally,
    )

    /**
     * The **`Selection.removeAllRanges()`** method removes all ranges from the selection, leaving the anchorNode and focusNode properties equal to null and nothing selected. When this method is called, a selectionchange event is fired at the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeAllRanges)
     */
    fun removeAllRanges()

    /**
     * The **`Selection.removeRange()`** method removes a range from a selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeRange)
     */
    fun removeRange(range: Range)

    /**
     * The **`Selection.selectAllChildren()`** method adds all the children of the specified node to the selection. Previous selection is lost.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/selectAllChildren)
     */
    fun selectAllChildren(node: Node)

    /**
     * The **`setBaseAndExtent()`** method of the Selection interface sets the selection to be a range including all or parts of two specified DOM nodes, and any content located between them.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/setBaseAndExtent)
     */
    fun setBaseAndExtent(
        anchorNode: Node,
        anchorOffset: Int,
        focusNode: Node,
        focusOffset: Int,
    )

    /**
     * The **`Selection.setPosition()`** method collapses the current selection to a single point. The document is not modified. If the content is focused and editable, the caret will blink there.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/setPosition)
     */
    fun setPosition(
        node: Node?,
        offset: Int = definedExternally,
    )
}
