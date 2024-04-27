// Automatically generated - do not modify!

package web.workers

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WorkerType {
    companion object {
        @JsValue("classic")
        val classic: WorkerType

        @JsValue("module")
        val module: WorkerType
    }
}
