// Automatically generated - do not modify!

package web.audio

import web.errors.ErrorEvent
import web.events.EventInstance
import web.events.EventType

inline val <C : AudioWorkletNode> C.processorErrorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, EventType("processorerror"))
