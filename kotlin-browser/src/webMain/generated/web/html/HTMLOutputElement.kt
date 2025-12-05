// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.dom.ElementId
import web.dom.NodeList
import web.form.FormControl
import web.validation.ValidityState

/**
 * The **`HTMLOutputElement`** interface provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement)
 */
open external class HTMLOutputElement
protected constructor() :
    HTMLElement,
    FormControl {
    /**
     * The **`defaultValue`** property of the HTMLOutputElement interface represents the default text content of this <output> element. Getting and setting this value is equivalent to getting and setting textContent on the <output>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/defaultValue)
     */
    var defaultValue: String

    /**
     * The **`form`** read-only property of the HTMLOutputElement interface returns an HTMLFormElement object that owns this <output>, or null if this output is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/form)
     */
    override val form: HTMLFormElement?

    /**
     * The read-only **`htmlFor`** property of the HTMLOutputElement returns a live DOMTokenList object containing a list of ids of those elements contributing input values to (or otherwise affected) the calculation. It reflects the <output> element's for content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/htmlFor)
     */
    val htmlFor: DOMTokenList<ElementId>

    /**
     * The **`HTMLOutputElement.labels`** read-only property returns a NodeList of the <label> elements associated with the <output> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/labels)
     */
    override val labels: NodeList<HTMLLabelElement>

    /**
     * The **`name`** property of the HTMLOutputElement interface indicates the name of the <output> element. It reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/name)
     */
    override var name: String

    /**
     * The **`type`** read-only property of the HTMLOutputElement interface returns the string "output".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/type)
     */
    val type: String

    /**
     * The **`validationMessage`** read-only property of the HTMLOutputElement interface returns a string representing a localized message that describes the validation constraints that the <output> control does not satisfy (if any). This is the empty string as <output> elements are not candidates for constraint validation (HTMLOutputElement.willValidate is false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validationMessage)
     */
    override val validationMessage: String

    /**
     * The **`validity`** read-only property of the HTMLOutputElement interface returns a ValidityState object that represents the validity states this element is in. Although <output> elements are never candidates for constraint validation, the validity state may still be invalid if a custom validity message has been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validity)
     */
    override val validity: ValidityState

    /**
     * The **`value`** property of the HTMLOutputElement interface represents the value of the <output> element as a string, or the empty string if no value is set. It returns or sets the contents of the element, similar to the textContent property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/value)
     */
    var value: String

    /**
     * The **`willValidate`** read-only property of the HTMLOutputElement interface returns false, because <output> elements are not candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/willValidate)
     */
    override val willValidate: Boolean

    /**
     * The **`checkValidity()`** method of the HTMLOutputElement interface checks if the element is valid, but always returns true because <output> elements are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * The **`reportValidity()`** method of the HTMLOutputElement interface performs the same validity checking steps as the checkValidity() method. It always returns true because <output> elements are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * The **`setCustomValidity()`** method of the HTMLOutputElement interface sets the custom validity message for the <output> element. Use the empty string to indicate that the element does not have a custom validity error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)
}
