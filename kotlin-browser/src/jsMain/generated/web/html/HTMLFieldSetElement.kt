// Automatically generated - do not modify!

package web.html

/**
 * Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <fieldset> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement)
 */
abstract external class HTMLFieldSetElement :
    HTMLElement {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/disabled) */
    var disabled: Boolean

    /**
     * Returns an HTMLCollection of the form controls in the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/elements)
     */
    val elements: HTMLCollection<*>

    /**
     * Retrieves a reference to the form that the object is embedded in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/form)
     */
    val form: HTMLFormElement?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/name) */
    var name: String

    /**
     * Returns the string "fieldset".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/type)
     */
    val type: String

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/validationMessage)
     */
    val validationMessage: String

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/validity)
     */
    val validity: ValidityState

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/willValidate)
     */
    val willValidate: Boolean

    /** Returns whether a form will validate when it is submitted, without having to submit it. */
    fun checkValidity(): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/reportValidity) */
    fun reportValidity(): Boolean

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    fun setCustomValidity(error: String)
}
