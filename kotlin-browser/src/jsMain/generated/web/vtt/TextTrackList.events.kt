// Automatically generated - do not modify!

package web.vtt

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/addtrack_event)
 */
inline val <C : TextTrackList> C.addTrackEvent: EventInstance<TrackEvent, C, C>
    get() = EventInstance(this, TrackEvent.ADD_TRACK)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/change_event)
 */
inline val <C : TextTrackList> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/removetrack_event)
 */
inline val <C : TextTrackList> C.removeTrackEvent: EventInstance<TrackEvent, C, C>
    get() = EventInstance(this, TrackEvent.REMOVE_TRACK)
