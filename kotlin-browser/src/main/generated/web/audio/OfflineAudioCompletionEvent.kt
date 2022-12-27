// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface OfflineAudioCompletionEventInit : EventInit {
    var renderedBuffer: AudioBuffer
}

open external class OfflineAudioCompletionEvent(
    type: EventType<OfflineAudioCompletionEvent>,
    init: OfflineAudioCompletionEventInit,
) : Event {
    val renderedBuffer: AudioBuffer

    companion object
}
