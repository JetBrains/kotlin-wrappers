// Automatically generated - do not modify!

package web.html

import js.core.JsString
import web.cssom.LinkStyle
import web.cssom.MediaQuery
import web.dom.DOMTokenList
import web.http.CrossOrigin
import web.http.FetchPriority
import web.http.ReferrerPolicy

/**
 * The **`HTMLLinkElement`** interface represents reference information for external resources and the relationship of those resources to a document and vice versa (corresponds to `<link>` element; not to be confused with `<a>`, which is represented by `HTMLAnchorElement`).
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/blocking)
     */
    val blocking: DOMTokenList<JsString>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/disabled)
     */
    var disabled: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/fetchPriority)
     */
    var fetchPriority: FetchPriority

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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/imageSizes)
     */
    var imageSizes: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/imageSrcset)
     */
    var imageSrcset: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/integrity)
     */
    var integrity: String

    /**
     * Sets or retrieves the media type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/media)
     */
    var media: MediaQuery

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
    val relList: DOMTokenList<JsString>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/sizes)
     */
    val sizes: DOMTokenList<JsString>

    /**
     * Sets or retrieves the MIME type of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/type)
     */
    var type: String
}
