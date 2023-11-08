// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface NotifyEventType {
    companion object {
        @JsValue("added")
        val added: NotifyEventType

        @JsValue("removed")
        val removed: NotifyEventType

        @JsValue("updated")
        val updated: NotifyEventType

        @JsValue("observerAdded")
        val observerAdded: NotifyEventType

        @JsValue("observerRemoved")
        val observerRemoved: NotifyEventType

        @JsValue("observerResultsUpdated")
        val observerResultsUpdated: NotifyEventType

        @JsValue("observerOptionsUpdated")
        val observerOptionsUpdated: NotifyEventType
    }
}
