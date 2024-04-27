// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
