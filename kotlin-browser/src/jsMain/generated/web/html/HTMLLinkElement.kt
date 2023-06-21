// Automatically generated - do not modify!

package web.html

import web.cssom.LinkStyle
import web.dom.DOMTokenList
import web.http.ReferrerPolicy

abstract external class HTMLLinkElement :
    HTMLElement,
    LinkStyle {
    var `as`: String
    var crossOrigin: CrossOrigin?
    var disabled: Boolean

    /** Sets or retrieves a destination URL or an anchor point. */
    var href: String

    /** Sets or retrieves the language code of the object. */
    var hreflang: String
    var imageSizes: String
    var imageSrcset: String
    var integrity: String

    /** Sets or retrieves the media type. */
    var media: String
    var referrerPolicy: ReferrerPolicy

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/rel)
     */
    var rel: String
    val relList: DOMTokenList
    val sizes: DOMTokenList

    /** Sets or retrieves the MIME type of the object. */
    var type: String
}
