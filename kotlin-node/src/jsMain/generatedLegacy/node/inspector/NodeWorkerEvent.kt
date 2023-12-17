// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface NodeWorkerEvent {
    companion object {
        @JsValue("NodeWorker.attachedToWorker")
        val ATTACHED_TO_WORKER: ATTACHED_TO_WORKER

        @JsValue("NodeWorker.detachedFromWorker")
        val DETACHED_FROM_WORKER: DETACHED_FROM_WORKER

        @JsValue("NodeWorker.receivedMessageFromWorker")
        val RECEIVED_MESSAGE_FROM_WORKER: RECEIVED_MESSAGE_FROM_WORKER
    }

    sealed interface ATTACHED_TO_WORKER : EventType
    sealed interface DETACHED_FROM_WORKER : EventType
    sealed interface RECEIVED_MESSAGE_FROM_WORKER : EventType
}
