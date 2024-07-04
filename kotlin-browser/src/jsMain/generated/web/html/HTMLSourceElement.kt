// Automatically generated - do not modify!

package web.html

import web.cssom.MediaQuery

/**
 * Provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating <source> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement)
 */
open external class HTMLSourceElement
protected constructor() :
    HTMLElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/height)
     */
    var height: Int

    /**
     * Gets or sets the intended media type of the media source.
     */
    var media: MediaQuery
    var sizes: String

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    var src: String
    var srcset: String

    /**
     * Gets or sets the MIME type of a media resource.
     */
    var type: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/width)
     */
    var width: Int
}
