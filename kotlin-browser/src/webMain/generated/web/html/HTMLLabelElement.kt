// Automatically generated - do not modify!

package web.html

import web.dom.ElementId

/**
 * The **`HTMLLabelElement`** interface gives access to properties specific to <label> elements. It inherits methods and properties from the base HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement)
 */
open external class HTMLLabelElement
protected constructor() :
    HTMLElement {
    /**
     * The read-only **`HTMLLabelElement.control`** property returns a reference to the control (in the form of an object of type HTMLElement or one of its derivatives) with which the <label> element is associated, or null if the label isn't associated with a control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/control)
     */
    val control: HTMLElement?

    /**
     * The **`form`** read-only property of the HTMLLabelElement interface returns an HTMLFormElement object that owns the control associated with this <label>, or null if this label is not associated with a labelable form-associated element (<button>, <input>, <output>, <select>, <textarea>, or form-associated custom elements) that is owned by a form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/form)
     */
    val form: HTMLFormElement?

    /**
     * The **`HTMLLabelElement.htmlFor`** property reflects the value of the for content property. That means that this script-accessible property is used to set and read the value of the content property for, which is the ID of the label's associated control element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/htmlFor)
     */
    var htmlFor: ElementId
}
