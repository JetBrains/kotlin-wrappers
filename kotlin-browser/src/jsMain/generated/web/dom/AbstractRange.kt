// Automatically generated - do not modify!

package web.dom

sealed external class AbstractRange {
    /**
     * Returns true if range is collapsed, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/collapsed)
     */
    val collapsed: Boolean

    /**
     * Returns range's end node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/endContainer)
     */
    val endContainer: Node

    /**
     * Returns range's end offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/endOffset)
     */
    val endOffset: Int

    /**
     * Returns range's start node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/startContainer)
     */
    val startContainer: Node

    /**
     * Returns range's start offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/startOffset)
     */
    val startOffset: Int
}
