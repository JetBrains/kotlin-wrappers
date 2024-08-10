// Automatically generated - do not modify!

package web.audio

import web.errors.ErrorEvent
import web.events.EventInstance

inline val <C : AudioWorkletNode> C.processorErrorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, ErrorEvent.processorError())
