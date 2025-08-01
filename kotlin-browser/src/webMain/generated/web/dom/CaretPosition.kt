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
     */
    val offset: Int

    /**
     * The **`offsetNode`** property of the CaretPosition interface returns a Node containing the found node at the caret's position.
     */
    val offsetNode: Node

    /**
     * The `getClientRect()` method of the CaretPosition interface returns the client rectangle for the caret range.
     */
    fun getClientRect(): DOMRect?
}
