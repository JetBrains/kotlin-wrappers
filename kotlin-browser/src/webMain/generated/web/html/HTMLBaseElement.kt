// Automatically generated - do not modify!

package web.html

import web.window.WindowTarget

/**
 * The **`HTMLBaseElement`** interface contains the base URI for a document. This object inherits all of the properties and methods as described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement)
 */
open external class HTMLBaseElement
protected constructor() :
    HTMLElement {
    /**
     * The **`href`** property of the HTMLBaseElement interface contains a string that is the URL to use as the base for relative URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement/href)
     */
    var href: String

    /**
     * The **`target`** property of the HTMLBaseElement interface is a string that represents the default target tab to show the resulting output for hyperlinks and form elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement/target)
     */
    var target: WindowTarget
}
