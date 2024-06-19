// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class HashChangeEventTypes {

    @JsValue("hashchange")
    fun <C : EventTarget> hashChange(): EventType<HashChangeEvent, C>
}
