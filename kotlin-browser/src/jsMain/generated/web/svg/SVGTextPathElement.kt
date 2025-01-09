// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <textPath> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement)
 */
open external class SVGTextPathElement
private constructor() :
    SVGTextContentElement,
    SVGURIReference {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/method)
     */
    val method: SVGAnimatedEnumeration<Method>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/spacing)
     */
    val spacing: SVGAnimatedEnumeration<Spacing>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/startOffset)
     */
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
