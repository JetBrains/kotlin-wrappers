// Automatically generated - do not modify!

package web.vtt

import js.array.ArrayLike
import js.iterable.JsIterable
import web.events.*

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList)
 */
external class TextTrackList
private constructor() :
    EventTarget,
    ArrayLike<TextTrack>,
    JsIterable<TextTrack> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/addtrack_event)
     */
    var onaddtrack: EventHandler<TrackEvent, TextTrackList, TextTrackList>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/change_event)
     */
    var onchange: EventHandler<Event, TextTrackList, TextTrackList>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/removetrack_event)
     */
    var onremovetrack: EventHandler<TrackEvent, TextTrackList, TextTrackList>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/getTrackById)
     */
    fun getTrackById(id: String): TextTrack?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/addtrack_event)
     */
    @JsEvent("addtrack")
    val addTrackEvent: EventInstance<TrackEvent, TextTrackList /* this */, TextTrackList /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<Event, TextTrackList /* this */, TextTrackList /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/removetrack_event)
     */
    @JsEvent("removetrack")
    val removeTrackEvent: EventInstance<TrackEvent, TextTrackList /* this */, TextTrackList /* this */>
}
