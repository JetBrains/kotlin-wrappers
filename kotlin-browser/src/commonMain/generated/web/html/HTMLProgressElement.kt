// Automatically generated - do not modify!

package web.html

import web.dom.NodeList

/**
 * The **`HTMLProgressElement`** interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of progress elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement)
 */
open external class HTMLProgressElement
protected constructor() :
    HTMLElement {
    /**
     * The **`HTMLProgressElement.labels`** read-only property returns a NodeList of the label elements associated with the A NodeList containing the `<label>` elements associated with the `<progress>` element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/labels)
     */
    val labels: NodeList<HTMLLabelElement>

    /**
     * The **`max`** property of the HTMLProgressElement interface represents the upper bound of the progress element's range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/max)
     */
    var max: Double

    /**
     * The **`position`** read-only property of the HTMLProgressElement interface returns current progress of the progress element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/position)
     */
    val position: Double

    /**
     * The **`value`** property of the HTMLProgressElement interface represents the current progress of the progress element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/value)
     */
    var value: Double
}
