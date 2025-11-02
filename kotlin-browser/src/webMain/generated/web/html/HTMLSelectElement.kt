// Automatically generated - do not modify!

package web.html

import js.iterable.JsIterable
import web.autofill.AutoFill
import web.dom.Node
import web.dom.NodeList
import web.events.Event
import web.events.EventInstance
import web.form.FormControl
import web.validation.ValidityState
import kotlin.js.definedExternally

/**
 * The **`HTMLSelectElement`** interface represents a <select> HTML Element. These elements also share all of the properties and methods of other HTML elements via the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement)
 */
open external class HTMLSelectElement
protected constructor() :
    HTMLElement,
    JsIterable<HTMLOptionElement>,
    FormControl {
    /**
     * The **`autocomplete`** property of the HTMLSelectElement interface indicates whether the value of the control can be automatically completed by the browser. It reflects the <select> element's autocomplete attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/autocomplete)
     */
    var autocomplete: AutoFill

    /**
     * The **`HTMLSelectElement.disabled`** property is a boolean value that reflects the disabled HTML attribute, which indicates whether the control is disabled. If it is disabled, it does not accept clicks. A disabled element is unusable and un-clickable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`form`** read-only property of the HTMLSelectElement interface returns an HTMLFormElement object that owns this <select>, or null if this select is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/form)
     */
    override val form: HTMLFormElement?

    /**
     * The **`HTMLSelectElement.labels`** read-only property returns a NodeList of the <label> elements associated with the <select> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/labels)
     */
    override val labels: NodeList<HTMLLabelElement>

    /**
     * The **`length`** property of the HTMLSelectElement interface specifies the number of <option> elements in the <select> element. It represents the number of nodes in the options collection. On setting, it acts as (HTMLOptionsCollection.length).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/length)
     */
    var length: Int

    /**
     * The **`multiple`** property of the HTMLSelectElement interface specifies that the user may select more than one option from the list of options. It reflects the <select> element's multiple attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/multiple)
     */
    var multiple: Boolean

    /**
     * The **`name`** property of the HTMLSelectElement interface indicates the name of the <select> element. It reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/name)
     */
    override var name: String

    /**
     * The **`HTMLSelectElement.options`** read-only property returns a HTMLOptionsCollection of the <option> elements contained by the <select> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/options)
     */
    val options: HTMLOptionsCollection

    /**
     * The **`required`** property of the HTMLSelectElement interface specifies that the user must select an option with a non-empty string value before submitting a form. It reflects the <select> element's required attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/required)
     */
    var required: Boolean

    /**
     * The **`selectedIndex`** property of the HTMLSelectElement interface is the numeric index of the first selected <option> element in a <select> element, if any, or −1 if no <option> is selected. Setting this property selects the option at that index and deselects all other options, while setting it to -1 deselects any currently selected options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/selectedIndex)
     */
    var selectedIndex: Int

    /**
     * The read-only HTMLSelectElement property **`selectedOptions`** contains a list of the <option> elements contained within the <select> element that are currently selected. The list of selected options is an HTMLCollection object with one entry per currently selected option.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/selectedOptions)
     */
    val selectedOptions: HTMLCollection<HTMLOptionElement>

    /**
     * The **`size`** property of the HTMLSelectElement interface specifies the number of options, or rows, that should be visible at one time. It reflects the <select> element's size attribute. If omitted, the value is 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/size)
     */
    var size: Int

    /**
     * The **`HTMLSelectElement.type`** read-only property returns the form control's type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/type)
     */
    val type: SelectType

    /**
     * The **`validationMessage`** read-only property of the HTMLSelectElement interface returns a string representing a localized message that describes the validation constraints that the <select> control does not satisfy (if any). This is the empty string if the control is not a candidate for constraint validation (HTMLSelectElement.willValidate is false), or it satisfies its constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/validationMessage)
     */
    override val validationMessage: String

    /**
     * The **`validity`** read-only property of the HTMLSelectElement interface returns a ValidityState object that represents the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/validity)
     */
    override val validity: ValidityState

    /**
     * The **`HTMLSelectElement.value`** property contains the value of the first selected <option> element associated with this <select> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/value)
     */
    var value: String

    /**
     * The **`willValidate`** read-only property of the HTMLSelectElement interface indicates whether the <select> element is a candidate for constraint validation. It is false if any conditions bar it from constraint validation, such as when its disabled property is true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/willValidate)
     */
    override val willValidate: Boolean

    /**
     * The **`HTMLSelectElement.add()`** method adds an element to the collection of option elements for this select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/add)
     */
    fun add(
        element: HTMLOptionElement,
        before: HTMLElement? = definedExternally,
    )

    fun add(
        element: HTMLOptionElement,
        before: Int?,
    )

    fun add(
        element: HTMLOptGroupElement,
        before: HTMLElement? = definedExternally,
    )

    fun add(
        element: HTMLOptGroupElement,
        before: Int?,
    )

    /**
     * The **`checkValidity()`** method of the HTMLSelectElement interface returns a boolean value which indicates if the element meets any constraint validation rules applied to it. If false, the method also fires an invalid event on the element. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * The **`HTMLSelectElement.item()`** method returns the Element corresponding to the HTMLOptionElement whose position in the options list corresponds to the index given in the parameter, or null if there are none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/item)
     */
    fun item(index: Int): HTMLOptionElement?

    /**
     * The **`HTMLSelectElement.namedItem()`** method returns the HTMLOptionElement corresponding to the HTMLOptionElement whose name or id match the specified name, or null if no option matches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/namedItem)
     */
    fun namedItem(name: String): HTMLOptionElement?

    /**
     * The **`HTMLSelectElement.remove()`** method removes the element at the specified index from the options collection for this select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/remove)
     */
    override fun remove()
    fun remove(index: Int)

    /**
     * The **`reportValidity()`** method of the HTMLSelectElement interface performs the same validity checking steps as the checkValidity() method. In addition, if the invalid event is not canceled, the browser displays the problem to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * The **`HTMLSelectElement.setCustomValidity()`** method sets the custom validity message for the selection element to the specified message. Use the empty string to indicate that the element does not have a custom validity error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)

    /**
     * The **`HTMLSelectElement.showPicker()`** method displays the browser picker for a select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/showPicker)
     */
    fun showPicker()
    // [name: number]: HTMLOptionElement | HTMLOptGroupElement
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/change_event)
 */
inline val <C : HTMLSelectElement> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "change")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/invalid_event)
 */
inline val <C : HTMLSelectElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "invalid")
