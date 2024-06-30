// Automatically generated - do not modify!

package web.audio

import web.events.EventInstance

inline val <C : OfflineAudioContext> C.completeEvent: EventInstance<OfflineAudioCompletionEvent, C, C>
    get() = EventInstance(this, OfflineAudioCompletionEvent.complete())
