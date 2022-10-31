// Automatically generated - do not modify!

package dom.html

import dom.NodeListOf
import kotlinx.js.ReadonlyArray
import web.file.FileList
import web.filesystem.FileSystemEntry
import kotlin.js.Date

abstract external class HTMLInputElement :
    HTMLElement {
    /** Sets or retrieves a comma-separated list of content types. */
    var accept: String

    /** Sets or retrieves a text alternative to the graphic. */
    var alt: String

    /** Specifies whether autocomplete is applied to an editable text field. */
    var autocomplete: String
    var capture: String

    /** Sets or retrieves the state of the check box or radio button. */
    var checked: Boolean

    /** Sets or retrieves the state of the check box or radio button. */
    var defaultChecked: Boolean

    /** Sets or retrieves the initial contents of the object. */
    var defaultValue: String
    var dirName: String
    var disabled: Boolean

    /** Returns a FileList object on a file type input object. */
    var files: FileList?

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

    /** Sets or retrieves the height of the object. */
    var height: Double

    /** When set, overrides the rendering of checkbox controls so that the current value is not visible. */
    var indeterminate: Boolean
    val labels: NodeListOf<HTMLLabelElement>?

    /** Specifies the ID of a pre-defined datalist of options for an input element. */
    val list: HTMLElement?

    /** Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field. */
    var max: String

    /** Sets or retrieves the maximum number of characters that the user can enter in a text control. */
    var maxLength: Int

    /** Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field. */
    var min: String
    var minLength: Int

    /** Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list. */
    var multiple: Boolean

    /** Sets or retrieves the name of the object. */
    var name: String

    /** Gets or sets a string containing a regular expression that the user's input must match. */
    var pattern: String

    /** Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field. */
    var placeholder: String
    var readOnly: Boolean

    /** When present, marks an element that can't be submitted without a value. */
    var required: Boolean
    var selectionDirection: String /* "forward" | "backward" | "none" */?

    /** Gets or sets the end position or offset of a text selection. */
    var selectionEnd: Int?

    /** Gets or sets the starting position or offset of a text selection. */
    var selectionStart: Int?
    var size: Int

    /** The address or URL of the a media resource that is to be considered. */
    var src: String

    /** Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field. */
    var step: String

    /** Returns the content type of the object. */
    var type: String

    /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
    val validationMessage: String

    /** Returns a  ValidityState object that represents the validity states of an element. */
    val validity: ValidityState

    /** Returns the value of the data at the cursor's current position. */
    var value: String

    /** Returns a Date object representing the form control's value, if applicable; otherwise, returns null. Can be set, to change the value. Throws an "InvalidStateError" DOMException if the control isn't date- or time-based. */
    var valueAsDate: Date?

    /** Returns the input field value as a number. */
    var valueAsNumber: Double
    val webkitEntries: ReadonlyArray<FileSystemEntry>
    var webkitdirectory: Boolean

    /** Sets or retrieves the width of the object. */
    var width: Double

    /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
    val willValidate: Boolean

    /** Returns whether a form will validate when it is submitted, without having to submit it. */
    fun checkValidity(): Boolean
    fun reportValidity(): Boolean

    /** Makes the selection equal to the current object. */
    fun select()

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    fun setCustomValidity(error: String)
    fun setRangeText(replacement: String)
    fun setRangeText(
        replacement: String,
        start: Number,
        end: Number,
        selectionMode: SelectionMode = definedExternally,
    )

    /**
     * Sets the start and end positions of a selection in a text field.
     * @param start The offset into the text field for the start of the selection.
     * @param end The offset into the text field for the end of the selection.
     * @param direction The direction in which the selection is performed.
     */
    fun setSelectionRange(
        start: Number?,
        end: Number?,
        direction: String /* "forward" | "backward" | "none" */ = definedExternally,
    )

    fun showPicker()

    /**
     * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
     * @param n Value to decrement the value by.
     */
    fun stepDown(n: Number = definedExternally)

    /**
     * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
     * @param n Value to increment the value by.
     */
    fun stepUp(n: Number = definedExternally)
}
