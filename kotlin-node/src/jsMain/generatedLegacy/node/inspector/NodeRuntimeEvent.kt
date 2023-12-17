// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface NodeRuntimeEvent {
    companion object {
        @JsValue("NodeRuntime.waitingForDisconnect")
        val WAITING_FOR_DISCONNECT: WAITING_FOR_DISCONNECT
    }

    sealed interface WAITING_FOR_DISCONNECT : EventType
}
