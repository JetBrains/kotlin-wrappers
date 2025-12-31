// Automatically generated - do not modify!

package web.html

import js.array.ReadonlyArray
import js.date.Date
import web.autofill.AutoFill
import web.dom.Node
import web.dom.NodeList
import web.events.Event
import web.events.EventInstance
import web.file.FileList
import web.form.FormControl
import web.form.FormEncType
import web.form.FormMethod
import web.fs.FileSystemEntry
import web.popover.PopoverTargetAttributes
import web.selection.SelectionDirection
import web.validation.ValidityState
import web.window.WindowName
import kotlin.js.definedExternally

/**
 * The **`HTMLInputElement`** interface provides special properties and methods for manipulating the options, layout, and presentation of <input> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement)
 */
open external class HTMLInputElement
protected constructor() :
    HTMLElement,
    PopoverTargetAttributes,
    FormControl {
    /**
     * The **`accept`** property of the HTMLInputElement interface reflects the <input> element's accept attribute, generally a comma-separated list of unique file type specifiers providing a hint for the expected file type for an <input> of type file. If the attribute is not explicitly set, the accept property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/accept)
     */
    var accept: String

    /**
     * The **`alt`** property of the HTMLInputElement interface defines the textual label for the button for users and user agents who cannot use the image. It reflects the <input> element's alt attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/alt)
     */
    var alt: String

    /**
     * The **`autocomplete`** property of the HTMLInputElement interface indicates whether the value of the control can be automatically completed by the browser. It reflects the <input> element's autocomplete attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/autocomplete)
     */
    var autocomplete: AutoFill

    /**
     * The **`capture`** property of the HTMLInputElement interface reflects the <input> element's capture attribute. Only relevant to the <input> of type file, the property and attribute specify whether, a new file should be captured from a user-facing (user) or outward facing (environment) camera or microphone. The type of file is defined the accept attribute. If the attribute is not explicitly set, the capture property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/capture)
     */
    var capture: String

    /**
     * The **`checked`** property of the HTMLInputElement interface specifies the current checkedness of the element; that is, whether the form control is checked or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/checked)
     */
    var checked: Boolean

    /**
     * The **`defaultChecked`** property of the HTMLInputElement interface specifies the default checkedness state of the element. This property reflects the <input> element's checked attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/defaultChecked)
     */
    var defaultChecked: Boolean

    /**
     * The **`defaultValue`** property of the HTMLInputElement interface indicates the original (or default) value of the <input> element. It reflects the element's value attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/defaultValue)
     */
    var defaultValue: String

    /**
     * The **`dirName`** property of the HTMLInputElement interface is the directionality of the element and enables the submission of that value. It reflects the value of the <input> element's dirName attribute. This property can be retrieved or set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/dirName)
     */
    var dirName: String

    /**
     * The **`HTMLInputElement.disabled`** property is a boolean value that reflects the disabled HTML attribute, which indicates whether the control is disabled. If it is disabled, it does not accept clicks. A disabled element is unusable and un-clickable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`HTMLInputElement.files`** property allows you to access the FileList selected with the <input type="file"> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/files)
     */
    var files: FileList?

    /**
     * The **`form`** read-only property of the HTMLInputElement interface returns an HTMLFormElement object that owns this <input>, or null if this input is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/form)
     */
    override val form: HTMLFormElement?

    /**
     * The **`formAction`** property of the HTMLInputElement interface is the URL of the program that is executed on the server when the form that owns this control is submitted. It reflects the value of the <input>'s formaction attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formAction)
     */
    var formAction: String

    /**
     * The **`formEnctype`** property of the HTMLInputElement interface is the MIME type of the content sent to the server when the <input> with the formEnctype is the method of form submission. It reflects the value of the <input>'s formenctype attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formEnctype)
     */
    var formEnctype: FormEncType

    /**
     * The **`formMethod`** property of the HTMLInputElement interface is the HTTP method used to submit the <form> if the <input> element is the control that submits the form. It reflects the value of the <input>'s formmethod attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formMethod)
     */
    var formMethod: FormMethod

    /**
     * The **`formNoValidate`** property of the HTMLInputElement interface is a boolean value indicating if the <form> will bypass constraint validation when submitted via the <input>. It reflects the <input> element's formnovalidate attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formNoValidate)
     */
    var formNoValidate: Boolean

    /**
     * The **`formTarget`** property of the HTMLInputElement interface is the tab, window, or iframe where the response of the submitted <form> is to be displayed. It reflects the value of the <input> element's formtarget attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formTarget)
     */
    var formTarget: WindowName

    /**
     * The **`height`** property of the HTMLInputElement interface specifies the height of a control. It reflects the <input> element's height attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/height)
     */
    var height: Int

    /**
     * The **`indeterminate`** property of the HTMLInputElement interface returns a boolean value that indicates whether the checkbox is in the indeterminate state. For example, a "select all/deselect all" checkbox may be in the indeterminate state when some but not all of its sub-controls are checked. The indeterminate state can only be set via JavaScript and is only relevant to checkbox controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/indeterminate)
     */
    var indeterminate: Boolean

    /**
     * The **`HTMLInputElement.labels`** read-only property returns a NodeList of the <label> elements associated with the <input> element, if the element is not hidden. If the element has the type hidden, the property returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/labels)
     */
    override val labels: NodeList<HTMLLabelElement>?

    /**
     * The **`list`** read-only property of the HTMLInputElement interface returns the HTMLDataListElement pointed to by the list attribute of the element, or null if the list attribute is not defined or the list attribute's value is not associated with any <datalist> in the same tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/list)
     */
    val list: HTMLDataListElement?

    /**
     * The **`max`** property of the HTMLInputElement interface reflects the <input> element's max attribute, which generally defines the maximum valid value for a numeric or date-time input. If the attribute is not explicitly set, the max property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/max)
     */
    var max: String

    /**
     * The **`maxLength`** property of the HTMLInputElement interface indicates the maximum number of characters (in UTF-16 code units) allowed to be entered for the value of the <input> element, and the maximum number of characters allowed for the value to be valid. It reflects the element's maxlength attribute. -1 means there is no limit on the length of the value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/maxLength)
     */
    var maxLength: Int

    /**
     * The **`min`** property of the HTMLInputElement interface reflects the <input> element's min attribute, which generally defines the minimum valid value for a numeric or date-time input. If the attribute is not explicitly set, the min property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/min)
     */
    var min: String

    /**
     * The **`minLength`** property of the HTMLInputElement interface indicates the minimum number of characters (in UTF-16 code units) required for the value of the <input> element to be valid. It reflects the element's minlength attribute. -1 means there is no minimum length requirement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/minLength)
     */
    var minLength: Int

    /**
     * The **`HTMLInputElement.multiple`** property indicates if an input can have more than one value. Firefox currently only supports multiple for <input type="file">.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/multiple)
     */
    var multiple: Boolean

    /**
     * The **`name`** property of the HTMLInputElement interface indicates the name of the <input> element. It reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/name)
     */
    override var name: String

    /**
     * The **`pattern`** property of the HTMLInputElement interface represents a regular expression a non-null <input> value should match. It reflects the <input> element's pattern attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/pattern)
     */
    var pattern: String

    /**
     * The **`placeholder`** property of the HTMLInputElement interface represents a hint to the user of what can be entered in the control. It reflects the <input> element's placeholder attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/placeholder)
     */
    var placeholder: String

    /**
     * The **`readOnly`** property of the HTMLInputElement interface indicates that the user cannot modify the value of the <input>. It reflects the <input> element's readonly boolean attribute; returning true if the attribute is present and false when omitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/readOnly)
     */
    var readOnly: Boolean

    /**
     * The **`required`** property of the HTMLInputElement interface specifies that the user must fill in a value before submitting a form. It reflects the <input> element's required attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/required)
     */
    var required: Boolean

    /**
     * The **`selectionDirection`** property of the HTMLInputElement interface is a string that indicates the direction in which the user is selecting the text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionDirection)
     */
    var selectionDirection: SelectionDirection?

    /**
     * The **`selectionEnd`** property of the HTMLInputElement interface is a number that represents the end index of the selected text. That is, it represents the index of the character immediately following the selection. Likewise, when there is no selection, this returns the offset of the character immediately following the current text input cursor position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionEnd)
     */
    var selectionEnd: Int?

    /**
     * The **`selectionStart`** property of the HTMLInputElement interface is a number that represents the beginning index of the selected text. When nothing is selected, then returns the position of the text input cursor (caret) inside of the <input> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionStart)
     */
    var selectionStart: Int?

    /**
     * The **`size`** property of the HTMLInputElement interface defines the number of visible characters displayed. It reflects the <input> element's size attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/size)
     */
    var size: Int

    /**
     * The **`src`** property of the HTMLInputElement interface specifies the source of an image to display as the graphical submit button. It reflects the <input> element's src attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/src)
     */
    var src: String

    /**
     * The **`step`** property of the HTMLInputElement interface indicates the step by which numeric or date-time <input> elements can change. It reflects the element's step attribute. Valid values include the string "any" or a string containing a positive floating point number. If the attribute is not explicitly set, the step property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/step)
     */
    var step: String

    /**
     * The **`type`** property of the HTMLInputElement interface indicates the kind of data allowed in the <input> element, for example a number, a date, or an email. Browsers will select the appropriate widget and behavior to help users to enter a valid value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/type)
     */
    var type: InputType

    /**
     * The **`validationMessage`** read-only property of the HTMLInputElement interface returns a string representing a localized message that describes the validation constraints that the <input> control does not satisfy (if any).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/validationMessage)
     */
    override val validationMessage: String

    /**
     * The **`validity`** read-only property of the HTMLInputElement interface returns a ValidityState object that represents the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/validity)
     */
    override val validity: ValidityState

    /**
     * The **`value`** property of the HTMLInputElement interface represents the current value of the <input> element as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/value)
     */
    var value: String

    /**
     * The **`valueAsDate`** property of the HTMLInputElement interface represents the current value of the <input> element as a Date, or null if conversion is not possible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/valueAsDate)
     */
    var valueAsDate: Date?

    /**
     * The **`valueAsNumber`** property of the HTMLInputElement interface represents the current value of the <input> element as a number or NaN if converting to a numeric value is not possible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/valueAsNumber)
     */
    var valueAsNumber: Double

    /**
     * The read-only **`webkitEntries`** property of the HTMLInputElement interface contains an array of file system entries (as objects based on FileSystemEntry) representing files and/or directories selected by the user using an <input> element of type file, but only if that selection was made using drag-and-drop: selecting a file in the dialog will leave the property empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/webkitEntries)
     */
    val webkitEntries: ReadonlyArray<FileSystemEntry>

    /**
     * The **`webkitdirectory`** property of the HTMLInputElement interface reflects the webkitdirectory HTML attribute, which indicates that <input type="file"> elements can only select directories instead of files.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/webkitdirectory)
     */
    var webkitdirectory: Boolean

    /**
     * The **`width`** property of the HTMLInputElement interface specifies the width of a control. It reflects the <input> element's width attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/width)
     */
    var width: Int

    /**
     * The **`willValidate`** read-only property of the HTMLInputElement interface indicates whether the <input> element is a candidate for constraint validation. It is false if any conditions bar it from constraint validation, including:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/willValidate)
     */
    override val willValidate: Boolean

    /**
     * The **`checkValidity()`** method of the HTMLInputElement interface returns a boolean value which indicates if the element meets any constraint validation rules applied to it. If false, the method also fires an invalid event on the element. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * The **`reportValidity()`** method of the HTMLInputElement interface performs the same validity checking steps as the checkValidity() method. In addition, if the invalid event is not canceled, the browser displays the problem to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * The **`HTMLInputElement.select()`** method selects all the text in a <textarea> element or in an <input> element that includes a text field.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/select)
     */
    fun select()

    /**
     * The **`HTMLInputElement.setCustomValidity()`** method sets a custom validity message for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)

    /**
     * The **`HTMLInputElement.setRangeText()`** method replaces a range of text in an <input> or <textarea> element with a new string.
     *
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
     * The **`HTMLInputElement.setSelectionRange()`** method sets the start and end positions of the current text selection in an <input> or <textarea> element. This updates the selection state immediately, though the visual highlight only appears when the element is focused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setSelectionRange)
     */
    fun setSelectionRange(
        start: Int?,
        end: Int?,
        direction: SelectionDirection = definedExternally,
    )

    /**
     * The **`HTMLInputElement.showPicker()`** method displays the browser picker for an input element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/showPicker)
     */
    fun showPicker()

    /**
     * The **`HTMLInputElement.stepDown()`** method decrements the value of a numeric type of <input> element by the value of the step attribute or up to n multiples of the step attribute if a number is passed as the parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/stepDown)
     */
    fun stepDown(n: Int = definedExternally)

    /**
     * The **`HTMLInputElement.stepUp()`** method increments the value of a numeric type of <input> element by the value of the step attribute, or the default step value if the step attribute is not explicitly set. The method, when invoked, increments the value by (step * n), where n defaults to 1 if not specified, and step defaults to the default value for step if not specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/stepUp)
     */
    fun stepUp(n: Int = definedExternally)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/cancel_event)
 */
inline val <C : HTMLInputElement> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "cancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/change_event)
 */
inline val <C : HTMLInputElement> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "change")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/invalid_event)
 */
inline val <C : HTMLInputElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "invalid")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/select_event)
 */
inline val <C : HTMLInputElement> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "select")
