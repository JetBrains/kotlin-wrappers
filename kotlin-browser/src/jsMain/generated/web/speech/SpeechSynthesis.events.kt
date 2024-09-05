// Automatically generated - do not modify!

package web.speech

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/voiceschanged_event)
 */
inline val <C : SpeechSynthesis> C.voicesChangedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.voicesChanged())
