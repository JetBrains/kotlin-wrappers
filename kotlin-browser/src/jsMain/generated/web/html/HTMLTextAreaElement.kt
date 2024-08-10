// Automatically generated - do not modify!

package web.html

import web.autofill.AutoFill
import web.dom.NodeListOf
import web.form.FormControl
import web.validation.ValidityState

/**
 * Provides special properties and methods for manipulating the layout and presentation of <textarea> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement)
 */
open external class HTMLTextAreaElement
protected constructor() :
    HTMLElement,
    FormControl {
    var autocomplete: AutoFill

    /**
     * Sets or retrieves the width of the object.
     */
    var cols: Int

    /**
     * Sets or retrieves the initial contents of the object.
     */
    var defaultValue: String
    var dirName: String
    var disabled: Boolean

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    override val form: HTMLFormElement?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/labels)
     */
    override val labels: NodeListOf<HTMLLabelElement>

    /**
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    var maxLength: Int
    var minLength: Int

    /**
     * Sets or retrieves the name of the object.
     */
    override var name: String

    /**
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    var placeholder: String

    /**
     * Sets or retrieves the value indicated whether the content of the object is read-only.
     */
    var readOnly: Boolean

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    var required: Boolean

    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     */
    var rows: Int
    var selectionDirection: SelectionDirection

    /**
     * Gets or sets the end position or offset of a text selection.
     */
    var selectionEnd: Int

    /**
     * Gets or sets the starting position or offset of a text selection.
     */
    var selectionStart: Int
    val textLength: Int

    /**
     * Retrieves the type of control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/type)
     */
    val type: String

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    override val validationMessage: String

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    override val validity: ValidityState

    /**
     * Retrieves or sets the text in the entry field of the textArea element.
     */
    var value: String

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    override val willValidate: Boolean

    /**
     * Sets or retrieves how to handle wordwrapping in the object.
     */
    var wrap: String

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    override fun checkValidity(): Boolean
    override fun reportValidity(): Boolean

    /**
     * Highlights the input area of a form element.
     */
    fun select()

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    fun setCustomValidity(error: String)
    fun setRangeText(replacement: String)
    fun setRangeText(
        replacement: String,
        start: Int,
        end: Int,
        selectionMode: SelectionMode = definedExternally,
    )

    /**
     * Sets the start and end positions of a selection in a text field.
     * @param start The offset into the text field for the start of the selection.
     * @param end The offset into the text field for the end of the selection.
     * @param direction The direction in which the selection is performed.
     */
    fun setSelectionRange(
        start: Int?,
        end: Int?,
        direction: SelectionDirection = definedExternally,
    )
}
