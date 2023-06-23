// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.audio

import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an OfflineAudioContext is terminated. The complete event implements this interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent)
 */
external interface OfflineAudioCompletionEventInit : EventInit {
    var renderedBuffer: AudioBuffer
}

open external class OfflineAudioCompletionEvent(
    override val type: EventType<OfflineAudioCompletionEvent>,
    init: OfflineAudioCompletionEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent/renderedBuffer) */
    val renderedBuffer: AudioBuffer

    companion object
}
