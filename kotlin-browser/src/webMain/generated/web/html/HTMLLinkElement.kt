// Automatically generated - do not modify!

package web.html

import web.cssom.LinkStyle
import web.cssom.MediaQuery
import web.dom.DOMTokenList
import web.http.CrossOrigin
import web.http.FetchPriority
import web.http.ReferrerPolicy
import kotlin.js.JsString

/**
 * The **`HTMLLinkElement`** interface represents reference information for external resources and the relationship of those resources to a document and vice versa (corresponds to <link> element; not to be confused with <a>, which is represented by HTMLAnchorElement). This object inherits all of the properties and methods of the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement)
 */
open external class HTMLLinkElement
protected constructor() :
    HTMLElement,
    LinkStyle {
    /**
     * The **`as`** property of the HTMLLinkElement interface returns a string representing the type of content to be preloaded by a link element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/as)
     */
    var `as`: String

    /**
     * The **`blocking`** property of the HTMLLinkElement interface is a string indicating that certain operations should be blocked on the fetching of an external resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/blocking)
     */
    val blocking: DOMTokenList<Blocking>

    /**
     * The **`crossOrigin`** property of the HTMLLinkElement interface specifies the Cross-Origin Resource Sharing (CORS) setting to use when retrieving the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * The **`disabled`** property of the HTMLLinkElement interface is a boolean value that represents whether the link is disabled. It only has an effect with style sheet links (rel property set to stylesheet).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`fetchPriority`** property of the HTMLLinkElement interface represents a hint to the browser indicating how it should prioritize fetching a particular resource relative to other resources of the same type. It reflects the fetchpriority attribute of the corresponding <link> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/fetchPriority)
     */
    var fetchPriority: FetchPriority

    /**
     * The **`href`** property of the HTMLLinkElement interface contains a string that is the URL associated with the link.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/href)
     */
    var href: String

    /**
     * The **`hreflang`** property of the HTMLLinkElement interface is used to indicate the language and the geographical targeting of a page. This hint can be used by browsers to select the more appropriate page or to improve SEO.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/hreflang)
     */
    var hreflang: String

    /**
     * The **`imageSizes`** property of the HTMLLinkElement interface indicates the size and conditions for the preloaded images defined by the imageSrcset property. It reflects the value of the <link> element's imagesizes attribute. This property can retrieve or set the imagesizes attribute value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/imageSizes)
     */
    var imageSizes: String

    /**
     * The **`imageSrcset`** property of the HTMLLinkElement interface is a string which identifies one or more comma-separated image candidate strings. This property reflects the value of the <link> element's imagesrcset attribute. This property can retrieved or set the imagesrcset attribute value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/imageSrcset)
     */
    var imageSrcset: String

    /**
     * The **`integrity`** property of the HTMLLinkElement interface is a string containing inline metadata that a browser can use to verify that a fetched resource has been delivered without unexpected manipulation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/integrity)
     */
    var integrity: String

    /**
     * The **`media`** property of the HTMLLinkElement interface is a string representing a list of one or more media formats to which the resource applies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/media)
     */
    var media: MediaQuery

    /**
     * The **`referrerPolicy`** property of the HTMLLinkElement interface reflects the HTML referrerpolicy attribute of the <link> element defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * The **`rel`** property of the HTMLLinkElement interface reflects the rel attribute. It is a string containing a space-separated list of link types indicating the relationship between the resource represented by the <link> element and the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/rel)
     */
    var rel: String

    /**
     * The **`relList`** read-only property of the HTMLLinkElement interface reflects the rel attribute. It is a live DOMTokenList containing the set of link types indicating the relationship between the resource represented by the <link> element and the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/relList)
     */
    val relList: DOMTokenList<JsString>

    /**
     * The **`sizes`** read-only property of the HTMLLinkElement interfaces defines the sizes of the icons for visual media contained in the resource. It reflects the <link> element's sizes attribute, which takes a list of space-separated sizes, each in the format <width in pixels>x<height in pixels>, or the keyword any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/sizes)
     */
    val sizes: DOMTokenList<JsString>

    /**
     * The **`type`** property of the HTMLLinkElement interface is a string that reflects the MIME type of the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/type)
     */
    var type: String
}
