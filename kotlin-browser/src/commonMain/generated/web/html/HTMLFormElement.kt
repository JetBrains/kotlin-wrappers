// Automatically generated - do not modify!

package web.html

import js.array.ArrayLike
import js.core.JsString
import js.iterable.JsIterable
import web.autofill.AutoFillBase
import web.dom.DOMTokenList
import web.dom.Element
import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.events.JsEvent
import web.form.FormDataEvent
import web.form.FormEncType
import web.form.FormMethod
import web.form.SubmitEvent
import web.window.WindowTarget
import kotlin.js.definedExternally

/**
 * The **`HTMLFormElement`** interface represents a form element in the DOM.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement)
 */
open external class HTMLFormElement
protected constructor() :
    HTMLElement,
    ArrayLike<Element>,
    JsIterable<Element> {
    /**
     * The **`HTMLFormElement.acceptCharset`** property represents the character encoding for the given form element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/acceptCharset)
     */
    var acceptCharset: String

    /**
     * The **`HTMLFormElement.action`** property represents the action of the form element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/action)
     */
    var action: String

    /**
     * The **`autocomplete`** property of the HTMLFormElement interface indicates whether the value of the form's controls can be automatically completed by the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/autocomplete)
     */
    var autocomplete: AutoFillBase

    /**
     * The HTMLFormElement property **`elements`** returns an the form element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/elements)
     */
    val elements: HTMLFormControlsCollection

    /**
     * The **`HTMLFormElement.encoding`** property is an alternative name for the HTMLFormElement.enctype element on the DOM HTMLFormElement object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/encoding)
     */
    var encoding: String

    /**
     * The **`HTMLFormElement.enctype`** property is the MIME_type of content that is used to submit the form to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/enctype)
     */
    var enctype: FormEncType

    /**
     * The **`HTMLFormElement.length`** read-only property returns the number of controls in the form element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/length)
     */
    override val length: Int

    /**
     * The **`HTMLFormElement.method`** property represents the Unless explicitly specified, the default method is 'get'.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/method)
     */
    var method: FormMethod

    /**
     * The **`HTMLFormElement.name`** property represents the name of the current form element as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/name)
     */
    var name: String

    /**
     * The **`noValidate`** property of the HTMLFormElement interface is a boolean value indicating if the form will bypass constraint validation when submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/noValidate)
     */
    var noValidate: Boolean

    /**
     * The **`rel`** property of the HTMLFormElement interface reflects the `rel` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/rel)
     */
    var rel: String

    /**
     * The **`relList`** read-only property of the HTMLFormElement interface reflects the `rel` attribute.
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
     * The **`checkValidity()`** method of the HTMLFormElement interface returns a boolean value which indicates if all associated controls meet any constraint validation rules applied to them.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/checkValidity)
     */
    fun checkValidity(): Boolean

    /**
     * The **`reportValidity()`** method of the HTMLFormElement interface performs the same validity checking steps as the HTMLFormElement.checkValidity method.
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
     * The **`HTMLFormElement.reset()`** method restores a form element's default values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset)
     */
    fun reset()

    /**
     * The **`HTMLFormElement.submit()`** method submits a given This method is similar, but not identical to, activating a form's submit - No HTMLFormElement/submit_event event is raised.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit)
     */
    fun submit()
    // [name: string]: any
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/formdata_event)
     */
    @JsEvent("formdata")
    val formDataEvent: EventInstance<FormDataEvent, HTMLFormElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset_event)
     */
    @JsEvent("reset")
    val resetEvent: EventInstance<Event, HTMLFormElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit_event)
     */
    @JsEvent("submit")
    val submitEvent: EventInstance<SubmitEvent, HTMLFormElement /* this */, Node>
}
