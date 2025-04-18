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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/lengthAdjust)
     */
    val lengthAdjust: SVGAnimatedEnumeration<LengthAdjust>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/textLength)
     */
    val textLength: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getCharNumAtPosition)
     */
    fun getCharNumAtPosition(point: DOMPointReadOnly = definedExternally): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getComputedTextLength)
     */
    fun getComputedTextLength(): Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getEndPositionOfChar)
     */
    fun getEndPositionOfChar(charnum: Int): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getExtentOfChar)
     */
    fun getExtentOfChar(charnum: Int): DOMRect

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getNumberOfChars)
     */
    fun getNumberOfChars(): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getRotationOfChar)
     */
    fun getRotationOfChar(charnum: Int): Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getStartPositionOfChar)
     */
    fun getStartPositionOfChar(charnum: Int): DOMPoint

    /**
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
