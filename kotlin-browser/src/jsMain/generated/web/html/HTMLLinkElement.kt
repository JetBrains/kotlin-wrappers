// Automatically generated - do not modify!

package web.html

import web.cssom.LinkStyle
import web.dom.DOMTokenList
import web.http.CrossOrigin
import web.http.ReferrerPolicy

/**
 * Reference information for external resources and the relationship of those resources to a document and vice-versa. This object inherits all of the properties and methods of the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement)
 */
open external class HTMLLinkElement
protected constructor() :
    HTMLElement,
    LinkStyle {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/as)
     */
    var `as`: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?
    var disabled: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/fetchPriority)
     */
    var fetchPriority: String

    /**
     * Sets or retrieves a destination URL or an anchor point.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/href)
     */
    var href: String

    /**
     * Sets or retrieves the language code of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/hreflang)
     */
    var hreflang: String
    var imageSizes: String
    var imageSrcset: String
    var integrity: String

    /**
     * Sets or retrieves the media type.
     */
    var media: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/rel)
     */
    var rel: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/relList)
     */
    val relList: DOMTokenList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/sizes)
     */
    val sizes: DOMTokenList

    /**
     * Sets or retrieves the MIME type of the object.
     */
    var type: String
}
