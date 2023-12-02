// Automatically generated - do not modify!

package web.html

import js.iterable.JsIterable
import web.dom.NodeListOf

/**
 * A <select> HTML Element. These elements also share all of the properties and methods of other HTML elements via the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement)
 */
open external class HTMLSelectElement
protected constructor() : HTMLElement,
    JsIterable<HTMLOptionElement> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/autocomplete) */
    var autocomplete: AutoFill

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/disabled) */
    var disabled: Boolean

    /**
     * Retrieves a reference to the form that the object is embedded in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/form)
     */
    val form: HTMLFormElement?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/labels) */
    val labels: NodeListOf<HTMLLabelElement>

    /**
     * Sets or retrieves the number of objects in a collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/length)
     */
    var length: Int

    /**
     * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/multiple)
     */
    var multiple: Boolean

    /**
     * Sets or retrieves the name of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/name)
     */
    var name: String

    /**
     * Returns an HTMLOptionsCollection of the list of options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/options)
     */
    val options: HTMLOptionsCollection

    /**
     * When present, marks an element that can't be submitted without a value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/required)
     */
    var required: Boolean

    /**
     * Sets or retrieves the index of the selected option in a select object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/selectedIndex)
     */
    var selectedIndex: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/selectedOptions) */
    val selectedOptions: HTMLCollectionOf<HTMLOptionElement>

    /**
     * Sets or retrieves the number of rows in the list box.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/size)
     */
    var size: Int

    /**
     * Retrieves the type of select control based on the value of the MULTIPLE attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/type)
     */
    val type: String

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/validationMessage)
     */
    val validationMessage: String

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/validity)
     */
    val validity: ValidityState

    /**
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/value)
     */
    var value: String

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/willValidate)
     */
    val willValidate: Boolean

    /**
     * Adds an element to the areas, controlRange, or options collection.
     * @param element Variant of type Number that specifies the index position in the collection where the element is placed. If no value is given, the method places the element at the end of the collection.
     * @param before Variant of type Object that specifies an element to insert before, or null to append the object to the collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/add)
     */
    fun add(
        element: HTMLOptionElement,
        before: HTMLElement? = definedExternally,
    )

    fun add(
        element: HTMLOptionElement,
        before: Number?,
    )

    fun add(
        element: HTMLOptGroupElement,
        before: HTMLElement? = definedExternally,
    )

    fun add(
        element: HTMLOptGroupElement,
        before: Number?,
    )

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/checkValidity)
     */
    fun checkValidity(): Boolean

    /**
     * Retrieves a select object or an object from an options collection.
     * @param name Variant of type Number or String that specifies the object or collection to retrieve. If this parameter is an integer, it is the zero-based index of the object. If this parameter is a string, all objects with matching name or id properties are retrieved, and a collection is returned if more than one match is made.
     * @param index Variant of type Number that specifies the zero-based index of the object to retrieve when a collection is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/item)
     */
    fun item(index: Int): HTMLOptionElement?

    /**
     * Retrieves a select object or an object from an options collection.
     * @param namedItem A String that specifies the name or id property of the object to retrieve. A collection is returned if more than one match is made.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/namedItem)
     */
    fun namedItem(name: String): HTMLOptionElement?

    /**
     * Removes an element from the collection.
     * @param index Number that specifies the zero-based index of the element to remove from the collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/remove)
     */
    override fun remove()
    fun remove(index: Int)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/reportValidity) */
    fun reportValidity(): Boolean

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)
    // [name: number]: HTMLOptionElement | HTMLOptGroupElement
}
