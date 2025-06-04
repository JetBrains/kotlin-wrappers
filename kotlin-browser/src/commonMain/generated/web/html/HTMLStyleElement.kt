// Automatically generated - do not modify!

package web.html

import web.cssom.LinkStyle
import web.cssom.MediaQuery
import web.dom.DOMTokenList

/**
 * The **`HTMLStyleElement`** interface represents a style element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement)
 */
open external class HTMLStyleElement
protected constructor() :
    HTMLElement,
    LinkStyle {
    /**
     * The **`blocking`** property of the HTMLStyleElement interface is a string indicating that certain operations should be blocked on the fetching of critical subresources.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/blocking)
     */
    val blocking: DOMTokenList<Blocking>

    /**
     * The **`HTMLStyleElement.disabled`** property can be used to get and set whether the stylesheet is disabled (`true`) or not (`false`).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`HTMLStyleElement.media`** property specifies the intended destination medium for style information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/media)
     */
    var media: MediaQuery
}
