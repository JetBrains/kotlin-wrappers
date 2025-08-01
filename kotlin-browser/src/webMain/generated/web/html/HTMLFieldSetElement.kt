// Automatically generated - do not modify!

package web.html

import web.form.FormControl
import web.validation.ValidityState

/**
 * The **`HTMLFieldSetElement`** interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of fieldset elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement)
 */
open external class HTMLFieldSetElement
protected constructor() :
    HTMLElement,
    FormControl {
    /**
     * The **`disabled`** property of the HTMLFieldSetElement interface is a boolean value that reflects the fieldset element's `disabled` attribute, which indicates whether the control is disabled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`elements`** read-only property of the HTMLFieldSetElement interface returns an HTMLCollection object containing all form control elements (button, fieldset, input, object, output, select, and textarea) that are descendants of this field set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/elements)
     */
    val elements: HTMLCollection<*>

    /**
     * The **`form`** read-only property of the HTMLFieldSetElement interface returns an HTMLFormElement object that owns this fieldset, or `null` if this fieldset is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/form)
     */
    override val form: HTMLFormElement?

    /**
     * The **`name`** property of the HTMLFieldSetElement interface indicates the name of the fieldset element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/name)
     */
    override var name: String

    /**
     * The **`type`** read-only property of the HTMLFieldSetElement interface returns the string `'fieldset'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/type)
     */
    val type: String

    /**
     * The **`validationMessage`** read-only property of the HTMLFieldSetElement interface returns a string representing a localized message that describes the validation constraints that the fieldset control does not satisfy (if any).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/validationMessage)
     */
    override val validationMessage: String

    /**
     * The **`validity`** read-only property of the HTMLFieldSetElement interface returns a ValidityState object that represents the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/validity)
     */
    override val validity: ValidityState

    /**
     * The **`willValidate`** read-only property of the HTMLFieldSetElement interface returns `false`, because fieldset elements are not candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/willValidate)
     */
    override val willValidate: Boolean

    /**
     * The **`checkValidity()`** method of the HTMLFieldSetElement interface checks if the element is valid, but always returns true because fieldset elements are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * The **`reportValidity()`** method of the HTMLFieldSetElement interface performs the same validity checking steps as the HTMLFieldSetElement.checkValidity method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * The **`setCustomValidity()`** method of the HTMLFieldSetElement interface sets the custom validity message for the fieldset element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)
}
