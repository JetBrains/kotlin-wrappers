// Automatically generated - do not modify!

package web.components

external interface CustomElement {
    interface WithCallbacks :
        WithConnectedCallback,
        WithDisconnectedCallback,
        WithAdoptedCallback,
        WithAttributeChangedCallback

    interface WithConnectedCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#connectedcallback)
         */
        fun connectedCallback()
    }

    interface WithDisconnectedCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#disconnectedcallback)
         */
        fun disconnectedCallback()
    }

    interface WithAdoptedCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#adoptedcallback)
         */
        fun adoptedCallback()
    }

    interface WithAttributeChangedCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#attributechangedcallback)
         */
        fun attributeChangedCallback(
            name: String,
            oldValue: Any?,
            newValue: Any?,
        )
    }
}
