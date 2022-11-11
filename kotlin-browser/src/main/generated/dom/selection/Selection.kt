// Automatically generated - do not modify!

package dom.selection

import dom.Node
import dom.Range

sealed external class Selection {
    val anchorNode: Node?
    val anchorOffset: Int
    val focusNode: Node?
    val focusOffset: Int
    val isCollapsed: Boolean
    val rangeCount: Int
    val type: String
    fun addRange(range: Range)
    fun collapse(
        node: Node?,
        offset: Number = definedExternally,
    )

    fun collapseToEnd()
    fun collapseToStart()
    fun containsNode(
        node: Node,
        allowPartialContainment: Boolean = definedExternally,
    ): Boolean

    fun deleteFromDocument()
    fun empty()
    fun extend(
        node: Node,
        offset: Number = definedExternally,
    )

    fun getRangeAt(index: Int): Range
    fun removeAllRanges()
    fun removeRange(range: Range)
    fun selectAllChildren(node: Node)
    fun setBaseAndExtent(
        anchorNode: Node,
        anchorOffset: Number,
        focusNode: Node,
        focusOffset: Number,
    )

    fun setPosition(
        node: Node?,
        offset: Number = definedExternally,
    )
}
