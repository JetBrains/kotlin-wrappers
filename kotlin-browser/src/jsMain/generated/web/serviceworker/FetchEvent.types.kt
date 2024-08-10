// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class FetchEventTypes {

    @JsValue("fetch")
    fun <C : EventTarget> fetch(): EventType<FetchEvent, C>
}
