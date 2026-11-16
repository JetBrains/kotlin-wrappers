// Automatically generated - do not modify!

package web.dom

import js.internal.InternalApi

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface HTMLOrSVGOrMathMLElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autofocus)
     */
    var autofocus: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dataset)
     */
    val dataset: DOMStringMap

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/nonce)
     */
    var nonce: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/tabIndex)
     */
    var tabIndex: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/blur)
     */
    fun blur()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/focus)
     */
    fun focus(options: FocusOptions = definedExternally)
}
