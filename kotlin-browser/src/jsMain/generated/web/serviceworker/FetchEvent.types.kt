// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class FetchEventTypes {

    @JsValue("fetch")
    fun <C : EventTarget> fetch(): EventType<FetchEvent<C>>
}
