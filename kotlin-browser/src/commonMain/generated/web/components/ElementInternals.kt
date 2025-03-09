// Automatically generated - do not modify!

package web.components

import web.aria.ARIAMixin
import web.dom.NodeListOf
import web.file.File
import web.form.FormData
import web.html.HTMLElement
import web.html.HTMLFormElement
import web.html.HTMLLabelElement
import web.validation.ValidationTarget
import web.validation.ValidityState
import web.validation.ValidityStateFlags

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals)
 */
external class ElementInternals
private constructor() :
    ARIAMixin,
    ValidationTarget {
    /**
     * Returns the form owner of internals's target element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/form)
     */
    val form: HTMLFormElement?

    /**
     * Returns a NodeList of all the label elements that internals's target element is associated with.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/labels)
     */
    val labels: NodeListOf<HTMLLabelElement>

    /**
     * Returns the ShadowRoot for internals's target element, if the target element is a shadow host, or null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/shadowRoot)
     */
    val shadowRoot: ShadowRoot?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/states)
     */
    val states: CustomStateSet

    /**
     * Returns the error message that would be shown to the user if internals's target element was to be checked for validity.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/validationMessage)
     */
    override val validationMessage: String

    /**
     * Returns the ValidityState object for internals's target element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/validity)
     */
    override val validity: ValidityState

    /**
     * Returns true if internals's target element will be validated when the form is submitted; false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/willValidate)
     */
    override val willValidate: Boolean

    /**
     * Returns true if internals's target element has no validity problems; false otherwise. Fires an invalid event at the element in the latter case.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * Returns true if internals's target element has no validity problems; otherwise, returns false, fires an invalid event at the element, and (if the event isn't canceled) reports the problem to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/reportValidity)
     */
    override fun reportValidity(): Boolean

    /**
     * Sets both the state and submission value of internals's target element to value.
     *
     * If value is null, the element won't participate in form submission.
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
     * Marks internals's target element as suffering from the constraints indicated by the flags argument, and sets the element's validation message to message. If anchor is specified, the user agent might use it to indicate problems with the constraints of internals's target element when the form owner is validated interactively or reportValidity() is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setValidity)
     */
    fun setValidity(
        flags: ValidityStateFlags = definedExternally,
        message: String = definedExternally,
        anchor: HTMLElement = definedExternally,
    )
}
