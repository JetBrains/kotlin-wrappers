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
     * The read-only **`HTMLLabelElement.control`** property returns a reference to the control (in the form of an object of type HTMLElement or one of its derivatives) with which the label element is associated, or `null` if the label isn't associated with a control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/control)
     */
    val control: HTMLElement?

    /**
     * The **`form`** read-only property of the HTMLLabelElement interface returns an HTMLFormElement object that owns the HTMLLabelElement.control associated with this label, or `null` if this label is not associated with a control owned by a form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/form)
     */
    val form: HTMLFormElement?

    /**
     * The **`HTMLLabelElement.htmlFor`** property reflects the value of the `for` content property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/htmlFor)
     */
    var htmlFor: String
}
