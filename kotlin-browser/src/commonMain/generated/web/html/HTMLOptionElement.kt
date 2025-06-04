// Automatically generated - do not modify!

package web.html

/**
 * The **`HTMLOptionElement`** interface represents option elements and inherits all properties and methods of the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement)
 */
open external class HTMLOptionElement
protected constructor() :
    HTMLElement {
    /**
     * The **`defaultSelected`** property of the HTMLOptionElement interface specifies the default selected state of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/defaultSelected)
     */
    var defaultSelected: Boolean

    /**
     * The **`disabled`** property of the HTMLOptionElement is a boolean value that indicates whether the option element is unavailable to be selected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/disabled)
     */
    var disabled: Boolean

    /**
     * The **`form`** read-only property of the HTMLOptionElement interface returns an HTMLFormElement object that owns the HTMLSelectElement associated with this option, or `null` if this option is not associated with a select owned by a form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/form)
     */
    val form: HTMLFormElement?

    /**
     * The read-only **`index`** property of the HTMLOptionElement interface specifies the 0-based index of the element; that is, the position of the option within the list of options it belongs to, in tree-order, as an integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/index)
     */
    val index: Int

    /**
     * The **`label`** property of the HTMLOptionElement represents the text displayed for an option in a select element or as part of a list of suggestions in a datalist element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/label)
     */
    var label: String

    /**
     * The **`selected`** property of the HTMLOptionElement interface specifies the current selectedness of the element; that is, whether the option is selected or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/selected)
     */
    var selected: Boolean

    /**
     * The **`text`** property of the HTMLOptionElement represents the text inside the option element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/text)
     */
    var text: String

    /**
     * The **`value`** property of the HTMLOptionElement interface represents the value of the option element as a string, or the empty string if no value is set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/value)
     */
    var value: String
}
