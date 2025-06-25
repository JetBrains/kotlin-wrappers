// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.typedarrays

import seskar.js.JsValue

sealed external interface LastChunkHandling {
    companion object {
        @JsValue("loose")
        val loose: LastChunkHandling

        @JsValue("strict")
        val strict: LastChunkHandling

        @JsValue("stop-before-partial")
        val stopBeforePartial: LastChunkHandling
    }
}
