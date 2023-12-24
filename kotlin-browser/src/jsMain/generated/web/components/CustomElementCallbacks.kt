// Automatically generated - do not modify!

package web.components

external interface CustomElementCallbacks {
    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#connectedcallback)
     */
    val connectedCallback: (() -> Unit)?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#disconnectedcallback)
     */
    val disconnectedCallback: (() -> Unit)?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#adoptedcallback)
     */
    val adoptedCallback: (() -> Unit)?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#attributechangedcallback)
     */
    val attributeChangedCallback: AttributeChangedCallback?
        get() = definedExternally
}
