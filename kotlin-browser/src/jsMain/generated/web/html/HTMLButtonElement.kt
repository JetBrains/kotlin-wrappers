// Automatically generated - do not modify!

package web.html

import web.dom.NodeListOf
import web.form.FormControl
import web.form.FormEncType
import web.form.FormMethod
import web.validation.ValidityState
import web.window.WindowName

/**
 * Provides properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <button> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement)
 */
open external class HTMLButtonElement
protected constructor() :
    HTMLElement,
    PopoverInvokerElement,
    FormControl {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/disabled)
     */
    var disabled: Boolean

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    override val form: HTMLFormElement?

    /**
     * Overrides the action attribute (where the data on a form is sent) on the parent form element.
     */
    var formAction: String

    /**
     * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    var formEnctype: FormEncType

    /**
     * Overrides the submit method attribute previously specified on a form element.
     */
    var formMethod: FormMethod

    /**
     * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    var formNoValidate: Boolean

    /**
     * Overrides the target attribute on a form element.
     */
    var formTarget: WindowName

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/labels)
     */
    override val labels: NodeListOf<HTMLLabelElement>

    /**
     * Sets or retrieves the name of the object.
     */
    override var name: String

    /**
     * Gets the classification and default behavior of the button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/type)
     */
    var type: ButtonType

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    override val validationMessage: String

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    override val validity: ValidityState

    /**
     * Sets or retrieves the default or selected value of the control.
     */
    var value: String

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    override val willValidate: Boolean

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    override fun checkValidity(): Boolean
    override fun reportValidity(): Boolean

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    fun setCustomValidity(error: String)
}
