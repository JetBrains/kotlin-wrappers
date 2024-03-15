// Automatically generated - do not modify!

package web.media.streams

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class MediaStreamTrackEventTypes {

    @JsValue("addtrack")
    fun <C : EventTarget> addTrack(): EventType<MediaStreamTrackEvent, C>

    @JsValue("removetrack")
    fun <C : EventTarget> removeTrack(): EventType<MediaStreamTrackEvent, C>
}
