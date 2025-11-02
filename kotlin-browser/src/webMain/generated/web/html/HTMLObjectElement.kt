// Automatically generated - do not modify!

package web.html

import web.dom.Document
import web.form.FormControl
import web.validation.ValidityState
import web.window.WindowProxy

/**
 * The **`HTMLObjectElement`** interface provides special properties and methods (beyond those on the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <object> element, representing external resources.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement)
 */
open external class HTMLObjectElement
protected constructor() :
    HTMLElement,
    FormControl {
    /**
     * The **`contentDocument`** read-only property of the HTMLObjectElement interface Returns a Document representing the active document of the object element's nested browsing context, if any; otherwise null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/contentDocument)
     */
    val contentDocument: Document?

    /**
     * The **`contentWindow`** read-only property of the HTMLObjectElement interface returns a WindowProxy representing the window proxy of the object element's nested browsing context, if any; otherwise null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/contentWindow)
     */
    val contentWindow: WindowProxy?

    /**
     * The **`data`** property of the HTMLObjectElement interface returns a string that reflects the data HTML attribute, specifying the address of a resource's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/data)
     */
    var data: String

    /**
     * The **`form`** read-only property of the HTMLObjectElement interface returns an HTMLFormElement object that owns this <object>, or null if this object element is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/form)
     */
    override val form: HTMLFormElement?

    /**
     * The **`height`** property of the HTMLObjectElement interface Returns a string that reflects the height HTML attribute, specifying the displayed height of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/height)
     */
    var height: String

    /**
     * The **`name`** property of the HTMLObjectElement interface returns a string that reflects the name HTML attribute, specifying the name of the browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/name)
     */
    override var name: String

    /**
     * The **`type`** property of the HTMLObjectElement interface returns a string that reflects the type HTML attribute, specifying the MIME type of the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/type)
     */
    var type: String

    /**
     * The **`validationMessage`** read-only property of the HTMLObjectElement interface returns a string representing a localized message that describes the validation constraints that the control does not satisfy (if any). This is the empty string if the control is not a candidate for constraint validation (willValidate is false), or it satisfies its constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/validationMessage)
     */
    override val validationMessage: String

    /**
     * The **`validity`** read-only property of the HTMLObjectElement interface returns a ValidityState object that represents the validity states this element is in. Although <object> elements are never candidates for constraint validation, the validity state may still be invalid if a custom validity message has been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/validity)
     */
    override val validity: ValidityState

    /**
     * The **`width`** property of the HTMLObjectElement interface returns a string that reflects the width HTML attribute, specifying the displayed width of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/width)
     */
    var width: String

    /**
     * The **`willValidate`** read-only property of the HTMLObjectElement interface returns false, because <object> elements are not candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/willValidate)
     */
    override val willValidate: Boolean

    /**
     * The **`checkValidity()`** method of the HTMLObjectElement interface checks if the element is valid, but always returns true because <object> elements are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * The **`getSVGDocument()`** method of the HTMLObjectElement interface returns the Document object of the embedded SVG.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/getSVGDocument)
     */
    fun getSVGDocument(): Document?

    /**
     * The **`reportValidity()`** method of the HTMLObjectElement interface performs the same validity checking steps as the checkValidity() method. It always returns true because <object> elements are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * The **`setCustomValidity()`** method of the HTMLObjectElement interface sets a custom validity message for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/setCustomValidity)
     */
    fun setCustomValidity(error: String)
}
