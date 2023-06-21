// Automatically generated - do not modify!

package web.selection

import web.dom.Node
import web.dom.Range

sealed external class Selection {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/anchorNode) */
    val anchorNode: Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/anchorOffset) */
    val anchorOffset: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/focusNode) */
    val focusNode: Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/focusOffset) */
    val focusOffset: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/isCollapsed) */
    val isCollapsed: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/rangeCount) */
    val rangeCount: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/type) */
    val type: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/addRange) */
    fun addRange(range: Range)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapse) */
    fun collapse(
        node: Node?,
        offset: Number = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapseToEnd) */
    fun collapseToEnd()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapseToStart) */
    fun collapseToStart()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/containsNode) */
    fun containsNode(
        node: Node,
        allowPartialContainment: Boolean = definedExternally,
    ): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/deleteFromDocument) */
    fun deleteFromDocument()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeAllRanges) */
    fun empty()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/extend) */
    fun extend(
        node: Node,
        offset: Number = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/getRangeAt) */
    fun getRangeAt(index: Int): Range

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/modify) */
    fun modify(
        alter: String = definedExternally,
        direction: String = definedExternally,
        granularity: String = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeAllRanges) */
    fun removeAllRanges()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/removeRange) */
    fun removeRange(range: Range)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/selectAllChildren) */
    fun selectAllChildren(node: Node)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/setBaseAndExtent) */
    fun setBaseAndExtent(
        anchorNode: Node,
        anchorOffset: Number,
        focusNode: Node,
        focusOffset: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Selection/collapse) */
    fun setPosition(
        node: Node?,
        offset: Number = definedExternally,
    )
}
