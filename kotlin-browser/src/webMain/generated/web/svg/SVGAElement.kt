// Automatically generated - do not modify!

package web.svg

import web.dom.DOMTokenList
import web.html.HyperlinkElementUtils
import web.http.ReferrerPolicy

/**
 * The **`SVGAElement`** interface provides access to the properties of an <a> element, as well as methods to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement)
 */
open external class SVGAElement
private constructor() :
    SVGGraphicsElement,
    HyperlinkElementUtils,
    SVGURIReference {
    /**
     * The **`download`** property of the SVGAElement interface returns a string indicating that the browser should treat the linked URL as a download.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/download)
     */
    open var download: String

    /**
     * The **`ping`** property of the SVGAElement interface returns a string that reflects the ping attribute, containing a space-separated list of URLs to which, when the hyperlink is followed, POST requests with the body PING will be sent by the browser (in the background). Typically used for tracking.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/ping)
     */
    open var ping: String

    /**
     * The **`referrerPolicy`** property of the SVGAElement interface returns a string specifying which referrer to send when fetching the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/referrerPolicy)
     */
    open var referrerPolicy: ReferrerPolicy

    /**
     * The **`rel`** property of the SVGAElement interface returns a string reflecting the value of the rel attribute of the SVG <a> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/rel)
     */
    open var rel: String

    /**
     * The read-only **`relList`** property of the SVGAElement returns a live DOMTokenList reflecting the space-separated string <list-of-Link-Types> values of the rel attribute of the SVG <a> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/relList)
     */
    open val relList: DOMTokenList<JsString>

    /**
     * The **`SVGAElement.target`** read-only property of SVGAElement returns an SVGAnimatedString object that specifies the portion of a target window, frame, pane into which a document is to be opened when a link is activated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/target)
     */
    open val target: SVGAnimatedString

    /* `HyperlinkElementUtils` overrides */

    override var hash: String
    override var host: String
    override var hostname: String
    override var hreflang: String
    override val origin: String
    override var password: String
    override var pathname: String
    override var port: String
    override var protocol: String
    override var search: String
    override var type: String
    override var username: String
}
