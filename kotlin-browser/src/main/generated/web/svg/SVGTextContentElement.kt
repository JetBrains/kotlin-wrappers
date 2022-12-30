// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint
import web.geometry.DOMPointInit
import web.geometry.DOMPointReadOnly
import web.geometry.DOMRect

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
