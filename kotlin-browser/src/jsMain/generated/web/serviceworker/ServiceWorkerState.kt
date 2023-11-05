// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
