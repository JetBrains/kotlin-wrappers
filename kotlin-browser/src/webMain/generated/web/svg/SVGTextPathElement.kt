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
     * The **`method`** read-only property of the SVGTextPathElement interface represents the method by which text should be rendered along the path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/method)
     */
    open val method: SVGAnimatedEnumeration<Method>

    /**
     * The **`side`** read-only property of the SVGTextPathElement interface represents the side of the path that the text is placed on (relative to the path direction).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/side)
     */
    open val side: SVGAnimatedEnumeration<Side>

    /**
     * The **`spacing`** read-only property of the SVGTextPathElement interface represents the spacing between typographic characters that are to be rendered along a path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/spacing)
     */
    open val spacing: SVGAnimatedEnumeration<Spacing>

    /**
     * The **`startOffset`** read-only property of the SVGTextPathElement interface reflects the X component of the startOffset attribute of the given <textPath>, which defines an offset from the start of the path for the initial current text position along the path after converting the path to the <textPath> element's coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/startOffset)
     */
    open val startOffset: SVGAnimatedLength

    companion object {
        val TEXTPATH_METHODTYPE_UNKNOWN: Method
        val TEXTPATH_METHODTYPE_ALIGN: Method
        val TEXTPATH_METHODTYPE_STRETCH: Method
        val TEXTPATH_SPACINGTYPE_UNKNOWN: Spacing
        val TEXTPATH_SPACINGTYPE_AUTO: Spacing
        val TEXTPATH_SPACINGTYPE_EXACT: Spacing
        val TEXTPATH_SIDETYPE_UNKNOWN: Side
        val TEXTPATH_SIDETYPE_LEFT: Side
        val TEXTPATH_SIDETYPE_RIGHT: Side
    }

    sealed /* enum */
    interface Method

    sealed /* enum */
    interface Side

    sealed /* enum */
    interface Spacing
}
