// Automatically generated - do not modify!

package web.dom

import web.geometry.DOMRect

/**
 * The `CaretPosition` interface represents the caret position, an indicator for the text insertion point.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CaretPosition)
 */
open external class CaretPosition
private constructor() {
    /**
     * The **`offset`** property of the CaretPosition interface returns an integer representing the offset of the selection in the caret position node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CaretPosition/offset)
     */
    val offset: Int

    /**
     * The **`offsetNode`** property of the CaretPosition interface returns a Node containing the found node at the caret's position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CaretPosition/offsetNode)
     */
    val offsetNode: Node

    /**
     * The `getClientRect()` method of the CaretPosition interface returns the client rectangle for the caret range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CaretPosition/getClientRect)
     */
    fun getClientRect(): DOMRect?
}
