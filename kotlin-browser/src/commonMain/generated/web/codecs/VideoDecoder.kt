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
 * The **`VideoDecoder`** interface of the WebCodecs API decodes chunks of video.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder)
 */
open external class VideoDecoder(
    init: VideoDecoderInit,
) : EventTarget {
    /**
     * The **`decodeQueueSize`** read-only property of the VideoDecoder interface returns the number of pending decode requests in the queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/decodeQueueSize)
     */
    val decodeQueueSize: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/dequeue_event)
     */
    var ondequeue: EventHandler<Event, VideoDecoder, VideoDecoder>?

    /**
     * The **`state`** property of the VideoDecoder interface returns the current state of the underlying codec.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/state)
     */
    val state: CodecState

    /**
     * The **`close()`** method of the VideoDecoder interface ends all pending work and releases system resources.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/close)
     */
    fun close()

    /**
     * The **`configure()`** method of the VideoDecoder interface enqueues a control message to configure the video decoder for decoding chunks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure)
     */
    fun configure(config: VideoDecoderConfig)

    /**
     * The **`decode()`** method of the VideoDecoder interface enqueues a control message to decode a given chunk of video.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/decode)
     */
    fun decode(chunk: EncodedVideoChunk)

    /**
     * The **`flush()`** method of the VideoDecoder interface returns a Promise that resolves once all pending messages in the queue have been completed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/flush)
     */
    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * The **`reset()`** method of the VideoDecoder interface resets all states including configuration, control messages in the control message queue, and all pending callbacks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/reset)
     */
    fun reset()

    companion object {
        /**
         * The **`isConfigSupported()`** static method of the VideoDecoder interface checks if the given config is supported (that is, if VideoDecoder objects can be successfully configured with the given config).
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/isConfigSupported_static)
         */
        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: VideoDecoderConfig): Promise<VideoDecoderSupport>
    }
}

/**
 * The **`flush()`** method of the VideoDecoder interface returns a Promise that resolves once all pending messages in the queue have been completed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/flush)
 */
suspend inline fun VideoDecoder.flush() {
    awaitPromiseLike(flushAsync())
}

/**
 * The **`isConfigSupported()`** static method of the VideoDecoder interface checks if the given config is supported (that is, if VideoDecoder objects can be successfully configured with the given config).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/isConfigSupported_static)
 */
suspend inline fun VideoDecoder.Companion.isConfigSupported(config: VideoDecoderConfig): VideoDecoderSupport {
    return awaitPromiseLike(isConfigSupportedAsync(config = config))
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/dequeue_event)
 */
inline val <C : VideoDecoder> C.dequeueEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "dequeue")
