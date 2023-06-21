// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.http.ReferrerPolicy
import web.window.WindowTarget

abstract external class HTMLAnchorElement :
    HTMLElement,
    HTMLHyperlinkElementUtils {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/download) */
    var download: String

    /**
     * Sets or retrieves the language code of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hreflang)
     */
    var hreflang: String
    var ping: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy) */
    var referrerPolicy: ReferrerPolicy

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/rel)
     */
    var rel: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/relList) */
    val relList: DOMTokenList

    /**
     * Sets or retrieves the window or frame at which to target content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/target)
     */
    var target: WindowTarget

    /**
     * Retrieves or sets the text of the object as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/text)
     */
    var text: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/type) */
    var type: String
}
