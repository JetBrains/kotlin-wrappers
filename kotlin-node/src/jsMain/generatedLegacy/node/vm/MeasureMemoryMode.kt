// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.vm

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MeasureMemoryMode {
    companion object {
        @JsValue("summary")
        val summary: MeasureMemoryMode

        @JsValue("detailed")
        val detailed: MeasureMemoryMode
    }
}
