// Automatically generated - do not modify!

package web.html

import js.array.ArrayLike
import js.iterable.JsIterable
import web.autofill.AutoFillBase
import web.dom.DOMTokenList
import web.dom.Element
import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.form.FormDataEvent
import web.form.FormEncType
import web.form.FormMethod
import web.form.SubmitEvent
import web.window.WindowTarget
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`HTMLFormElement`** interface represents a <form> element in the DOM. It allows access to—and, in some cases, modification of—aspects of the form, as well as access to its component elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement)
 */
open external class HTMLFormElement
protected constructor() :
    HTMLElement,
    ArrayLike<Element>,
    JsIterable<Element> {
    /**
     * The **`HTMLFormElement.acceptCharset`** property represents the character encoding for the given <form> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/acceptCharset)
     */
    var acceptCharset: String

    /**
     * The **`HTMLFormElement.action`** property represents the action of the <form> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/action)
     */
    var action: String

    /**
     * The **`autocomplete`** property of the HTMLFormElement interface indicates whether the value of the form's controls can be automatically completed by the browser. It reflects the <form> element's autocomplete attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/autocomplete)
     */
    var autocomplete: AutoFillBase

    /**
     * The **`elements`** property of the HTMLFormElement interface returns an HTMLFormControlsCollection listing all the listed form controls associated with the <form> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/elements)
     */
    val elements: HTMLFormControlsCollection

    /**
     * The **`HTMLFormElement.encoding`** property is an alternative name for the enctype element on the DOM HTMLFormElement object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/encoding)
     */
    var encoding: String

    /**
     * The **`HTMLFormElement.enctype`** property is the MIME type of content that is used to submit the form to the server. Possible values are:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/enctype)
     */
    var enctype: FormEncType

    /**
     * The **`HTMLFormElement.length`** read-only property returns the number of controls in the <form> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/length)
     */
    override val length: Int

    /**
     * The **`HTMLFormElement.method`** property represents the HTTP method used to submit the <form>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/method)
     */
    var method: FormMethod

    /**
     * The **`HTMLFormElement.name`** property represents the name of the current <form> element as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/name)
     */
    var name: String

    /**
     * The **`noValidate`** property of the HTMLFormElement interface is a boolean value indicating if the <form> will bypass constraint validation when submitted. It reflects the <form> element's novalidate attribute; if the attribute present, the value is true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/noValidate)
     */
    var noValidate: Boolean

    /**
     * The **`rel`** property of the HTMLFormElement interface reflects the rel attribute. It is a string containing what kinds of links the HTML <form> element creates, as a space-separated list of enumerated values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/rel)
     */
    var rel: String

    /**
     * The **`relList`** read-only property of the HTMLFormElement interface reflects the rel attribute. It is a live DOMTokenList containing the set of link types indicating the relationship between the resource represented by the <form> element and the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/relList)
     */
    val relList: DOMTokenList<JsString>

    /**
     * The **`target`** property of the HTMLFormElement interface represents the target of the form's action (i.e., the frame in which to render its output).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/target)
     */
    var target: WindowTarget

    /**
     * The **`checkValidity()`** method of the HTMLFormElement interface returns a boolean value which indicates if all associated controls meet any constraint validation rules applied to them. The method also fires an invalid event on each invalid element, but not on the form element itself. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/checkValidity)
     */
    fun checkValidity(): Boolean

    /**
     * The **`reportValidity()`** method of the HTMLFormElement interface performs the same validity checking steps as the checkValidity() method. In addition, for each invalid event that was fired and not canceled, the browser displays the problem to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reportValidity)
     */
    fun reportValidity(): Boolean

    /**
     * The HTMLFormElement method **`requestSubmit()`** requests that the form be submitted using a specific submit button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/requestSubmit)
     */
    fun requestSubmit(submitter: HTMLElement? = definedExternally)

    /**
     * The **`HTMLFormElement.reset()`** method restores a form element's default values. This method does the same thing as clicking the form's <input type="reset"> control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset)
     */
    fun reset()

    /**
     * The **`HTMLFormElement.submit()`** method submits a given <form>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit)
     */
    fun submit()
    // [name: string]: any
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/formdata_event)
 */
inline val <C : HTMLFormElement> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, "formdata")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset_event)
 */
inline val <C : HTMLFormElement> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "reset")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit_event)
 */
inline val <C : HTMLFormElement> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, "submit")
