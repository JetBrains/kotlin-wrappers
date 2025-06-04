// Automatically generated - do not modify!

package web.components

import web.aria.ARIAMixin
import web.dom.NodeList
import web.file.File
import web.form.FormData
import web.html.HTMLElement
import web.html.HTMLFormElement
import web.html.HTMLLabelElement
import web.validation.ValidationTarget
import web.validation.ValidityState
import web.validation.ValidityStateFlags
import kotlin.js.definedExternally

/**
 * The **`ElementInternals`** interface of the Document Object Model gives web developers a way to allow custom elements to fully participate in HTML forms.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals)
 */
external class ElementInternals
private constructor() :
    ARIAMixin,
    ValidationTarget {
    /**
     * The **`form`** read-only property of the ElementInternals interface returns the HTMLFormElement associated with this element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/form)
     */
    val form: HTMLFormElement?

    /**
     * The **`labels`** read-only property of the ElementInternals interface returns the labels associated with the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/labels)
     */
    val labels: NodeList<HTMLLabelElement>

    /**
     * The **`shadowRoot`** read-only property of the ElementInternals interface returns the ShadowRoot for this element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/shadowRoot)
     */
    val shadowRoot: ShadowRoot?

    /**
     * The **`states`** read-only property of the ElementInternals interface returns a CustomStateSet representing the possible states of the custom element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/states)
     */
    val states: CustomStateSet

    /**
     * The **`validationMessage`** read-only property of the ElementInternals interface returns the validation message for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/validationMessage)
     */
    override val validationMessage: String

    /**
     * The **`validity`** read-only property of the ElementInternals interface returns a ValidityState object which represents the different validity states the element can be in, with respect to constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/validity)
     */
    override val validity: ValidityState

    /**
     * The **`willValidate`** read-only property of the ElementInternals interface returns `true` if the element is a submittable element that is a candidate for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/willValidate)
     */
    override val willValidate: Boolean

    /**
     * The **`checkValidity()`** method of the ElementInternals interface checks if the element meets any constraint validation rules applied to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * The **`reportValidity()`** method of the ElementInternals interface checks if the element meets any constraint validation rules applied to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * The **`setFormValue()`** method of the ElementInternals interface sets the element's submission value and state, communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    fun setFormValue(
        value: File?,
        state: File? = definedExternally,
    )

    fun setFormValue(
        value: String?,
        state: String? = definedExternally,
    )

    fun setFormValue(
        value: FormData?,
        state: FormData? = definedExternally,
    )

    /**
     * The **`setValidity()`** method of the ElementInternals interface sets the validity of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setValidity)
     */
    fun setValidity(
        flags: ValidityStateFlags = definedExternally,
        message: String = definedExternally,
        anchor: HTMLElement = definedExternally,
    )
}
