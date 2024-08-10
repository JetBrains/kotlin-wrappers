// Automatically generated - do not modify!

package tanstack.query.core

import seskar.js.JsValue

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
