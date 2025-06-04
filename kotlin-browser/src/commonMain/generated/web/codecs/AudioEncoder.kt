// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
import kotlin.js.JsName

/**
 * The **`AudioEncoder`** interface of the WebCodecs API encodes AudioData objects.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder)
 */
open external class AudioEncoder(
    init: AudioEncoderInit,
) : EventTarget {
    /**
     * The **`encodeQueueSize`** read-only property of the AudioEncoder interface returns the number of pending encode requests in the queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/encodeQueueSize)
     */
    val encodeQueueSize: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/dequeue_event)
     */
    var ondequeue: EventHandler<Event, AudioEncoder, AudioEncoder>?

    /**
     * The **`state`** read-only property of the AudioEncoder interface returns the current state of the underlying codec.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/state)
     */
    val state: CodecState

    /**
     * The **`close()`** method of the AudioEncoder interface ends all pending work and releases system resources.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/close)
     */
    fun close()

    /**
     * The **`configure()`** method of the AudioEncoder interface enqueues a control message to configure the audio encoder for encoding chunks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure)
     */
    fun configure(config: AudioEncoderConfig)

    /**
     * The **`encode()`** method of the AudioEncoder interface enqueues a control message to encode a given AudioData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/encode)
     */
    fun encode(data: AudioData)

    /**
     * The **`flush()`** method of the AudioEncoder interface returns a Promise that resolves once all pending messages in the queue have been completed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/flush)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flush()

    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * The **`reset()`** method of the AudioEncoder interface resets all states including configuration, control messages in the control message queue, and all pending callbacks.
     *
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
         * The **`isConfigSupported()`** static method of the AudioEncoder interface checks if the given config is supported (that is, if AudioEncoder objects can be successfully configured with the given config).
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/isConfigSupported_static)
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun isConfigSupported(config: AudioEncoderConfig): AudioEncoderSupport

        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: AudioEncoderConfig): Promise<AudioEncoderSupport>
    }
}
