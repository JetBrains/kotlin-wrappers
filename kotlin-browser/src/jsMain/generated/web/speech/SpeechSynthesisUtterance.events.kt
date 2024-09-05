// Automatically generated - do not modify!

package web.speech

import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/boundary_event)
 */
inline val <C : SpeechSynthesisUtterance> C.boundaryEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.boundary())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/end_event)
 */
inline val <C : SpeechSynthesisUtterance> C.endEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.end())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/error_event)
 */
inline val <C : SpeechSynthesisUtterance> C.errorEvent: EventInstance<SpeechSynthesisErrorEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisErrorEvent.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/mark_event)
 */
inline val <C : SpeechSynthesisUtterance> C.markEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.mark())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/pause_event)
 */
inline val <C : SpeechSynthesisUtterance> C.pauseEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.pause())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/resume_event)
 */
inline val <C : SpeechSynthesisUtterance> C.resumeEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.resume())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/start_event)
 */
inline val <C : SpeechSynthesisUtterance> C.startEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.start())
