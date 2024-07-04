// Automatically generated - do not modify!

package web.html

import web.window.WindowTarget

/**
 * Contains the base URI for a document. This object inherits all of the properties and methods as described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement)
 */
open external class HTMLBaseElement
protected constructor() :
    HTMLElement {
    /**
     * Gets or sets the baseline URL on which relative links are based.
     */
    var href: String

    /**
     * Sets or retrieves the window or frame at which to target content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement/target)
     */
    var target: WindowTarget
}
