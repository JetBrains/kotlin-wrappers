// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <textPath> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement)
 */
sealed external class SVGTextPathElement :
    SVGTextContentElement,
    SVGURIReference {
    val method: SVGAnimatedEnumeration<Method>
    val spacing: SVGAnimatedEnumeration<Spacing>
    val startOffset: SVGAnimatedLength
    val TEXTPATH_METHODTYPE_UNKNOWN: Method
    val TEXTPATH_METHODTYPE_ALIGN: Method
    val TEXTPATH_METHODTYPE_STRETCH: Method
    val TEXTPATH_SPACINGTYPE_UNKNOWN: Spacing
    val TEXTPATH_SPACINGTYPE_AUTO: Spacing
    val TEXTPATH_SPACINGTYPE_EXACT: Spacing

    companion object {
        val TEXTPATH_METHODTYPE_UNKNOWN: Method
        val TEXTPATH_METHODTYPE_ALIGN: Method
        val TEXTPATH_METHODTYPE_STRETCH: Method
        val TEXTPATH_SPACINGTYPE_UNKNOWN: Spacing
        val TEXTPATH_SPACINGTYPE_AUTO: Spacing
        val TEXTPATH_SPACINGTYPE_EXACT: Spacing
    }

    sealed interface Method
    sealed interface Spacing
}
