// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint
import web.geometry.DOMPointReadOnly
import web.geometry.DOMRect
import kotlin.js.definedExternally

/**
 * The **`SVGTextContentElement`** interface is implemented by elements that support rendering child text content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement)
 */
open external class SVGTextContentElement
private constructor() :
    SVGGraphicsElement {
    /**
     * The **`lengthAdjust`** read-only property of the SVGTextContentElement interface reflects the lengthAdjust attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/lengthAdjust)
     */
    val lengthAdjust: SVGAnimatedEnumeration<LengthAdjust>

    /**
     * The **`textLength`** read-only property of the SVGTextContentElement interface reflects the textLength attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/textLength)
     */
    val textLength: SVGAnimatedLength

    /**
     * The `getCharNumAtPosition()` method of the SVGTextContentElement interface represents the character which caused a text glyph to be rendered at a given position in the coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getCharNumAtPosition)
     */
    fun getCharNumAtPosition(point: DOMPointReadOnly = definedExternally): Int

    /**
     * The `getComputedTextLength()` method of the SVGTextContentElement interface represents the computed length for the text within the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getComputedTextLength)
     */
    fun getComputedTextLength(): Float

    /**
     * The `getEndPositionOfChar()` method of the SVGTextContentElement interface returns the trailing position of a typographic character after text layout has been performed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getEndPositionOfChar)
     */
    fun getEndPositionOfChar(charnum: Int): DOMPoint

    /**
     * The `getExtentOfChar()` method of the SVGTextContentElement interface the represents computed tight bounding box of the glyph cell that corresponds to a given typographic character.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getExtentOfChar)
     */
    fun getExtentOfChar(charnum: Int): DOMRect

    /**
     * The `getNumberOfChars()` method of the SVGTextContentElement interface represents the total number of addressable characters available for rendering within the current element, regardless of whether they will be rendered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getNumberOfChars)
     */
    fun getNumberOfChars(): Int

    /**
     * The `getRotationOfChar()` method of the SVGTextContentElement interface the represents the rotation of a typographic character.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getRotationOfChar)
     */
    fun getRotationOfChar(charnum: Int): Float

    /**
     * The `getStartPositionOfChar()` method of the SVGTextContentElement interface returns the position of a typographic character after text layout has been performed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getStartPositionOfChar)
     */
    fun getStartPositionOfChar(charnum: Int): DOMPoint

    /**
     * The `getSubStringLength()` method of the SVGTextContentElement interface represents the computed length of the formatted text advance distance for a substring of text within the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getSubStringLength)
     */
    fun getSubStringLength(
        charnum: Int,
        nchars: Int,
    ): Float

    val LENGTHADJUST_UNKNOWN: LengthAdjust
    val LENGTHADJUST_SPACING: LengthAdjust
    val LENGTHADJUST_SPACINGANDGLYPHS: LengthAdjust

    companion object {
        val LENGTHADJUST_UNKNOWN: LengthAdjust
        val LENGTHADJUST_SPACING: LengthAdjust
        val LENGTHADJUST_SPACINGANDGLYPHS: LengthAdjust
    }

    sealed interface LengthAdjust
}
