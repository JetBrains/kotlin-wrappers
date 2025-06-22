// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType

/**
 * The Web Audio API `OfflineAudioCompletionEvent` interface represents events that occur when the processing of an OfflineAudioContext is terminated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent)
 */
open external class OfflineAudioCompletionEvent(
    override val type: EventType<OfflineAudioCompletionEvent>,
    init: OfflineAudioCompletionEventInit,
) : Event {
    /**
     * The **`renderedBuffer`** read-only property of the containing the result of processing an OfflineAudioContext.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent/renderedBuffer)
     */
    val renderedBuffer: AudioBuffer

    companion object
}

inline fun OfflineAudioCompletionEvent.asInit(): OfflineAudioCompletionEventInit =
    unsafeCast(this)

inline val OfflineAudioCompletionEvent.Companion.COMPLETE: EventType<OfflineAudioCompletionEvent>
    get() = EventType("complete")
