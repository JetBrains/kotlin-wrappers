// Automatically generated - do not modify!

package web.media.recorder

import web.errors.ErrorEvent
import web.events.*
import web.media.streams.MediaStream

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder)
 */
open external class MediaRecorder(
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
    var ondataavailable: EventHandler<BlobEvent, MediaRecorder, MediaRecorder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/error_event)
     */
    var onerror: EventHandler<ErrorEvent, MediaRecorder, MediaRecorder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/pause_event)
     */
    var onpause: EventHandler<Event, MediaRecorder, MediaRecorder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/resume_event)
     */
    var onresume: EventHandler<Event, MediaRecorder, MediaRecorder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/start_event)
     */
    var onstart: EventHandler<Event, MediaRecorder, MediaRecorder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/stop_event)
     */
    var onstop: EventHandler<Event, MediaRecorder, MediaRecorder>?

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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/dataavailable_event)
     */
    @JsEvent("dataavailable")
    val dataAvailableEvent: EventInstance<BlobEvent, MediaRecorder /* this */, MediaRecorder /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<ErrorEvent, MediaRecorder /* this */, MediaRecorder /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/pause_event)
     */
    @JsEvent("pause")
    val pauseEvent: EventInstance<Event, MediaRecorder /* this */, MediaRecorder /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/resume_event)
     */
    @JsEvent("resume")
    val resumeEvent: EventInstance<Event, MediaRecorder /* this */, MediaRecorder /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/start_event)
     */
    @JsEvent("start")
    val startEvent: EventInstance<Event, MediaRecorder /* this */, MediaRecorder /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/stop_event)
     */
    @JsEvent("stop")
    val stopEvent: EventInstance<Event, MediaRecorder /* this */, MediaRecorder /* this */>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/isTypeSupported_static)
         */
        fun isTypeSupported(type: String): Boolean
    }
}
