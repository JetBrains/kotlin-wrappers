// Automatically generated - do not modify!

package web.workers

import seskar.js.JsValue

sealed external interface WorkerType {
    companion object {
        @JsValue("classic")
        val classic: WorkerType

        @JsValue("module")
        val module: WorkerType
    }
}
