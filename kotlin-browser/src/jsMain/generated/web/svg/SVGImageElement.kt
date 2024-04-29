// Automatically generated - do not modify!

package web.svg

import web.dom.HTMLOrSVGImageElement
import web.http.CrossOrigin

/**
 * Corresponds to the <image> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement)
 */
open external class SVGImageElement
private constructor() :
    SVGGraphicsElement,
    SVGURIReference,
    HTMLOrSVGImageElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/crossorigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/height)
     */
    val height: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/preserveAspectRatio)
     */
    val preserveAspectRatio: SVGAnimatedPreserveAspectRatio

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/width)
     */
    val width: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/x)
     */
    val x: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/y)
     */
    val y: SVGAnimatedLength
}
