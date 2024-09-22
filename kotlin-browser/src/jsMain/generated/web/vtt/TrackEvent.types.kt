// Automatically generated - do not modify!

package web.vtt

import seskar.js.JsValue
import web.events.EventType

sealed external class TrackEventTypes {

    @JsValue("addtrack")
    val ADD_TRACK: EventType<TrackEvent>

    @JsValue("removetrack")
    val REMOVE_TRACK: EventType<TrackEvent>
}
