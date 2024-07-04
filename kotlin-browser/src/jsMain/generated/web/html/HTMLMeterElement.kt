// Automatically generated - do not modify!

package web.html

import web.dom.NodeListOf

/**
 * The HTML <meter> elements expose the HTMLMeterElement interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <meter> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement)
 */
open external class HTMLMeterElement
protected constructor() :
    HTMLElement {
    var high: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/labels)
     */
    val labels: NodeListOf<HTMLLabelElement>
    var low: Double
    var max: Double
    var min: Double
    var optimum: Double
    var value: Double
}
