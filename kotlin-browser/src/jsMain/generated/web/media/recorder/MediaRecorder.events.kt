// Automatically generated - do not modify!

package web.media.recorder

import web.errors.ErrorEvent
import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/dataavailable_event)
 */
inline val <C : MediaRecorder> C.dataAvailableEvent: EventInstance<BlobEvent, C, C>
    get() = EventInstance(this, BlobEvent.DATA_AVAILABLE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/error_event)
 */
inline val <C : MediaRecorder> C.errorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, ErrorEvent.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/pause_event)
 */
inline val <C : MediaRecorder> C.pauseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.PAUSE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/resume_event)
 */
inline val <C : MediaRecorder> C.resumeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.RESUME)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/start_event)
 */
inline val <C : MediaRecorder> C.startEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/stop_event)
 */
inline val <C : MediaRecorder> C.stopEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.STOP)
