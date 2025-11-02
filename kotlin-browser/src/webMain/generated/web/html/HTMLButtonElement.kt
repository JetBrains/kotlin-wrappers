// Automatically generated - do not modify!

package web.html

import web.command.Command
import web.dom.Element
import web.dom.NodeList
import web.events.Event
import web.events.EventInstance
import web.form.FormControl
import web.form.FormEncType
import web.form.FormMethod
import web.popover.PopoverTargetAttributes
import web.validation.ValidityState
import web.window.WindowName

/**
 * The **`HTMLButtonElement`** interface provides properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <button> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement)
 */
open external class HTMLButtonElement
protected constructor() :
    HTMLElement,
    PopoverTargetAttributes,
    FormControl {
    /**
     * The **`command`** property of the HTMLButtonElement interface gets and sets the action to be performed on an element being controlled by this button. For this to have an effect, commandfor must be set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/command)
     */
    var command: Command

    /**
     * The **`commandForElement`** property of the HTMLButtonElement interface gets and sets the element to control via a button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/commandForElement)
     */
    var commandForElement: Element?

    /**
     * The **`HTMLButtonElement.disabled`** property indicates whether the control is disabled, meaning that it does not accept any clicks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`form`** read-only property of the HTMLButtonElement interface returns an HTMLFormElement object that owns this <button>, or null if this button is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/form)
     */
    override val form: HTMLFormElement?

    /**
     * The **`formAction`** property of the HTMLButtonElement interface is the URL of the program that is executed on the server when the form that owns this control is submitted. It reflects the value of the <button>'s formaction attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formAction)
     */
    var formAction: String

    /**
     * The **`formEnctype`** property of the HTMLButtonElement interface is the MIME type of the content sent to the server when the form is submitted. It reflects the value of the <button>'s formenctype attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formEnctype)
     */
    var formEnctype: FormEncType

    /**
     * The **`formMethod`** property of the HTMLButtonElement interface is the HTTP method used to submit the <form> if the <button> element is the control that submits the form. It reflects the value of the <button>'s formmethod attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formMethod)
     */
    var formMethod: FormMethod

    /**
     * The **`formNoValidate`** property of the HTMLButtonElement interface is a boolean value indicating if the <form> will bypass constraint validation when submitted via the <button>. It reflects the <button> element's formnovalidate attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formNoValidate)
     */
    var formNoValidate: Boolean

    /**
     * The **`formTarget`** property of the HTMLButtonElement interface is the tab, window, or iframe where the response of the submitted <form> is to be displayed. It reflects the value of the <button> element's formtarget attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formTarget)
     */
    var formTarget: WindowName

    /**
     * The **`HTMLButtonElement.labels`** read-only property returns a NodeList of the <label> elements associated with the <button> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/labels)
     */
    override val labels: NodeList<HTMLLabelElement>

    /**
     * The **`name`** property of the HTMLButtonElement interface indicates the name of the <button> element or the empty string if the element has no name. It reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/name)
     */
    override var name: String

    /**
     * The **`type`** property of the HTMLButtonElement interface is a string that indicates the behavior type of the <button> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/type)
     */
    var type: ButtonType

    /**
     * The **`validationMessage`** read-only property of the HTMLButtonElement interface returns a string representing a localized message that describes the validation constraints that the <button> control does not satisfy (if any). This is the empty string if the control is not a candidate for constraint validation (the <button>'s type is button or reset), or it satisfies its constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/validationMessage)
     */
    override val validationMessage: String

    /**
     * The **`validity`** read-only property of the HTMLButtonElement interface returns a ValidityState object that represents the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/validity)
     */
    override val validity: ValidityState

    /**
     * The **`value`** property of the HTMLButtonElement interface represents the value of the <button> element as a string, or the empty string if no value is set. It reflects the element's value attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/value)
     */
    var value: String

    /**
     * The **`willValidate`** read-only property of the HTMLButtonElement interface indicates whether the <button> element is a candidate for constraint validation. It is false if any conditions bar it from constraint validation, including:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/willValidate)
     */
    override val willValidate: Boolean

    /**
     * The **`checkValidity()`** method of the HTMLButtonElement interface returns a boolean value which indicates if the element meets any constraint validation rules applied to it. If false, the method also fires an invalid event on the element. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no effect. It always returns true if the <button> element's type is "button" or "reset", because such buttons are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * The **`reportValidity()`** method of the HTMLButtonElement interface performs the same validity checking steps as the checkValidity() method. In addition, if the invalid event is not canceled, the browser displays the problem to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * The **`setCustomValidity()`** method of the HTMLButtonElement interface sets the custom validity message for the <button> element. Use the empty string to indicate that the element does not have a custom validity error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/invalid_event)
 */
inline val <C : HTMLButtonElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "invalid")
