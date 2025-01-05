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
