// Automatically generated - do not modify!

package web.html

import web.dom.NodeListOf

abstract external class HTMLProgressElement :
    HTMLElement {
    val labels: NodeListOf<HTMLLabelElement>

    /**
     * Defines the maximum, or "done" value for a progress element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/max)
     */
    var max: Double

    /**
     * Returns the quotient of value/max when the value attribute is set (determinate progress bar), or -1 when the value attribute is missing (indeterminate progress bar).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/position)
     */
    val position: Double

    /**
     * Sets or gets the current value of a progress element. The value must be a non-negative number between 0 and the max value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/value)
     */
    var value: Double
}
