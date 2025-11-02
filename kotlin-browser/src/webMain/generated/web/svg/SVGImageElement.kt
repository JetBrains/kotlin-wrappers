// Automatically generated - do not modify!

package web.svg

import web.dom.HTMLOrSVGImageElement
import web.http.CrossOrigin

/**
 * The **`SVGImageElement`** interface corresponds to the <image> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement)
 */
open external class SVGImageElement
private constructor() :
    SVGGraphicsElement,
    SVGURIReference,
    HTMLOrSVGImageElement {
    /**
     * The **`crossOrigin`** property of the SVGImageElement interface is a string which specifies the Cross-Origin Resource Sharing (CORS) setting to use when retrieving the image. It reflects the crossorigin content attribute of the given <image> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * The **`height`** read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the height attribute of the given <image> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/height)
     */
    val height: SVGAnimatedLength

    /**
     * The **`preserveAspectRatio`** read-only property of the SVGImageElement interface returns an SVGAnimatedPreserveAspectRatio corresponding to the preserveAspectRatio attribute of the given <image> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/preserveAspectRatio)
     */
    val preserveAspectRatio: SVGAnimatedPreserveAspectRatio

    /**
     * The **`width`** read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the width attribute of the given <image> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/width)
     */
    val width: SVGAnimatedLength

    /**
     * The **`x`** read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the x attribute of the given <image> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/x)
     */
    val x: SVGAnimatedLength

    /**
     * The **`y`** read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the y attribute of the given <image> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/y)
     */
    val y: SVGAnimatedLength
}
