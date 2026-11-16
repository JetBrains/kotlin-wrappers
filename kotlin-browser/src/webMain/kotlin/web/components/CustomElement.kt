package web.components

external interface CustomElement {
    interface WithCallbacks :
        WithConnectedCallback,
        WithConnectedMoveCallback,
        WithDisconnectedCallback,
        WithAdoptedCallback,
        WithAttributeChangedCallback

    interface WithConnectedCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#connectedcallback)
         */
        fun connectedCallback()
    }

    interface WithConnectedMoveCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#connectedmovecallback)
         */
        fun connectedMoveCallback()
    }

    interface WithDisconnectedCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#disconnectedcallback)
         */
        fun disconnectedCallback()
    }

    interface WithAdoptedCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#adoptedcallback)
         */
        fun adoptedCallback()
    }

    interface WithAttributeChangedCallback {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#attributechangedcallback)
         */
        fun attributeChangedCallback(
            name: String,
            oldValue: JsAny?,
            newValue: JsAny?,
        )
    }
}
