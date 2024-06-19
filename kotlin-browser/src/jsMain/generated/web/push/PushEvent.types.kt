// Automatically generated - do not modify!

package web.push

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class PushEventTypes {

    @JsValue("push")
    fun <C : EventTarget> push(): EventType<PushEvent, C>
}
