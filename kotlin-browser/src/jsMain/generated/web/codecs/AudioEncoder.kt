// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder)
 */
open external class AudioEncoder(
    init: AudioEncoderInit,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/encodeQueueSize)
     */
    val encodeQueueSize: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/dequeue_event)
     */
    var ondequeue: EventHandler<Event, AudioEncoder, AudioEncoder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/state)
     */
    val state: CodecState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure)
     */
    fun configure(config: AudioEncoderConfig)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/encode)
     */
    fun encode(data: AudioData)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/flush)
     */
    @JsAsync
    suspend fun flush()

    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/reset)
     */
    fun reset()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/dequeue_event)
     */
    @JsEvent("dequeue")
    val dequeueEvent: EventInstance<Event, AudioEncoder /* this */, AudioEncoder /* this */>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/isConfigSupported_static)
         */
        @JsAsync
        suspend fun isConfigSupported(config: AudioEncoderConfig): AudioEncoderSupport

        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: AudioEncoderConfig): Promise<AudioEncoderSupport>
    }
}
