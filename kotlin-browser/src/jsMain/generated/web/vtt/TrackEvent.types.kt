// Automatically generated - do not modify!

package web.vtt

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class TrackEventTypes {

    @JsValue("addtrack")
    fun <C : EventTarget> addTrack(): EventType<TrackEvent, C>

    @JsValue("removetrack")
    fun <C : EventTarget> removeTrack(): EventType<TrackEvent, C>
}
