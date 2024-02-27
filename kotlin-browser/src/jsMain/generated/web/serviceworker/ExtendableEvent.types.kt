// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class ExtendableEventTypes :
    ExtendableEventTypes_deprecated {

    @JsValue("activate")
    fun <C : EventTarget> activate(): EventType<ExtendableEvent<C>>

    @JsValue("install")
    fun <C : EventTarget> install(): EventType<ExtendableEvent<C>>
}
