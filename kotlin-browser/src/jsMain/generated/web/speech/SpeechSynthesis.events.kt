// Automatically generated - do not modify!

package web.speech

import web.events.Event
import web.events.EventInstance

inline val <C : SpeechSynthesis> C.voicesChangedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.voicesChanged())
