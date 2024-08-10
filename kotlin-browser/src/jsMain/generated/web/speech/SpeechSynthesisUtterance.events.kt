// Automatically generated - do not modify!

package web.speech

import web.events.EventInstance

inline val <C : SpeechSynthesisUtterance> C.boundaryEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.boundary())

inline val <C : SpeechSynthesisUtterance> C.endEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.end())

inline val <C : SpeechSynthesisUtterance> C.errorEvent: EventInstance<SpeechSynthesisErrorEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisErrorEvent.error())

inline val <C : SpeechSynthesisUtterance> C.markEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.mark())

inline val <C : SpeechSynthesisUtterance> C.pauseEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.pause())

inline val <C : SpeechSynthesisUtterance> C.resumeEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.resume())

inline val <C : SpeechSynthesisUtterance> C.startEvent: EventInstance<SpeechSynthesisEvent, C, C>
    get() = EventInstance(this, SpeechSynthesisEvent.start())
