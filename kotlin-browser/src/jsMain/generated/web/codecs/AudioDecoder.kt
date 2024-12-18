// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder)
 */
open external class AudioDecoder(
    init: AudioDecoderInit,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/decodeQueueSize)
     */
    val decodeQueueSize: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/dequeue_event)
     */
    var ondequeue: EventHandler<Event, AudioDecoder, AudioDecoder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/state)
     */
    val state: CodecState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/configure)
     */
    fun configure(config: AudioDecoderConfig)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/decode)
     */
    fun decode(chunk: EncodedAudioChunk)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/flush)
     */
    @JsAsync
    suspend fun flush()

    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/reset)
     */
    fun reset()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/dequeue_event)
     */
    @JsEvent("dequeue")
    val dequeueEvent: EventInstance<Event, AudioDecoder /* this */, AudioDecoder /* this */>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/isConfigSupported_static)
         */
        @JsAsync
        suspend fun isConfigSupported(config: AudioDecoderConfig): AudioDecoderSupport

        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: AudioDecoderConfig): Promise<AudioDecoderSupport>
    }
}
