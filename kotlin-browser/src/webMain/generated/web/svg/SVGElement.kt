// Automatically generated - do not modify!

package web.svg

import web.cssom.ElementCSSInlineStyle
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.dom.HTMLOrSVGElement

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the **`SVGElement`** interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement)
 */
open external class SVGElement
private constructor() :
    Element,
    ElementCSSInlineStyle,
    GlobalEventHandlers,
    HTMLOrSVGElement {
    /**
     * The **`ownerSVGElement`** property of the SVGElement interface reflects the nearest ancestor <svg> element. null if the given element is the outermost <svg> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/ownerSVGElement)
     */
    val ownerSVGElement: SVGSVGElement?

    /**
     * The **`viewportElement`** property of the SVGElement interface represents the SVGElement which established the current viewport. Often the nearest ancestor <svg> element. null if the given element is the outermost <svg> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/viewportElement)
     */
    val viewportElement: SVGElement?
}
