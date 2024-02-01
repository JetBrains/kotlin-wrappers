// Automatically generated - do not modify!

package web.html

import web.cssom.MediaQuery

/**
 * Contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement)
 */
open external class HTMLMetaElement
protected constructor() :
    HTMLElement {
    /**
     * Gets or sets meta-information to associate with httpEquiv or name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/content)
     */
    var content: String

    /**
     * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/httpEquiv)
     */
    var httpEquiv: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/media)
     */
    var media: MediaQuery

    /**
     * Sets or retrieves the value specified in the content attribute of the meta object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/name)
     */
    var name: String
}
