// Automatically generated - do not modify!

package web.html

import web.autofill.AutoFill
import web.dom.Node
import web.dom.NodeList
import web.events.Event
import web.events.EventInstance
import web.form.FormControl
import web.selection.SelectionDirection
import web.validation.ValidityState
import kotlin.js.definedExternally

/**
 * The **`HTMLTextAreaElement`** interface provides properties and methods for manipulating the layout and presentation of <textarea> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement)
 */
open external class HTMLTextAreaElement
protected constructor() :
    HTMLElement,
    FormControl {
    /**
     * The **`autocomplete`** property of the HTMLTextAreaElement interface indicates whether the value of the control can be automatically completed by the browser. It reflects the <textarea> element's autocomplete attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/autocomplete)
     */
    var autocomplete: AutoFill

    /**
     * The **`cols`** property of the HTMLTextAreaElement interface is a positive integer representing the visible width of the multi-line text control, in average character widths. It reflects the <textarea> element's cols attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/cols)
     */
    var cols: Int

    /**
     * The **`defaultValue`** property of the HTMLTextAreaElement interface represents the default text content of this text area. Getting and setting this value is equivalent to getting and setting textContent on the <textarea>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/defaultValue)
     */
    var defaultValue: String

    /**
     * The **`dirName`** property of the HTMLTextAreaElement interface is the directionality of the element. It reflects the value of the <textarea> element's dirName attribute. This property can be retrieved or set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/dirName)
     */
    var dirName: String

    /**
     * The **`disabled`** property of the HTMLTextAreaElement interface indicates whether this multi-line text control is disabled and cannot be interacted with. It reflects the <textarea> element's disabled attribute. When false, this textarea may still be disabled if its containing element, such as a <fieldset>, is disabled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`form`** read-only property of the HTMLTextAreaElement interface returns an HTMLFormElement object that owns this <textarea>, or null if this textarea is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/form)
     */
    override val form: HTMLFormElement?

    /**
     * The **`HTMLTextAreaElement.labels`** read-only property returns a NodeList of the <label> elements associated with the <textArea> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/labels)
     */
    override val labels: NodeList<HTMLLabelElement>

    /**
     * The **`maxLength`** property of the HTMLTextAreaElement interface indicates the maximum number of characters (in UTF-16 code units) allowed to be entered for the value of the <textarea> element, and the maximum number of characters allowed for the value to be valid. It reflects the element's maxlength attribute. -1 means there is no limit on the length of the value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/maxLength)
     */
    var maxLength: Int

    /**
     * The **`minLength`** property of the HTMLTextAreaElement interface indicates the minimum number of characters (in UTF-16 code units) required for the value of the <textarea> element to be valid. It reflects the element's minlength attribute. -1 means there is no minimum length requirement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/minLength)
     */
    var minLength: Int

    /**
     * The **`name`** property of the HTMLTextAreaElement interface indicates the name of the <textarea> element. It reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/name)
     */
    override var name: String

    /**
     * The **`placeholder`** property of the HTMLTextAreaElement interface represents a hint to the user of what can be entered in the control. It reflects the <textarea> element's placeholder attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/placeholder)
     */
    var placeholder: String

    /**
     * The **`readOnly`** property of the HTMLTextAreaElement interface indicates that the user cannot modify the value of the control. Unlike the disabled attribute, the readonly attribute does not prevent the user from clicking or selecting in the control. It reflects the <textarea> element's readonly attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/readOnly)
     */
    var readOnly: Boolean

    /**
     * The **`required`** property of the HTMLTextAreaElement interface specifies that the user must fill in a value before submitting a form. It reflects the <textarea> element's required attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/required)
     */
    var required: Boolean

    /**
     * The **`rows`** property of the HTMLTextAreaElement interface is a positive integer representing the visible text lines of the text control. It reflects the <textarea> element's rows attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/rows)
     */
    var rows: Int

    /**
     * The **`selectionDirection`** property of the HTMLTextAreaElement interface specifies the current direction of the selection. The possible values are "forward", "backward", and "none". The forward value indicates the selection was performed in the start-to-end direction of the current locale, with backward indicating the opposite direction. The none value occurs if the direction is unknown. It can be used to both retrieve and change the direction of the <textarea>s selected text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionDirection)
     */
    var selectionDirection: SelectionDirection

    /**
     * The **`selectionEnd`** property of the HTMLTextAreaElement interface specifies the end position of the current text selection in a <textarea> element. It is a number representing the last index of the selected text. It can be used to both retrieve and set the index of the end of a <textarea>s selected text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionEnd)
     */
    var selectionEnd: Int

    /**
     * The **`selectionStart`** property of the HTMLTextAreaElement interface specifies the start position of the current text selection in a <textarea> element. It is a number representing the beginning index of the selected text. It can be used to both retrieve and set the start of the index of the beginning of a <textarea>s selected text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionStart)
     */
    var selectionStart: Int

    /**
     * The **`textLength`** read-only property of the HTMLTextAreaElement interface is a non-negative integer representing the number of characters, in UTF-16 code units, of the <textarea> element's value. It is a shortcut of accessing length on its value property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/textLength)
     */
    val textLength: Int

    /**
     * The **`type`** read-only property of the HTMLTextAreaElement interface returns the string "textarea".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/type)
     */
    val type: String

    /**
     * The **`validationMessage`** read-only property of the HTMLTextAreaElement interface returns a string representing a localized message that describes the validation constraints that the <textarea> control does not satisfy (if any). This is the empty string if the control is not a candidate for constraint validation (HTMLTextAreaElement.willValidate is false), or it satisfies its constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/validationMessage)
     */
    override val validationMessage: String

    /**
     * The **`validity`** read-only property of the HTMLTextAreaElement interface returns a ValidityState object that represents the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/validity)
     */
    override val validity: ValidityState

    /**
     * The **`value`** property of the HTMLTextAreaElement interface represents the value of the <textarea> element as a string, which is an empty string if the widget contains no content. It returns or sets the raw value contained in the control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/value)
     */
    var value: String

    /**
     * The **`willValidate`** read-only property of the HTMLTextAreaElement interface indicates whether the <textarea> element is a candidate for constraint validation. It is false if any conditions bar it from constraint validation, such as when its disabled or readOnly property is true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/willValidate)
     */
    override val willValidate: Boolean

    /**
     * The **`wrap`** property of the HTMLTextAreaElement interface indicates how the control should wrap the value for form submission. It reflects the <textarea> element's wrap attribute. Note that the "hard" value only has an effect when the cols attribute is also set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/wrap)
     */
    var wrap: String

    /**
     * The **`checkValidity()`** method of the HTMLTextAreaElement interface returns a boolean value which indicates if the element meets any constraint validation rules applied to it. If false, the method also fires an invalid event on the element. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * The **`reportValidity()`** method of the HTMLTextAreaElement interface performs the same validity checking steps as the checkValidity() method. In addition, if the invalid event is not canceled, the browser displays the problem to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * The **`select()`** method of the HTMLTextAreaElement interface selects the entire contents of the <textarea> element. In addition, the select event is fired. The select() method does not take any parameters and does not return a value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/select)
     */
    fun select()

    /**
     * The **`setCustomValidity()`** method of the HTMLTextAreaElement interface sets the custom validity message for the <textarea> element. Use the empty string to indicate that the element does not have a custom validity error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)

    /**
     * The **`setRangeText()`** method of the HTMLTextAreaElement interface replaces a range of text in a <textarea> element with new text passed as the argument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setRangeText)
     */
    fun setRangeText(replacement: String)
    fun setRangeText(
        replacement: String,
        start: Int,
        end: Int,
        selectionMode: SelectionMode = definedExternally,
    )

    /**
     * The **`setSelectionRange()`** method of the HTMLTextAreaElement interface sets the start and end positions of the current text selection, and optionally the direction, in a <textarea> element. This updates the selection state immediately, though the visual highlight only appears when the element is focused. The direction indicates the in which selection should be considered to have occurred; for example, that the selection was set by the user clicking and dragging from the end of the selected text toward the beginning. In addition, the select and selectionchange events are fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setSelectionRange)
     */
    fun setSelectionRange(
        start: Int?,
        end: Int?,
        direction: SelectionDirection = definedExternally,
    )
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/invalid_event)
 */
inline val <C : HTMLTextAreaElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "invalid")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/select_event)
 */
inline val <C : HTMLTextAreaElement> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "select")
