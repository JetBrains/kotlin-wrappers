// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external class ExtendableEventTypes :
    ExtendableEventTypes_deprecated {

    @JsValue("activate")
    val ACTIVATE: EventType<ExtendableEvent>

    @JsValue("install")
    val INSTALL: EventType<ExtendableEvent>
}
