// Automatically generated - do not modify!

package web.audio

import web.errors.ErrorEvent
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/error_event)
 */
inline val <C : AudioContext> C.errorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, ErrorEvent.ERROR)
