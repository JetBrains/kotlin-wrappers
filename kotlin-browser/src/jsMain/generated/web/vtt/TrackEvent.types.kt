// Automatically generated - do not modify!

package web.vtt

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class TrackEventTypes {

    @JsValue("addtrack")
    fun <C : EventTarget> addTrack(): EventType<TrackEvent, C>

    @JsValue("removetrack")
    fun <C : EventTarget> removeTrack(): EventType<TrackEvent, C>
}
