// Automatically generated - do not modify!

package web.vtt

import js.array.ArrayLike
import js.iterable.JsIterable
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`TextTrackList`** interface is used to represent a list of the text tracks defined for the associated video or audio element, with each track represented by a separate TextTrack object in the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList)
 */
open external class TextTrackList
private constructor() :
    EventTarget,
    ArrayLike<TextTrack>,
    JsIterable<TextTrack> {
    /**
     * The read-only TextTrackList property **`length`** returns the number of entries in the TextTrackList, each of which is a TextTrack representing one track in the media element.
     *
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
     * The TextTrackList method **`getTrackById()`** returns the first TextTrack object from the track list whose id matches the specified string. This lets you find a specified track if you know its ID string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/getTrackById)
     */
    fun getTrackById(id: String): TextTrack?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/addtrack_event)
 */
inline val <C : TextTrackList> C.addTrackEvent: EventInstance<TrackEvent, C, C>
    get() = EventInstance(this, "addtrack")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/change_event)
 */
inline val <C : TextTrackList> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "change")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/removetrack_event)
 */
inline val <C : TextTrackList> C.removeTrackEvent: EventInstance<TrackEvent, C, C>
    get() = EventInstance(this, "removetrack")
