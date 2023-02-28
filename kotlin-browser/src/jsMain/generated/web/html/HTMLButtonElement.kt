// Automatically generated - do not modify!

package web.html

import web.dom.NodeListOf

abstract external class HTMLButtonElement :
    HTMLElement {
    var disabled: Boolean

    /** Retrieves a reference to the form that the object is embedded in. */
    val form: HTMLFormElement?

    /** Overrides the action attribute (where the data on a form is sent) on the parent form element. */
    var formAction: String

    /** Used to override the encoding (formEnctype attribute) specified on the form element. */
    var formEnctype: String

    /** Overrides the submit method attribute previously specified on a form element. */
    var formMethod: String

    /** Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option. */
    var formNoValidate: Boolean

    /** Overrides the target attribute on a form element. */
    var formTarget: String
    val labels: NodeListOf<HTMLLabelElement>

    /** Sets or retrieves the name of the object. */
    var name: String

    /** Gets the classification and default behavior of the button. */
    var type: ButtonType

    /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
    val validationMessage: String

    /** Returns a  ValidityState object that represents the validity states of an element. */
    val validity: ValidityState

    /** Sets or retrieves the default or selected value of the control. */
    var value: String

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
