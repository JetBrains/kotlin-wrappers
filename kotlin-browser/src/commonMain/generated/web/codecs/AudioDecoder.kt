// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName

/**
 * The **`AudioDecoder`** interface of the WebCodecs API decodes chunks of audio.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder)
 */
open external class AudioDecoder(
    init: AudioDecoderInit,
) : EventTarget {
    /**
     * The **`decodeQueueSize`** read-only property of the AudioDecoder interface returns the number of pending decode requests in the queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/decodeQueueSize)
     */
    val decodeQueueSize: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/dequeue_event)
     */
    var ondequeue: EventHandler<Event, AudioDecoder, AudioDecoder>?

    /**
     * The **`state`** read-only property of the AudioDecoder interface returns the current state of the underlying codec.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/state)
     */
    val state: CodecState

    /**
     * The **`close()`** method of the AudioDecoder interface ends all pending work and releases system resources.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/close)
     */
    fun close()

    /**
     * The **`configure()`** method of the AudioDecoder interface enqueues a control message to configure the audio decoder for decoding chunks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/configure)
     */
    fun configure(config: AudioDecoderConfig)

    /**
     * The **`decode()`** method of the AudioDecoder interface enqueues a control message to decode a given chunk of audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/decode)
     */
    fun decode(chunk: EncodedAudioChunk)

    /**
     * The **`flush()`** method of the AudioDecoder interface returns a Promise that resolves once all pending messages in the queue have been completed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/flush)
     */
    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * The **`reset()`** method of the AudioDecoder interface resets all states including configuration, control messages in the control message queue, and all pending callbacks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/reset)
     */
    fun reset()

    companion object {
        /**
         * The **`isConfigSupported()`** static method of the AudioDecoder interface checks if the given config is supported (that is, if AudioDecoder objects can be successfully configured with the given config).
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/isConfigSupported_static)
         */
        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: AudioDecoderConfig): Promise<AudioDecoderSupport>
    }
}

/**
 * The **`flush()`** method of the AudioDecoder interface returns a Promise that resolves once all pending messages in the queue have been completed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/flush)
 */
suspend inline fun AudioDecoder.flush() {
    awaitPromiseLike(flushAsync())
}

/**
 * The **`isConfigSupported()`** static method of the AudioDecoder interface checks if the given config is supported (that is, if AudioDecoder objects can be successfully configured with the given config).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/isConfigSupported_static)
 */
suspend inline fun AudioDecoder.Companion.isConfigSupported(config: AudioDecoderConfig): AudioDecoderSupport {
    return awaitPromiseLike(isConfigSupportedAsync(config))
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/dequeue_event)
 */
inline val <C : AudioDecoder> C.dequeueEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "dequeue")
