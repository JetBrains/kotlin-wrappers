// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.dom.NodeListOf

abstract external class HTMLOutputElement :
    HTMLElement {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/defaultValue) */
    var defaultValue: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/form) */
    val form: HTMLFormElement?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/htmlFor) */
    val htmlFor: DOMTokenList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/labels) */
    val labels: NodeListOf<HTMLLabelElement>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/name) */
    var name: String

    /**
     * Returns the string "output".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/type)
     */
    val type: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validationMessage) */
    val validationMessage: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validity) */
    val validity: ValidityState

    /**
     * Returns the element's current value.
     *
     * Can be set, to change the value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/value)
     */
    var value: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/willValidate) */
    val willValidate: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/checkValidity) */
    fun checkValidity(): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/reportValidity) */
    fun reportValidity(): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/setCustomValidity) */
    fun setCustomValidity(error: String)
}
