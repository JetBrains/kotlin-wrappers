// Automatically generated - do not modify!

package web.svg

import js.core.JsString
import web.dom.DOMTokenList

/**
 * The **`SVGAElement`** interface provides access to the properties of an a element, as well as methods to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement)
 */
open external class SVGAElement
private constructor() :
    SVGGraphicsElement,
    SVGURIReference {
    var rel: String
    val relList: DOMTokenList<JsString>

    /**
     * The **`SVGAElement.target`** read-only property of SVGAElement returns an SVGAnimatedString object that specifies the portion of a target window, frame, pane into which a document is to be opened when a link is activated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/target)
     */
    val target: SVGAnimatedString
}
