// Automatically generated - do not modify!

package web.selection

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
    fun modify(
        alter: String = definedExternally,
        direction: String = definedExternally,
        granularity: String = definedExternally,
    )

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
