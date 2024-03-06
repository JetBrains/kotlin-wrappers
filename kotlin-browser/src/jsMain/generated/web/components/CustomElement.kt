// Automatically generated - do not modify!

package web.components

external interface CustomElement {
    interface WithCallbacks :
        WithConnectedCallback,
        WithDisconnectedCallback,
        WithAdoptedCallback,
        WithAttributeChangedCallback

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#connectedcallback)
     */
    interface WithConnectedCallback {
        fun connectedCallback()
    }

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#disconnectedcallback)
     */
    interface WithDisconnectedCallback {
        fun disconnectedCallback()
    }

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#adoptedcallback)
     */
    interface WithAdoptedCallback {
        fun adoptedCallback()
    }

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#attributechangedcallback)
     */
    interface WithAttributeChangedCallback {
        fun attributeChangedCallback(
            name: String,
            oldValue: Any?,
            newValue: Any?,
        )
    }
}
