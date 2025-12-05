// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.http.ReferrerPolicy
import web.window.WindowTarget
import kotlin.js.JsString

/**
 * The **`HTMLAreaElement`** interface provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <area> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement)
 */
open external class HTMLAreaElement
protected constructor() :
    HTMLElement,
    HTMLHyperlinkElementUtils {
    /**
     * The **`alt`** property of the HTMLAreaElement interface specifies the text of the hyperlink, defining the textual label for an image map's link. It reflects the <area> element's alt attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/alt)
     */
    var alt: String

    /**
     * The **`coords`** property of the HTMLAreaElement interface specifies the coordinates of the element's shape as a list of floating-point numbers. It reflects the <area> element's coords attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/coords)
     */
    var coords: String

    /**
     * The **`download`** property of the HTMLAreaElement interface is a string indicating that the linked resource is intended to be downloaded rather than displayed in the browser. The value represent the proposed name of the file. If the name is not a valid filename of the underlying OS, browser will adjust it accordingly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/download)
     */
    var download: String

    /**
     * The **`ping`** property of the HTMLAreaElement interface is a space-separated list of URLs. When the link is followed, the browser will send POST requests with the body PING to the URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/ping)
     */
    var ping: String

    /**
     * The **`HTMLAreaElement.referrerPolicy`** property reflect the HTML referrerpolicy attribute of the <area> element defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * The **`HTMLAreaElement.rel`** property reflects the rel attribute. It is a string containing a space-separated list of link types indicating the relationship between the resource represented by the <area> element and the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/rel)
     */
    var rel: String

    /**
     * The read-only **`relList`** property of the HTMLAreaElement returns a live DOMTokenList object containing the set of link types indicating the relationship between the resource represented by the <area> element and the current document. It reflects the <area> element's rel content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/relList)
     */
    val relList: DOMTokenList<JsString>

    /**
     * The **`shape`** property of the HTMLAreaElement interface specifies the shape of an image map area. It reflects the <area> element's shape attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/shape)
     */
    var shape: String

    /**
     * The **`target`** property of the HTMLAreaElement interface is a string that indicates where to display the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/target)
     */
    var target: WindowTarget
}
