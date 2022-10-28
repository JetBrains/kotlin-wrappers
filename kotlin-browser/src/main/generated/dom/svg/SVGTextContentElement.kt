// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMPoint
import dom.geometry.DOMPointInit
import dom.geometry.DOMRect

sealed external class SVGTextContentElement :
    SVGGraphicsElement {
    val lengthAdjust: SVGAnimatedEnumeration
    val textLength: SVGAnimatedLength
    fun getCharNumAtPosition(point: DOMPointInit = definedExternally): Number
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

    val LENGTHADJUST_SPACING: Number
    val LENGTHADJUST_SPACINGANDGLYPHS: Number
    val LENGTHADJUST_UNKNOWN: Number
}
