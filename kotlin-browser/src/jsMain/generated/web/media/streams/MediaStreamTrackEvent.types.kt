// Automatically generated - do not modify!

package web.media.streams

import seskar.js.JsValue
import web.events.EventType

sealed external class MediaStreamTrackEventTypes {

    @JsValue("addtrack")
    fun addTrack(): EventType<MediaStreamTrackEvent>

    @JsValue("removetrack")
    fun removeTrack(): EventType<MediaStreamTrackEvent>
}
