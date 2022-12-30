// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.dom.css.LinkStyle

abstract external class HTMLLinkElement :
    HTMLElement,
    LinkStyle {
    var `as`: String
    var crossOrigin: String?
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
    var referrerPolicy: String

    /** Sets or retrieves the relationship between the object and the destination of the link. */
    var rel: String
    val relList: DOMTokenList
    val sizes: DOMTokenList

    /** Sets or retrieves the MIME type of the object. */
    var type: String
}
