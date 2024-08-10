// Automatically generated - do not modify!

package web.html

import js.array.ReadonlyArray
import js.date.Date
import web.autofill.AutoFill
import web.dom.NodeListOf
import web.file.FileList
import web.form.FormControl
import web.form.FormEncType
import web.form.FormMethod
import web.fs.FileSystemEntry
import web.validation.ValidityState
import web.window.WindowName

/**
 * Provides special properties and methods for manipulating the options, layout, and presentation of <input> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement)
 */
open external class HTMLInputElement
protected constructor() :
    HTMLElement,
    PopoverInvokerElement,
    FormControl {
    /**
     * Sets or retrieves a comma-separated list of content types.
     */
    var accept: String

    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    var alt: String

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    var autocomplete: AutoFill
    var capture: String

    /**
     * Sets or retrieves the state of the check box or radio button.
     */
    var checked: Boolean

    /**
     * Sets or retrieves the state of the check box or radio button.
     */
    var defaultChecked: Boolean

    /**
     * Sets or retrieves the initial contents of the object.
     */
    var defaultValue: String
    var dirName: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/disabled)
     */
    var disabled: Boolean

    /**
     * Returns a FileList object on a file type input object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/files)
     */
    var files: FileList?

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
     * Sets or retrieves the height of the object.
     */
    var height: Int

    /**
     * When set, overrides the rendering of checkbox controls so that the current value is not visible.
     */
    var indeterminate: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/labels)
     */
    override val labels: NodeListOf<HTMLLabelElement>?

    /**
     * Specifies the ID of a pre-defined datalist of options for an input element.
     */
    val list: HTMLDataListElement?

    /**
     * Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field.
     */
    var max: String

    /**
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    var maxLength: Int

    /**
     * Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field.
     */
    var min: String
    var minLength: Int

    /**
     * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/multiple)
     */
    var multiple: Boolean

    /**
     * Sets or retrieves the name of the object.
     */
    override var name: String

    /**
     * Gets or sets a string containing a regular expression that the user's input must match.
     */
    var pattern: String

    /**
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    var placeholder: String
    var readOnly: Boolean

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    var required: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionDirection)
     */
    var selectionDirection: SelectionDirection?

    /**
     * Gets or sets the end position or offset of a text selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionEnd)
     */
    var selectionEnd: Int?

    /**
     * Gets or sets the starting position or offset of a text selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionStart)
     */
    var selectionStart: Int?
    var size: Int

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    var src: String

    /**
     * Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field.
     */
    var step: String

    /**
     * Returns the content type of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/type)
     */
    var type: InputType

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    override val validationMessage: String

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    override val validity: ValidityState

    /**
     * Returns the value of the data at the cursor's current position.
     */
    var value: String

    /**
     * Returns a Date object representing the form control's value, if applicable; otherwise, returns null. Can be set, to change the value. Throws an "InvalidStateError" DOMException if the control isn't date- or time-based.
     */
    var valueAsDate: Date?

    /**
     * Returns the input field value as a number.
     */
    var valueAsNumber: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/webkitEntries)
     */
    val webkitEntries: ReadonlyArray<FileSystemEntry>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/webkitdirectory)
     */
    var webkitdirectory: Boolean

    /**
     * Sets or retrieves the width of the object.
     */
    var width: Int

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    override val willValidate: Boolean

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * Makes the selection equal to the current object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/select)
     */
    fun select()

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setRangeText)
     */
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
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setSelectionRange)
     */
    fun setSelectionRange(
        start: Int?,
        end: Int?,
        direction: SelectionDirection = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/showPicker)
     */
    fun showPicker()

    /**
     * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
     * @param n Value to decrement the value by.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/stepDown)
     */
    fun stepDown(n: Int = definedExternally)

    /**
     * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
     * @param n Value to increment the value by.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/stepUp)
     */
    fun stepUp(n: Int = definedExternally)
}
