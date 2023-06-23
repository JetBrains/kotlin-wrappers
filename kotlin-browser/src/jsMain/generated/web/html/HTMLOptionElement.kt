// Automatically generated - do not modify!

package web.html

/**
 * <option> elements and inherits all classes and methods of the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement)
 */
abstract external class HTMLOptionElement :
    HTMLElement {
    /**
     * Sets or retrieves the status of an option.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/defaultSelected)
     */
    var defaultSelected: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/disabled) */
    var disabled: Boolean

    /**
     * Retrieves a reference to the form that the object is embedded in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/form)
     */
    val form: HTMLFormElement?

    /**
     * Sets or retrieves the ordinal position of an option in a list box.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/index)
     */
    val index: Int

    /**
     * Sets or retrieves a value that you can use to implement your own label functionality for the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/label)
     */
    var label: String

    /**
     * Sets or retrieves whether the option in the list box is the default item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/selected)
     */
    var selected: Boolean

    /**
     * Sets or retrieves the text string specified by the option tag.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/text)
     */
    var text: String

    /**
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/value)
     */
    var value: String
}
