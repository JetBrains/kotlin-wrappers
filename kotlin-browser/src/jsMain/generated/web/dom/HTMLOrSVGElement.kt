// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.dom

external interface HTMLOrSVGElement {
    var autofocus: Boolean
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dataset) */
    val dataset: DOMStringMap
        get() = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/nonce) */
    var nonce: String?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/tabIndex) */
    var tabIndex: Int
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/blur) */
    fun blur(): Unit = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/focus) */
    fun focus(options: FocusOptions = definedExternally): Unit = definedExternally
}
