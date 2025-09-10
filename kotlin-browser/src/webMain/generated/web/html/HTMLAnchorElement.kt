// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.http.ReferrerPolicy
import web.window.WindowTarget
import kotlin.js.JsString

/**
 * The **`HTMLAnchorElement`** interface represents hyperlink elements and provides special properties and methods (beyond those of the regular HTMLElement object interface that they inherit from) for manipulating the layout and presentation of such elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement)
 */
open external class HTMLAnchorElement
protected constructor() :
    HTMLElement,
    HTMLHyperlinkElementUtils {
    /**
     * The **`HTMLAnchorElement.download`** property is a string indicating that the linked resource is intended to be downloaded rather than displayed in the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/download)
     */
    var download: String

    /**
     * The **`hreflang`** property of the HTMLAnchorElement interface is a string that is the language of the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hreflang)
     */
    var hreflang: String

    /**
     * The **`ping`** property of the HTMLAnchorElement interface is a space-separated list of URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/ping)
     */
    var ping: String

    /**
     * The **`HTMLAnchorElement.referrerPolicy`** property reflect the HTML `referrerpolicy` attribute of the a element defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * The **`HTMLAnchorElement.rel`** property reflects the `rel` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/rel)
     */
    var rel: String

    /**
     * The **`HTMLAnchorElement.relList`** read-only property reflects the `rel` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/relList)
     */
    val relList: DOMTokenList<JsString>

    /**
     * The **`target`** property of the HTMLAnchorElement interface is a string that indicates where to display the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/target)
     */
    var target: WindowTarget

    /**
     * The **`text`** property of the HTMLAnchorElement represents the text inside the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/text)
     */
    var text: String

    /**
     * The **`type`** property of the HTMLAnchorElement interface is a string that indicates the MIME type of the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/type)
     */
    var type: String
}
