// Automatically generated - do not modify!

package web.html

import web.cssom.MediaQuery

/**
 * Provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating <source> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement)
 */
abstract external class HTMLSourceElement :
    HTMLElement {
    var height: Double

    /**
     * Gets or sets the intended media type of the media source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/media)
     */
    var media: MediaQuery

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/sizes) */
    var sizes: String

    /**
     * The address or URL of the a media resource that is to be considered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/src)
     */
    var src: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/srcset) */
    var srcset: String

    /**
     * Gets or sets the MIME type of a media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/type)
     */
    var type: String
    var width: Double
}
