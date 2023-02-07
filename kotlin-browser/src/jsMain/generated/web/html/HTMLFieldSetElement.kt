// Automatically generated - do not modify!

package web.html

abstract external class HTMLFieldSetElement :
    HTMLElement {
    var disabled: Boolean

    /** Returns an HTMLCollection of the form controls in the element. */
    val elements: HTMLCollection<*>

    /** Retrieves a reference to the form that the object is embedded in. */
    val form: HTMLFormElement?
    var name: String

    /** Returns the string "fieldset". */
    val type: String

    /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
    val validationMessage: String

    /** Returns a  ValidityState object that represents the validity states of an element. */
    val validity: ValidityState

    /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
    val willValidate: Boolean

    /** Returns whether a form will validate when it is submitted, without having to submit it. */
    fun checkValidity(): Boolean
    fun reportValidity(): Boolean

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    fun setCustomValidity(error: String)
}
