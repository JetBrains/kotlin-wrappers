// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class ExtendableEventTypes {

    @JsValue("activate")
    fun <C : EventTarget> activate(): EventType<ExtendableEvent, C>

    @JsValue("install")
    fun <C : EventTarget> install(): EventType<ExtendableEvent, C>
}
