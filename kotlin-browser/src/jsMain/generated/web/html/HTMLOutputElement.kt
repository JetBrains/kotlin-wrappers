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
    override val form: HTMLFormElement?
    val htmlFor: DOMTokenList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/labels)
     */
    override val labels: NodeListOf<HTMLLabelElement>
    override var name: String

    /**
     * Returns the string "output".
     */
    val type: String
    override val validationMessage: String
    override val validity: ValidityState

    /**
     * Returns the element's current value.
     *
     * Can be set, to change the value.
     */
    var value: String
    override val willValidate: Boolean
    override fun checkValidity(): Boolean
    override fun reportValidity(): Boolean
    fun setCustomValidity(error: String)
}
