// Automatically generated - do not modify!

package web.html

import web.window.WindowTarget

/**
 * The **`HTMLBaseElement`** interface contains the base URI for a document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement)
 */
open external class HTMLBaseElement
protected constructor() :
    HTMLElement {
    /**
     * Gets or sets the baseline URL on which relative links are based.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement/href)
     */
    var href: String

    /**
     * Sets or retrieves the window or frame at which to target content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement/target)
     */
    var target: WindowTarget
}
