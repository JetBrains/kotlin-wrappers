// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMPoint
import dom.geometry.DOMPointInit
import dom.geometry.DOMPointReadOnly
import dom.geometry.DOMRect

sealed external class SVGTextContentElement :
    SVGGraphicsElement {
    val lengthAdjust: SVGAnimatedEnumeration
    val textLength: SVGAnimatedLength
    fun getCharNumAtPosition(point: DOMPointInit = definedExternally): Number
    fun getCharNumAtPosition(point: DOMPointReadOnly /* DOMPointInit */): Number
    fun getComputedTextLength(): Number
    fun getEndPositionOfChar(charnum: Number): DOMPoint
    fun getExtentOfChar(charnum: Number): DOMRect
    fun getNumberOfChars(): Number
    fun getRotationOfChar(charnum: Number): Number
    fun getStartPositionOfChar(charnum: Number): DOMPoint
    fun getSubStringLength(
        charnum: Number,
        nchars: Number,
    ): Number

    val LENGTHADJUST_SPACING: Short
    val LENGTHADJUST_SPACINGANDGLYPHS: Short
    val LENGTHADJUST_UNKNOWN: Short

    companion object {
        val LENGTHADJUST_SPACING: Short
        val LENGTHADJUST_SPACINGANDGLYPHS: Short
        val LENGTHADJUST_UNKNOWN: Short
    }
}
