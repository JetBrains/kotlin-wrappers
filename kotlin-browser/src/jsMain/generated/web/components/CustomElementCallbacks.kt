// Automatically generated - do not modify!

package web.components

external interface CustomElementCallbacks {
    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#connectedcallback)
     */
    var connectedCallback: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#disconnectedcallback)
     */
    var disconnectedCallback: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#adoptedcallback)
     */
    var adoptedCallback: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#attributechangedcallback)
     */
    var attributeChangedCallback: AttributeChangedCallback?
        get() = definedExternally
        set(value) = definedExternally
}
