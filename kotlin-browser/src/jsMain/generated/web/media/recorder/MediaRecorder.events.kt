// Automatically generated - do not modify!

package web.media.recorder

import web.errors.ErrorEvent
import web.events.Event
import web.events.EventInstance

inline val <C : MediaRecorder> C.dataAvailableEvent: EventInstance<BlobEvent, C, C>
    get() = EventInstance(this, BlobEvent.dataAvailable())

inline val <C : MediaRecorder> C.errorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, ErrorEvent.error())

inline val <C : MediaRecorder> C.pauseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.pause())

inline val <C : MediaRecorder> C.resumeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resume())

inline val <C : MediaRecorder> C.startEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.start())

inline val <C : MediaRecorder> C.stopEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stop())
