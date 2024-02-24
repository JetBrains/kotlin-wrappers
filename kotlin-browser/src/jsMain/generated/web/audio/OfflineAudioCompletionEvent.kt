// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.audio

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an OfflineAudioContext is terminated. The complete event implements this interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent)
 */
open external class OfflineAudioCompletionEvent<out C : EventTarget?>(
    override val type: EventType<OfflineAudioCompletionEvent<C>>,
    init: OfflineAudioCompletionEventInit,
) : Event<C>,
    OfflineAudioCompletionEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent/renderedBuffer)
     */
    override val renderedBuffer: AudioBuffer

    companion object : OfflineAudioCompletionEventTypes
}
