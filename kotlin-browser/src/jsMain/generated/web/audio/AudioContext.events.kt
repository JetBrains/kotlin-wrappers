// Automatically generated - do not modify!

package web.audio

import web.errors.ErrorEvent
import web.events.EventInstance

inline val <C : AudioContext> C.errorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, ErrorEvent.error())
