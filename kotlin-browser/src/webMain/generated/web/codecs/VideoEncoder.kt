// Automatically generated - do not modify!

package web.codecs

import js.closeable.JsCloseable
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`VideoEncoder`** interface of the WebCodecs API encodes VideoFrame objects into EncodedVideoChunks.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder)
 */
open external class VideoEncoder(
    init: VideoEncoderInit,
) : EventTarget,
    JsCloseable {
    /**
     * The **`encodeQueueSize`** read-only property of the VideoEncoder interface returns the number of pending encode requests in the queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encodeQueueSize)
     */
    val encodeQueueSize: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/dequeue_event)
     */
    var ondequeue: EventHandler<Event, VideoEncoder, VideoEncoder>?

    /**
     * The **`state`** read-only property of the VideoEncoder interface returns the current state of the underlying codec.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/state)
     */
    val state: CodecState

    /**
     * The **`close()`** method of the VideoEncoder interface ends all pending work and releases system resources.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/close)
     */
    override fun close()

    /**
     * The **`configure()`** method of the VideoEncoder interface changes the state of the encoder to "configured" and asynchronously prepares the encoder to accept VideoEncoders for encoding with the specified parameters. If the encoder doesn't support the specified parameters or can't be initialized for other reasons an error will be reported via the error callback provided to the VideoEncoder constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure)
     */
    fun configure(config: VideoEncoderConfig)

    /**
     * The **`encode()`** method of the VideoEncoder interface asynchronously encodes a VideoFrame. Encoded data (EncodedVideoChunk) or an error will eventually be returned via the callbacks provided to the VideoEncoder constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encode)
     */
    fun encode(
        frame: VideoFrame,
        options: VideoEncoderEncodeOptions = definedExternally,
    )

    /**
     * The **`flush()`** method of the VideoEncoder interface forces all pending encodes to complete.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/flush)
     */
    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * The **`reset()`** method of the VideoEncoder interface synchronously cancels all pending encodes and callbacks, frees all underlying resources and sets the state to "unconfigured". After calling reset(), configure() must be called before resuming encode() calls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/reset)
     */
    fun reset()

    companion object {
        /**
         * The **`isConfigSupported()`** static method of the VideoEncoder interface checks if VideoEncoder can be successfully configured with the given config.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/isConfigSupported_static)
         */
        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: VideoEncoderConfig): Promise<VideoEncoderSupport>
    }
}

/**
 * The **`flush()`** method of the VideoEncoder interface forces all pending encodes to complete.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/flush)
 */
suspend inline fun VideoEncoder.flush() {
    flushAsync().await()
}

/**
 * The **`isConfigSupported()`** static method of the VideoEncoder interface checks if VideoEncoder can be successfully configured with the given config.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/isConfigSupported_static)
 */
suspend inline fun VideoEncoder.Companion.isConfigSupported(config: VideoEncoderConfig): VideoEncoderSupport {
    return isConfigSupportedAsync(
        config = config,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/dequeue_event)
 */
inline val <C : VideoEncoder> C.dequeueEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "dequeue")
