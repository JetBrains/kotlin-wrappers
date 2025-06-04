// Automatically generated - do not modify!

package web.ranges

import web.dom.Node

/**
 * The **`AbstractRange`** abstract interface is the base class upon which all DOM range types are defined.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange)
 */
open external class AbstractRange
private constructor() {
    /**
     * The read-only **`collapsed`** property of the AbstractRange interface returns `true` if the range's start position and end position are the same.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/collapsed)
     */
    val collapsed: Boolean

    /**
     * The read-only **`endContainer`** property of the AbstractRange interface returns the Node in which the end of the range is located.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/endContainer)
     */
    val endContainer: Node

    /**
     * The **`endOffset`** property of the AbstractRange interface returns the offset into the end node of the range's end position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/endOffset)
     */
    val endOffset: Int

    /**
     * The read-only **`startContainer`** property of the AbstractRange interface returns the start Node for the range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/startContainer)
     */
    val startContainer: Node

    /**
     * The read-only **`startOffset`** property of the AbstractRange interface returns the offset into the start node of the range's start position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/startOffset)
     */
    val startOffset: Int
}
