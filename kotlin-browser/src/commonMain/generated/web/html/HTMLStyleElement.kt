// Automatically generated - do not modify!

package web.html

import js.core.JsString
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/blocking)
     */
    val blocking: DOMTokenList<JsString>

    /**
     * Enables or disables the style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/disabled)
     */
    var disabled: Boolean

    /**
     * Sets or retrieves the media type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/media)
     */
    var media: MediaQuery
}
