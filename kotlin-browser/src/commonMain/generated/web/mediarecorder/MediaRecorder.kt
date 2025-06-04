// Automatically generated - do not modify!

package web.mediarecorder

import web.errors.ErrorEvent
import web.events.*
import web.mediastreams.MediaStream
import kotlin.js.definedExternally

/**
 * The **`MediaRecorder`** interface of the MediaStream Recording API provides functionality to easily record media.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder)
 */
open external class MediaRecorder(
    /**
     * The **`stream`** read-only property of the MediaRecorder interface returns the stream that was passed into the MediaRecorder.MediaRecorder constructor when the `MediaRecorder` was created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/stream)
     */
    val stream: MediaStream,
    options: MediaRecorderOptions = definedExternally,
) : EventTarget {
    /**
     * The **`audioBitsPerSecond`** read-only property of the MediaRecorder interface returns the audio encoding bit rate in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/audioBitsPerSecond)
     */
    val audioBitsPerSecond: Int

    /**
     * The **`mimeType`** read-only property of the MediaRecorder interface returns the MIME media type that was specified when creating the MediaRecorder object, or, if none was specified, which was chosen by the browser.
     *
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
     * The **`state`** read-only property of the MediaRecorder interface returns the current state of the current `MediaRecorder` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/state)
     */
    val state: RecordingState

    /**
     * The **`videoBitsPerSecond`** read-only property of the MediaRecorder interface returns the video encoding bit rate in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/videoBitsPerSecond)
     */
    val videoBitsPerSecond: Int

    /**
     * The **`pause()`** method of the MediaRecorder interface is used to pause recording of media streams.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/pause)
     */
    fun pause()

    /**
     * The **`requestData()`** method of the MediaRecorder interface is used to raise a MediaRecorder.dataavailable_event event containing a called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/requestData)
     */
    fun requestData()

    /**
     * The **`resume()`** method of the MediaRecorder interface is used to resume media recording when it has been previously paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/resume)
     */
    fun resume()

    /**
     * The **`start()`** method of the MediaRecorder interface begins recording media into one or more Blob objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/start)
     */
    fun start(timeslice: Int = definedExternally)

    /**
     * The **`stop()`** method of the MediaRecorder interface is used to stop media capture.
     *
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
         * The **`isTypeSupported()`** static method of the MediaRecorder interface returns a Boolean which is `true` if the MIME media type specified is one the user agent should be able to successfully record.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/isTypeSupported_static)
         */
        fun isTypeSupported(type: String): Boolean
    }
}
