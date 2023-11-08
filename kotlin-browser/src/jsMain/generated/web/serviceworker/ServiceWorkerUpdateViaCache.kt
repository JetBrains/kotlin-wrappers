// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ServiceWorkerUpdateViaCache {
    companion object {
        @JsValue("all")
        val all: ServiceWorkerUpdateViaCache

        @JsValue("imports")
        val imports: ServiceWorkerUpdateViaCache

        @JsValue("none")
        val none: ServiceWorkerUpdateViaCache
    }
}
