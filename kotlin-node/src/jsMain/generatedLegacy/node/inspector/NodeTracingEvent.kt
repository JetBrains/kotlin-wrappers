// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface NodeTracingEvent {
    companion object {
        @JsValue("NodeTracing.dataCollected")
        val DATA_COLLECTED: DATA_COLLECTED

        @JsValue("NodeTracing.tracingComplete")
        val TRACING_COMPLETE: TRACING_COMPLETE
    }

    sealed interface DATA_COLLECTED : EventType
    sealed interface TRACING_COMPLETE : EventType
}
