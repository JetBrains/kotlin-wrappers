// Automatically generated - do not modify!

package web.html

import web.dom.Document

/**
 * The **`HTMLEmbedElement`** interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating embed elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement)
 */
open external class HTMLEmbedElement
protected constructor() :
    HTMLElement {
    /**
     * The **`height`** property of the HTMLEmbedElement interface returns a string that reflects the `height` attribute of the embed element, indicating the displayed height of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/height)
     */
    var height: String

    /**
     * The **`src`** property of the HTMLEmbedElement interface returns a string that indicates the URL of the resource being embedded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/src)
     */
    var src: String

    /**
     * The **`type`** property of the HTMLEmbedElement interface returns a string that reflects the `type` attribute of the embed element, indicating the MIME type of the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/type)
     */
    var type: String

    /**
     * The **`width`** property of the HTMLEmbedElement interface returns a string that reflects the `width` attribute of the embed element, indicating the displayed width of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/width)
     */
    var width: String

    /**
     * The **`getSVGDocument()`** method of the HTMLEmbedElement interface returns the Document object of the embedded SVG.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/getSVGDocument)
     */
    fun getSVGDocument(): Document?
}
