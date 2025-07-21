// Automatically generated - do not modify!

package web.html

import js.core.JsString
import web.dom.DOMTokenList
import web.http.ReferrerPolicy
import web.window.WindowTarget

/**
 * The **`HTMLAreaElement`** interface provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of area elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement)
 */
open external class HTMLAreaElement
protected constructor() :
    HTMLElement,
    HTMLHyperlinkElementUtils {
    /**
     * The **`alt`** property of the HTMLAreaElement interface specifies the text of the hyperlink, defining the textual label for an image map's link.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/alt)
     */
    var alt: String

    /**
     * The **`coords`** property of the HTMLAreaElement interface specifies the coordinates of the element's shape as a list of floating-point numbers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/coords)
     */
    var coords: String

    /**
     * The **`download`** property of the HTMLAreaElement interface is a string indicating that the linked resource is intended to be downloaded rather than displayed in the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/download)
     */
    var download: String

    /**
     * The **`ping`** property of the HTMLAreaElement interface is a space-separated list of URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/ping)
     */
    var ping: String

    /**
     * The **`HTMLAreaElement.referrerPolicy`** property reflect the HTML `referrerpolicy` attribute of the area element defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * The **`HTMLAreaElement.rel`** property reflects the `rel` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/rel)
     */
    var rel: String

    /**
     * The **`HTMLAreaElement.relList`** read-only property reflects the `rel` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/relList)
     */
    val relList: DOMTokenList<JsString>

    /**
     * The **`shape`** property of the HTMLAreaElement interface specifies the shape of an image map area.
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
