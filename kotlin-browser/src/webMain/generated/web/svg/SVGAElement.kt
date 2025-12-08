// Automatically generated - do not modify!

package web.svg

import web.dom.DOMTokenList
import web.http.ReferrerPolicy
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
     * The **`hreflang`** property of the SVGAElement interface returns a string indicating the language of the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/hreflang)
     */
    var hreflang: String

    /**
     * The **`ping`** property of the SVGAElement interface returns a string that reflects the ping attribute, containing a space-separated list of URLs to which, when the hyperlink is followed, POST requests with the body PING will be sent by the browser (in the background). Typically used for tracking.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/ping)
     */
    var ping: String
    var referrerPolicy: ReferrerPolicy

    /**
     * The **`rel`** property of the SVGAElement returns a string reflecting the value of the rel attribute of the SVG <a> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/rel)
     */
    var rel: String

    /**
     * The read-only **`relList`** property of the SVGAElement returns a live DOMTokenList reflecting the space-separated string <list-of-Link-Types> values of the rel attribute of the SVG <a> element.
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

    /**
     * The **`type`** property of the SVGAElement interface returns a string indicating the MIME type of the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/type)
     */
    var type: String
}
