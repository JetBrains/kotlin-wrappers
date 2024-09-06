// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/statechange_event)
 */
inline val <C : BaseAudioContext> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.STATE_CHANGE)
