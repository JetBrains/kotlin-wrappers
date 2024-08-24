// Automatically generated - do not modify!

package web.vtt

import seskar.js.JsValue
import web.events.EventType

sealed external class TrackEventTypes {

    @JsValue("addtrack")
    fun addTrack(): EventType<TrackEvent>

    @JsValue("removetrack")
    fun removeTrack(): EventType<TrackEvent>
}
