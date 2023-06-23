// Automatically generated - do not modify!

package web.html

import web.cssom.MediaQuery

/**
 * Contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement)
 */
abstract external class HTMLMetaElement :
    HTMLElement {
    /** Gets or sets meta-information to associate with httpEquiv or name. */
    var content: String

    /** Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header. */
    var httpEquiv: String
    var media: MediaQuery

    /** Sets or retrieves the value specified in the content attribute of the meta object. */
    var name: String
}
