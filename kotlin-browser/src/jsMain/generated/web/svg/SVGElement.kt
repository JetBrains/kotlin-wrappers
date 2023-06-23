// Automatically generated - do not modify!

package web.svg

import web.cssom.ElementCSSInlineStyle
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.dom.HTMLOrSVGElement

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the SVGElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement)
 */
sealed external class SVGElement :
    Element,
    ElementCSSInlineStyle,
    GlobalEventHandlers,
    HTMLOrSVGElement {
    val ownerSVGElement: SVGSVGElement?
    val viewportElement: SVGElement?
}
