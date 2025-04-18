// Automatically generated - do not modify!

package web.html

/**
 * The **`HTMLLabelElement`** interface gives access to properties specific to label elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement)
 */
open external class HTMLLabelElement
protected constructor() :
    HTMLElement {
    /**
     * Returns the form control that is associated with this element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/control)
     */
    val control: HTMLElement?

    /**
     * Retrieves a reference to the form that the object is embedded in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/form)
     */
    val form: HTMLFormElement?

    /**
     * Sets or retrieves the object to which the given label object is assigned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/htmlFor)
     */
    var htmlFor: String
}
