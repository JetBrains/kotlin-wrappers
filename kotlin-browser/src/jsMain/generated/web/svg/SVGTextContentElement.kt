// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint
import web.geometry.DOMPointInit
import web.geometry.DOMPointReadOnly
import web.geometry.DOMRect

/**
 * Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement.
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
    fun getCharNumAtPosition(point: DOMPointInit = definedExternally): Int
    fun getCharNumAtPosition(point: DOMPointReadOnly /* DOMPointInit */): Int

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
