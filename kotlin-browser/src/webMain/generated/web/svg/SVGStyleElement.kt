// Automatically generated - do not modify!

package web.svg

import web.cssom.LinkStyle
import web.cssom.MediaQuery

/**
 * The **`SVGStyleElement`** interface corresponds to the SVG <style> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement)
 */
open external class SVGStyleElement
private constructor() :
    SVGElement,
    LinkStyle {
    /**
     * The **`SVGStyleElement.disabled`** property can be used to get and set whether the stylesheet is disabled (true) or not (false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`SVGStyleElement.media`** property is a media query string corresponding to the media attribute of the given SVG style element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/media)
     */
    var media: MediaQuery

    /**
     * The **`SVGStyleElement.title`** property is a string corresponding to the title attribute of the given SVG style element. It may be used to select between alternate style sheets.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/title)
     */
    var title: String
}
