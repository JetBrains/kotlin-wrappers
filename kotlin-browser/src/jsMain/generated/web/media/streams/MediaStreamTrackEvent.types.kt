// Automatically generated - do not modify!

package web.media.streams

import seskar.js.JsValue
import web.events.EventType

sealed external class MediaStreamTrackEventTypes {

    @JsValue("addtrack")
    val ADD_TRACK: EventType<MediaStreamTrackEvent>

    @JsValue("removetrack")
    val REMOVE_TRACK: EventType<MediaStreamTrackEvent>
}
