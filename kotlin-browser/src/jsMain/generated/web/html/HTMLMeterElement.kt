// Automatically generated - do not modify!

package web.html

import web.dom.NodeListOf

/**
 * The HTML <meter> elements expose the HTMLMeterElement interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <meter> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement)
 */
abstract external class HTMLMeterElement :
    HTMLElement {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/high) */
    var high: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/labels) */
    val labels: NodeListOf<HTMLLabelElement>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/low) */
    var low: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/max) */
    var max: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/min) */
    var min: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/optimum) */
    var optimum: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/value) */
    var value: Double
}
