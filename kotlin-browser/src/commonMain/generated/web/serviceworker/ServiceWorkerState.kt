// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.serviceworker

import seskar.js.JsValue

sealed external interface ServiceWorkerState {
    companion object {
        @JsValue("activated")
        val activated: ServiceWorkerState

        @JsValue("activating")
        val activating: ServiceWorkerState

        @JsValue("installed")
        val installed: ServiceWorkerState

        @JsValue("installing")
        val installing: ServiceWorkerState

        @JsValue("parsed")
        val parsed: ServiceWorkerState

        @JsValue("redundant")
        val redundant: ServiceWorkerState
    }
}
