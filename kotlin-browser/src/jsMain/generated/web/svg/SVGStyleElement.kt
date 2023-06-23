// Automatically generated - do not modify!

package web.svg

import web.cssom.LinkStyle
import web.cssom.MediaQuery

/**
 * Corresponds to the SVG <style> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement)
 */
sealed external class SVGStyleElement :
    SVGElement,
    LinkStyle {
    var disabled: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/media) */
    var media: MediaQuery

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/title) */
    var title: String
}
