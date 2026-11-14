// Automatically generated - do not modify!

package web.svg

import web.cssom.CSSStyleDeclaration
import web.cssom.ElementCSSInlineStyle
import web.cssom.StylePropertyMap
import web.dom.DOMStringMap
import web.dom.Element
import web.dom.FocusOptions
import web.dom.HTMLOrSVGOrMathMLElement
import web.globals.GlobalEventHandlers

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
    HTMLOrSVGOrMathMLElement {
    /**
     * The **`ownerSVGElement`** read-only property of the SVGElement interface reflects the nearest ancestor <svg> element. null if the given element is the outermost <svg> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/ownerSVGElement)
     */
    open val ownerSVGElement: SVGSVGElement?

    /**
     * The **`viewportElement`** read-only property of the SVGElement interface represents the SVGElement which established the current viewport. Often the nearest ancestor <svg> element. null if the given element is the outermost <svg> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/viewportElement)
     */
    open val viewportElement: SVGElement?

    /* `ElementCSSInlineStyle` overrides */

    override val attributeStyleMap: StylePropertyMap
    override val style: CSSStyleDeclaration

    /* `HTMLOrSVGOrMathMLElement` overrides */

    override var autofocus: Boolean
    override val dataset: DOMStringMap
    override var nonce: String
    override var tabIndex: Int
    override fun blur()
    override fun focus(options: FocusOptions)
}
