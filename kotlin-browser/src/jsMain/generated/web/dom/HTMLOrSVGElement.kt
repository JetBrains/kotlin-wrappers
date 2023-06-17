// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.dom

external interface HTMLOrSVGElement {
    var autofocus: Boolean
        get() = definedExternally
        set(value) = definedExternally
    val dataset: DOMStringMap
        get() = definedExternally
    var nonce: String?
        get() = definedExternally
        set(value) = definedExternally
    var tabIndex: Int
        get() = definedExternally
        set(value) = definedExternally

    fun blur(): Unit = definedExternally
    fun focus(options: FocusOptions = definedExternally): Unit = definedExternally
}
