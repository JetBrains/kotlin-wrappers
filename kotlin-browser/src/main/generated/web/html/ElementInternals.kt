// Automatically generated - do not modify!

package web.html

import dom.NodeList
import web.aria.ARIAMixin

sealed external interface ElementInternals :
    ARIAMixin {
    /** Returns the form owner of internals's target element. */
    val form: HTMLFormElement?

    /** Returns a NodeList of all the label elements that internals's target element is associated with. */
    val labels: NodeList<*>

    /** Returns the ShadowRoot for internals's target element, if the target element is a shadow host, or null otherwise. */
    val shadowRoot: ShadowRoot?

    /** Returns the error message that would be shown to the user if internals's target element was to be checked for validity. */
    val validationMessage: String

    /** Returns the ValidityState object for internals's target element. */
    val validity: ValidityState

    /** Returns true if internals's target element will be validated when the form is submitted; false otherwise. */
    val willValidate: Boolean

    /** Returns true if internals's target element has no validity problems; false otherwise. Fires an invalid event at the element in the latter case. */
    fun checkValidity(): Boolean

    /** Returns true if internals's target element has no validity problems; otherwise, returns false, fires an invalid event at the element, and (if the event isn't canceled) reports the problem to the user. */
    fun reportValidity(): Boolean

    /**
     * Sets both the state and submission value of internals's target element to value.
     *
     * If value is null, the element won't participate in form submission.
     */
    fun setFormValue(
        value: Any /* File | String | FormData */?,
        state: Any /* File | String | FormData */? = definedExternally,
    )

    /** Marks internals's target element as suffering from the constraints indicated by the flags argument, and sets the element's validation message to message. If anchor is specified, the user agent might use it to indicate problems with the constraints of internals's target element when the form owner is validated interactively or reportValidity() is called. */
    fun setValidity(
        flags: ValidityStateFlags = definedExternally,
        message: String = definedExternally,
        anchor: HTMLElement = definedExternally,
    )
}
