// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ClientTypes {
    companion object {
        @JsValue("all")
        val all: ClientTypes

        @JsValue("sharedworker")
        val sharedworker: ClientTypes

        @JsValue("window")
        val window: ClientTypes

        @JsValue("worker")
        val worker: ClientTypes
    }
}
