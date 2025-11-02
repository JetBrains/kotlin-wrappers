// Automatically generated - do not modify!

package web.svg

import web.dom.DOMTokenList
import kotlin.js.JsString

/**
 * The **`SVGAElement`** interface provides access to the properties of an <a> element, as well as methods to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement)
 */
open external class SVGAElement
private constructor() :
    SVGGraphicsElement,
    SVGURIReference {
    /**
     * The **`download`** property of the SVGAElement interface returns a string indicating that the browser should treat the linked URL as a download.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/download)
     */
    var download: String

    /**
     * The **`rel`** property of the SVGAElement returns a string reflecting the value of the rel attribute of the SVG <a> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/rel)
     */
    var rel: String

    /**
     * The **`relList`** read-only property of the SVGAElement returns a live DOMTokenList reflecting the space-separated string <list-of-Link-Types> values of the rel attribute of the SVG <a> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/relList)
     */
    val relList: DOMTokenList<JsString>

    /**
     * The **`SVGAElement.target`** read-only property of SVGAElement returns an SVGAnimatedString object that specifies the portion of a target window, frame, pane into which a document is to be opened when a link is activated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/target)
     */
    val target: SVGAnimatedString
}
