// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.http.ReferrerPolicy
import web.window.WindowTarget

/**
 * The **`HTMLAreaElement`** interface provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <area> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement)
 */
open external class HTMLAreaElement
protected constructor() :
    HTMLElement,
    HTMLHyperlinkElementUtils,
    HyperlinkElementUtils {
    /**
     * The **`alt`** property of the HTMLAreaElement interface specifies the text of the hyperlink, defining the textual label for an image map's link. It reflects the <area> element's alt attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/alt)
     */
    open var alt: String

    /**
     * The **`coords`** property of the HTMLAreaElement interface specifies the coordinates of the element's shape as a list of floating-point numbers. It reflects the <area> element's coords attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/coords)
     */
    open var coords: String

    /**
     * The **`download`** property of the HTMLAreaElement interface is a string indicating that the linked resource is intended to be downloaded rather than displayed in the browser. The value, if any, represents the proposed name of the file. It reflects the download attribute of the <area> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/download)
     */
    open var download: String

    /**
     * The **`ping`** property of the HTMLAreaElement interface is a space-separated list of URLs. When the link is followed, the browser will send POST requests with the body PING to the URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/ping)
     */
    open var ping: String

    /**
     * The **`HTMLAreaElement.referrerPolicy`** property reflect the HTML referrerpolicy attribute of the <area> element defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/referrerPolicy)
     */
    open var referrerPolicy: ReferrerPolicy

    /**
     * The **`HTMLAreaElement.rel`** property reflects the rel attribute. It is a string containing a space-separated list of link types indicating the relationship between the resource represented by the <area> element and the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/rel)
     */
    open var rel: String

    /**
     * The read-only **`relList`** property of the HTMLAreaElement returns a live DOMTokenList object containing the set of link types indicating the relationship between the resource represented by the <area> element and the current document. It reflects the <area> element's rel content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/relList)
     */
    open val relList: DOMTokenList<JsString>

    /**
     * The **`shape`** property of the HTMLAreaElement interface specifies the shape of an image map area. It reflects the <area> element's shape attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/shape)
     */
    open var shape: String

    /* `HTMLHyperlinkElementUtils` overrides */

    override var href: String
    override var target: WindowTarget

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
