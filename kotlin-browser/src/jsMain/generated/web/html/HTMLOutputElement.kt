// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.dom.NodeListOf
import web.form.FormControl
import web.validation.ValidityState

/**
 * Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement)
 */
open external class HTMLOutputElement
protected constructor() :
    HTMLElement,
    FormControl {
    var defaultValue: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/form)
     */
    override val form: HTMLFormElement?
    val htmlFor: DOMTokenList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/labels)
     */
    override val labels: NodeListOf<HTMLLabelElement>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/name)
     */
    override var name: String

    /**
     * Returns the string "output".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/type)
     */
    val type: String
    override val validationMessage: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validity)
     */
    override val validity: ValidityState

    /**
     * Returns the element's current value.
     *
     * Can be set, to change the value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/value)
     */
    var value: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/willValidate)
     */
    override val willValidate: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/checkValidity)
     */
    override fun checkValidity(): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/reportValidity)
     */
    override fun reportValidity(): Boolean
    fun setCustomValidity(error: String)
}
