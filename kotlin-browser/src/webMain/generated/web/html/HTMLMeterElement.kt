// Automatically generated - do not modify!

package web.html

import web.dom.NodeList

/**
 * The HTML <meter> elements expose the **`HTMLMeterElement`** interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <meter> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement)
 */
open external class HTMLMeterElement
protected constructor() :
    HTMLElement {
    /**
     * The **`high`** property of the HTMLMeterElement interface represents the high boundary of the <meter> element as a floating-point number. It reflects the element's high attribute, or the value of max if not defined. The value of high is clamped by the low and max values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/high)
     */
    open var high: Double

    /**
     * The **`HTMLMeterElement.labels`** read-only property returns a NodeList of the <label> elements associated with the <meter> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/labels)
     */
    open val labels: NodeList<HTMLLabelElement>

    /**
     * The **`low`** property of the HTMLMeterElement interface represents the low boundary of the <meter> element as a floating-point number. It reflects the element's low attribute, or the value of min if not defined. The value of low is clamped by the min and max values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/low)
     */
    open var low: Double

    /**
     * The **`max`** property of the HTMLMeterElement interface represents the maximum value of the <meter> element as a floating-point number. It reflects the element's max attribute, or the min value if no max is set, or 1 if neither the min or the max is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/max)
     */
    open var max: Double

    /**
     * The **`min`** property of the HTMLMeterElement interface represents the minimum value of the <meter> element as a floating-point number. It reflects the element's min attribute, or 0 if no min is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/min)
     */
    open var min: Double

    /**
     * The **`optimum`** property of the HTMLMeterElement interface represents the optimum boundary of the <meter> element as a floating-point number. It reflects the element's optimum attribute, or the midpoint between min and max values if not defined. The value of optimum is clamped by the min and max values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/optimum)
     */
    open var optimum: Double

    /**
     * The **`value`** property of the HTMLMeterElement interface represents the current value of the <meter> element as a floating-point number. It reflects the element's value attribute. If no value is set, it is the HTMLMeterElement.min value or 0, whichever is greater.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/value)
     */
    open var value: Double
}
