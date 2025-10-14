// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.dom.Document
import web.http.ReferrerPolicy
import web.window.WindowProxy
import kotlin.js.JsString

/**
 * The **`HTMLIFrameElement`** interface provides special properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement)
 */
open external class HTMLIFrameElement
protected constructor() :
    HTMLElement {
    /**
     * The **`allow`** property of the HTMLIFrameElement interface indicates the Permissions Policy specified for this `<iframe>` element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/allow)
     */
    var allow: String

    /**
     * The **`allowFullscreen`** property of the HTMLIFrameElement interface is a boolean value that reflects the `allowfullscreen` attribute of the iframe element, indicating whether to allow the iframe's contents to use Element.requestFullscreen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/allowFullscreen)
     */
    var allowFullscreen: Boolean

    /**
     * If the iframe and the iframe's parent document are Same Origin, returns a `Document` (that is, the active document in the inline frame's nested browsing context), else returns `null`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/contentDocument)
     */
    val contentDocument: Document?

    /**
     * The **`contentWindow`** property returns the Window object of an HTMLIFrameElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/contentWindow)
     */
    val contentWindow: WindowProxy?

    /**
     * The **`height`** property of the HTMLIFrameElement interface returns a string that reflects the `height` attribute of the iframe element, indicating the height of the frame in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/height)
     */
    var height: String

    /**
     * The **`loading`** property of the HTMLIFrameElement interface is a string that provides a hint to the user agent indicating whether the iframe should be loaded immediately on page load, or only when it is needed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/loading)
     */
    var loading: Loading

    /**
     * The **`name`** property of the HTMLIFrameElement interface is a string value that reflects the `name` attribute of the iframe element, indicating the specific name of the `<iframe>` element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/name)
     */
    var name: String

    /**
     * The **`HTMLIFrameElement.referrerPolicy`** property reflects the HTML `referrerpolicy` attribute of the iframe element defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * The **`sandbox`** read-only property of the HTMLIFrameElement interface returns a DOMTokenList indicating extra restrictions on the behavior of the nested content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/sandbox)
     */
    val sandbox: DOMTokenList<JsString>

    /**
     * The **`HTMLIFrameElement.src`** A string that reflects the `src` HTML attribute, containing the address of the content to be embedded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/src)
     */
    var src: String

    /**
     * The **`srcdoc`** property of the HTMLIFrameElement interface gets or sets the inline HTML markup of the frame's document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/srcdoc)
     */
    var srcdoc: String

    /**
     * The **`width`** property of the HTMLIFrameElement interface returns a string that reflects the `width` attribute of the iframe element, indicating the width of the frame in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/width)
     */
    var width: String

    /**
     * The **`getSVGDocument()`** method of the HTMLIFrameElement interface returns the Document object of the embedded SVG.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/getSVGDocument)
     */
    fun getSVGDocument(): Document?
}
