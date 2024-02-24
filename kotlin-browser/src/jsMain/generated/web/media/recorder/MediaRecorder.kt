// Automatically generated - do not modify!

package web.media.recorder

import web.errors.ErrorEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.media.streams.MediaStream

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder)
 */
external class MediaRecorder(
    stream: MediaStream,
    options: MediaRecorderOptions = definedExternally,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/audioBitsPerSecond)
     */
    val audioBitsPerSecond: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/mimeType)
     */
    val mimeType: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/dataavailable_event)
     */
    var ondataavailable: EventHandler<BlobEvent<MediaRecorder>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/error_event)
     */
    var onerror: EventHandler<ErrorEvent<MediaRecorder>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/pause_event)
     */
    var onpause: EventHandler<Event<MediaRecorder>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/resume_event)
     */
    var onresume: EventHandler<Event<MediaRecorder>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/start_event)
     */
    var onstart: EventHandler<Event<MediaRecorder>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/stop_event)
     */
    var onstop: EventHandler<Event<MediaRecorder>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/state)
     */
    val state: RecordingState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/stream)
     */
    val stream: MediaStream

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/videoBitsPerSecond)
     */
    val videoBitsPerSecond: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/pause)
     */
    fun pause()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/requestData)
     */
    fun requestData()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/resume)
     */
    fun resume()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/start)
     */
    fun start(timeslice: Int = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/stop)
     */
    fun stop()

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/isTypeSupported_static)
         */
        fun isTypeSupported(type: String): Boolean
    }
}
