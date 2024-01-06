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
sealed external class SVGTextContentElement :
    SVGGraphicsElement {
    val lengthAdjust: SVGAnimatedEnumeration<LengthAdjust>
    val textLength: SVGAnimatedLength
    fun getCharNumAtPosition(point: DOMPointInit = definedExternally): Number
    fun getCharNumAtPosition(point: DOMPointReadOnly /* DOMPointInit */): Number
    fun getComputedTextLength(): Number
    fun getEndPositionOfChar(charnum: Int): DOMPoint
    fun getExtentOfChar(charnum: Int): DOMRect
    fun getNumberOfChars(): Number
    fun getRotationOfChar(charnum: Int): Number
    fun getStartPositionOfChar(charnum: Int): DOMPoint
    fun getSubStringLength(
        charnum: Int,
        nchars: Int,
    ): Number

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
