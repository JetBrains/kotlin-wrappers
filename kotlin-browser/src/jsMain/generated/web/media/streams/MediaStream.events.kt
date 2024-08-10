// Automatically generated - do not modify!

package web.media.streams

import web.events.EventInstance

inline val <C : MediaStream> C.addTrackEvent: EventInstance<MediaStreamTrackEvent, C, C>
    get() = EventInstance(this, MediaStreamTrackEvent.addTrack())

inline val <C : MediaStream> C.removeTrackEvent: EventInstance<MediaStreamTrackEvent, C, C>
    get() = EventInstance(this, MediaStreamTrackEvent.removeTrack())
