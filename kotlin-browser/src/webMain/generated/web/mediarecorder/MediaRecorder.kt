// Automatically generated - do not modify!

package web.mediarecorder

import web.errors.ErrorEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.mediastreams.MediaStream
import kotlin.js.definedExternally

/**
 * The **`MediaRecorder`** interface of the MediaStream Recording API provides functionality to easily record media. It is created using the MediaRecorder() constructor.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder)
 */
open external class MediaRecorder(
    /**
     * The **`stream`** read-only property of the MediaRecorder interface returns the stream that was passed into the MediaRecorder() constructor when the MediaRecorder was created.
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
     * The **`mimeType`** read-only property of the MediaRecorder interface returns the MIME media type that was specified when creating the MediaRecorder object, or, if none was specified, which was chosen by the browser. This is the file format of the file that would result from writing all of the recorded data to disk.
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
     * The **`state`** read-only property of the MediaRecorder interface returns the current state of the current MediaRecorder object.
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
     * The **`requestData()`** method of the MediaRecorder interface is used to raise a dataavailable event containing a Blob object of the captured media as it was when the method was called. This can then be grabbed and manipulated as you wish.
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

    companion object {
        /**
         * The **`isTypeSupported()`** static method of the MediaRecorder interface returns a Boolean which is true if the MIME media type specified is one the user agent should be able to successfully record.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/isTypeSupported_static)
         */
        fun isTypeSupported(type: String): Boolean
    }
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/dataavailable_event)
 */
inline val <C : MediaRecorder> C.dataAvailableEvent: EventInstance<BlobEvent, C, C>
    get() = EventInstance(this, "dataavailable")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/error_event)
 */
inline val <C : MediaRecorder> C.errorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/pause_event)
 */
inline val <C : MediaRecorder> C.pauseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "pause")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/resume_event)
 */
inline val <C : MediaRecorder> C.resumeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "resume")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/start_event)
 */
inline val <C : MediaRecorder> C.startEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "start")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaRecorder/stop_event)
 */
inline val <C : MediaRecorder> C.stopEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "stop")
