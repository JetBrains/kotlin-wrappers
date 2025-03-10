// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

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
