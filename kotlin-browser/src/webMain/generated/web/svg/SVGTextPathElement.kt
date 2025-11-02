// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGTextPathElement`** interface corresponds to the <textPath> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement)
 */
open external class SVGTextPathElement
private constructor() :
    SVGTextContentElement,
    SVGURIReference {
    /**
     * The **`method`** read-only property of the SVGTextPathElement interface reflects the method attribute of the given <textPath> element. It takes one of the TEXTPATH_METHODTYPE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/method)
     */
    val method: SVGAnimatedEnumeration<Method>

    /**
     * The **`spacing`** read-only property of the SVGTextPathElement interface reflects the spacing attribute of the given <textPath> element. It takes one of the TEXTPATH_SPACINGTYPE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/spacing)
     */
    val spacing: SVGAnimatedEnumeration<Spacing>

    /**
     * The **`startOffset`** read-only property of the SVGTextPathElement interface reflects the X component of the startOffset attribute of the given <textPath>, which defines an offset from the start of the path for the initial current text position along the path after converting the path to the <textPath> element's coordinate system.
     *
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
