// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.inspector

import node.events.EventType
import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ConsoleEvent {
    companion object {
        @JsValue("Console.messageAdded")
        val MESSAGE_ADDED: MESSAGE_ADDED
    }

    sealed interface MESSAGE_ADDED : EventType
}
