// Automatically generated - do not modify!

package webvtt

import js.core.ArrayLike
import js.core.JsIterable
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList) */
sealed external class TextTrackList :
    EventTarget,
    ArrayLike<TextTrack>,
    JsIterable<TextTrack> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/addtrack_event) */
    var onaddtrack: EventHandler<TrackEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/change_event) */
    var onchange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/removetrack_event) */
    var onremovetrack: EventHandler<TrackEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/getTrackById) */
    fun getTrackById(id: String): TextTrack?
}
