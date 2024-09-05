// Automatically generated - do not modify!

package web.audio

import web.errors.ErrorEvent
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event)
 */
inline val <C : AudioWorkletNode> C.processorErrorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, ErrorEvent.processorError())
