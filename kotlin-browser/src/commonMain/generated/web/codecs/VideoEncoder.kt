// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
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
) : EventTarget {
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
    fun close()

    /**
     * The **`configure()`** method of the VideoEncoder interface changes the VideoEncoder.state of the encoder to 'configured' and asynchronously prepares the encoder to accept VideoEncoders for encoding with the specified parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure)
     */
    fun configure(config: VideoEncoderConfig)

    /**
     * The **`encode()`** method of the VideoEncoder interface asynchronously encodes a VideoFrame.
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
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flush()

    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * The **`reset()`** method of the VideoEncoder interface synchronously cancels all pending encodes and callbacks, frees all underlying resources and sets the VideoEncoder.state to 'unconfigured'.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/reset)
     */
    fun reset()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/dequeue_event)
     */
    @JsEvent("dequeue")
    val dequeueEvent: EventInstance<Event, VideoEncoder /* this */, VideoEncoder /* this */>

    companion object {
        /**
         * The **`isConfigSupported()`** static method of the VideoEncoder interface checks if VideoEncoder can be successfully configured with the given config.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/isConfigSupported_static)
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun isConfigSupported(config: VideoEncoderConfig): VideoEncoderSupport

        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: VideoEncoderConfig): Promise<VideoEncoderSupport>
    }
}
