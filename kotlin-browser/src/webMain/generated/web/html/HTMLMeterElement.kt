// Automatically generated - do not modify!

package web.html

import web.dom.NodeList

/**
 * The HTML meter elements expose the **`HTMLMeterElement`** interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of meter elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement)
 */
open external class HTMLMeterElement
protected constructor() :
    HTMLElement {
    /**
     * The **`high`** property of the HTMLMeterElement interface represents the high boundary of the meter element as a floating-point number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/high)
     */
    var high: Double

    /**
     * The **`HTMLMeterElement.labels`** read-only property returns a NodeList of the label elements associated with the meter element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/labels)
     */
    val labels: NodeList<HTMLLabelElement>

    /**
     * The **`low`** property of the HTMLMeterElement interface represents the low boundary of the meter element as a floating-point number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/low)
     */
    var low: Double

    /**
     * The **`max`** property of the HTMLMeterElement interface represents the maximum value of the meter element as a floating-point number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/max)
     */
    var max: Double

    /**
     * The **`min`** property of the HTMLMeterElement interface represents the minimum value of the meter element as a floating-point number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/min)
     */
    var min: Double

    /**
     * The **`optimum`** property of the HTMLMeterElement interface represents the optimum boundary of the meter element as a floating-point number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/optimum)
     */
    var optimum: Double

    /**
     * The **`value`** property of the HTMLMeterElement interface represents the current value of the meter element as a floating-point number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/value)
     */
    var value: Double
}
