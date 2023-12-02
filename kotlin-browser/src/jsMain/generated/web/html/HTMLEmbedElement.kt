// Automatically generated - do not modify!

package web.html

import web.dom.Document

/**
 * Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <embed> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement)
 */
open external class HTMLEmbedElement
protected constructor() : HTMLElement {
    /** Sets or retrieves the height of the object. */
    var height: String

    /** Sets or retrieves a URL to be loaded by the object. */
    var src: String
    var type: String

    /** Sets or retrieves the width of the object. */
    var width: String
    fun getSVGDocument(): Document?
}
