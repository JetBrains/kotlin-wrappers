// Automatically generated - do not modify!

package web.html

import js.core.JsIterable
import web.dom.NodeListOf

abstract external class HTMLSelectElement :
    HTMLElement,
    JsIterable<HTMLOptionElement> {
    var autocomplete: String
    var disabled: Boolean

    /** Retrieves a reference to the form that the object is embedded in. */
    val form: HTMLFormElement?
    val labels: NodeListOf<HTMLLabelElement>

    /** Sets or retrieves the number of objects in a collection. */
    var length: Int

    /** Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list. */
    var multiple: Boolean

    /** Sets or retrieves the name of the object. */
    var name: String

    /** Returns an HTMLOptionsCollection of the list of options. */
    val options: HTMLOptionsCollection

    /** When present, marks an element that can't be submitted without a value. */
    var required: Boolean

    /** Sets or retrieves the index of the selected option in a select object. */
    var selectedIndex: Int
    val selectedOptions: HTMLCollectionOf<HTMLOptionElement>

    /** Sets or retrieves the number of rows in the list box. */
    var size: Int

    /** Retrieves the type of select control based on the value of the MULTIPLE attribute. */
    val type: String

    /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
    val validationMessage: String

    /** Returns a  ValidityState object that represents the validity states of an element. */
    val validity: ValidityState

    /** Sets or retrieves the value which is returned to the server when the form control is submitted. */
    var value: String

    /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
    val willValidate: Boolean

    /**
     * Adds an element to the areas, controlRange, or options collection.
     * @param element Variant of type Number that specifies the index position in the collection where the element is placed. If no value is given, the method places the element at the end of the collection.
     * @param before Variant of type Object that specifies an element to insert before, or null to append the object to the collection.
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

    /** Returns whether a form will validate when it is submitted, without having to submit it. */
    fun checkValidity(): Boolean

    /**
     * Retrieves a select object or an object from an options collection.
     * @param name Variant of type Number or String that specifies the object or collection to retrieve. If this parameter is an integer, it is the zero-based index of the object. If this parameter is a string, all objects with matching name or id properties are retrieved, and a collection is returned if more than one match is made.
     * @param index Variant of type Number that specifies the zero-based index of the object to retrieve when a collection is returned.
     */
    fun item(index: Int): HTMLOptionElement?

    /**
     * Retrieves a select object or an object from an options collection.
     * @param namedItem A String that specifies the name or id property of the object to retrieve. A collection is returned if more than one match is made.
     */
    fun namedItem(name: String): HTMLOptionElement?

    /**
     * Removes an element from the collection.
     * @param index Number that specifies the zero-based index of the element to remove from the collection.
     */
    override fun remove()
    fun remove(index: Int)
    fun reportValidity(): Boolean

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    fun setCustomValidity(error: String)
    // [name: number]: HTMLOptionElement | HTMLOptGroupElement
}
