// Automatically generated - do not modify!

package web.vtt

import web.events.Event
import web.events.EventInstance

inline val <C : TextTrackList> C.addTrackEvent: EventInstance<TrackEvent, C, C>
    get() = EventInstance(this, TrackEvent.addTrack())

inline val <C : TextTrackList> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.change())

inline val <C : TextTrackList> C.removeTrackEvent: EventInstance<TrackEvent, C, C>
    get() = EventInstance(this, TrackEvent.removeTrack())
