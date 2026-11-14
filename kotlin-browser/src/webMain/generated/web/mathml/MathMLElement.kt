// Automatically generated - do not modify!

package web.mathml

import web.cssom.CSSStyleDeclaration
import web.cssom.ElementCSSInlineStyle
import web.cssom.StylePropertyMap
import web.dom.DOMStringMap
import web.dom.Element
import web.dom.FocusOptions
import web.dom.HTMLOrSVGOrMathMLElement
import web.globals.GlobalEventHandlers

/**
 * The **`MathMLElement`** interface represents any MathML element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement)
 */
open external class MathMLElement
private constructor() :
    Element,
    ElementCSSInlineStyle,
    GlobalEventHandlers,
    HTMLOrSVGOrMathMLElement {

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
