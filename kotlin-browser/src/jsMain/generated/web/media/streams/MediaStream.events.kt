// Automatically generated - do not modify!

package web.media.streams

import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addtrack_event)
 */
inline val <C : MediaStream> C.addTrackEvent: EventInstance<MediaStreamTrackEvent, C, C>
    get() = EventInstance(this, MediaStreamTrackEvent.ADD_TRACK)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removetrack_event)
 */
inline val <C : MediaStream> C.removeTrackEvent: EventInstance<MediaStreamTrackEvent, C, C>
    get() = EventInstance(this, MediaStreamTrackEvent.REMOVE_TRACK)
