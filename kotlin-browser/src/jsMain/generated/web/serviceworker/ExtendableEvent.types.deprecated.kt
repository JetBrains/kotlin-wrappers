// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external class ExtendableEventTypes_deprecated {

    @JsValue("activate")
    fun activate(): EventType<ExtendableEvent>

    @JsValue("install")
    fun install(): EventType<ExtendableEvent>
}
