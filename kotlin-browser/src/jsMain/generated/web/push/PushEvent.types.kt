// Automatically generated - do not modify!

package web.push

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class PushEventTypes {

    @JsValue("push")
    fun <C : EventTarget> push(): EventType<PushEvent<C>>
}
