// Automatically generated - do not modify!

package web.mediasource

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.definedExternally

/**
 * The **`MediaSource`** interface of the Media Source Extensions API represents a source of media data for an HTMLMediaElement object. A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource)
 */
open external class MediaSource :
    EventTarget {
    /**
     * The **`activeSourceBuffers`** read-only property of the MediaSource interface returns a SourceBufferList object containing a subset of the SourceBuffer objects contained within sourceBuffers — the list of objects providing the selected video track, enabled audio tracks, and shown/hidden text tracks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/activeSourceBuffers)
     */
    val activeSourceBuffers: SourceBufferList

    /**
     * The **`duration`** property of the MediaSource interface gets and sets the duration of the current media being presented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/duration)
     */
    var duration: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceclose_event)
     */
    var onsourceclose: EventHandler<Event, MediaSource, MediaSource>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceended_event)
     */
    var onsourceended: EventHandler<Event, MediaSource, MediaSource>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceopen_event)
     */
    var onsourceopen: EventHandler<Event, MediaSource, MediaSource>?

    /**
     * The **`readyState`** read-only property of the MediaSource interface returns an enum representing the state of the current MediaSource. The three possible values are:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/readyState)
     */
    val readyState: ReadyState

    /**
     * The **`sourceBuffers`** read-only property of the MediaSource interface returns a SourceBufferList object containing the list of SourceBuffer objects associated with this MediaSource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceBuffers)
     */
    val sourceBuffers: SourceBufferList

    /**
     * The **`addSourceBuffer()`** method of the MediaSource interface creates a new SourceBuffer of the given MIME type and adds it to the MediaSource's sourceBuffers list. The new SourceBuffer is also returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/addSourceBuffer)
     */
    fun addSourceBuffer(type: String): SourceBuffer

    /**
     * The **`clearLiveSeekableRange()`** method of the MediaSource interface clears a seekable range previously set with a call to setLiveSeekableRange().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/clearLiveSeekableRange)
     */
    fun clearLiveSeekableRange()

    /**
     * The **`endOfStream()`** method of the MediaSource interface signals the end of the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/endOfStream)
     */
    fun endOfStream(error: EndOfStreamError = definedExternally)

    /**
     * The **`removeSourceBuffer()`** method of the MediaSource interface removes the given SourceBuffer from the SourceBufferList associated with this MediaSource object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/removeSourceBuffer)
     */
    fun removeSourceBuffer(sourceBuffer: SourceBuffer)

    /**
     * The **`setLiveSeekableRange()`** method of the MediaSource interface sets the range that the user can seek to in the media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/setLiveSeekableRange)
     */
    fun setLiveSeekableRange(
        start: Double,
        end: Double,
    )

    companion object {
        /**
         * The **`canConstructInDedicatedWorker`** static property of the MediaSource interface returns true if MediaSource worker support is implemented, providing a low-latency feature detection mechanism.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/canConstructInDedicatedWorker_static)
         */
        val canConstructInDedicatedWorker: Boolean

        /**
         * The **`MediaSource.isTypeSupported()`** static method returns a boolean value which is true if the given MIME type and (optional) codec are likely to be supported by the current user agent.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/isTypeSupported_static)
         */
        fun isTypeSupported(type: String): Boolean
    }
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceclose_event)
 */
inline val <C : MediaSource> C.sourceCloseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "sourceclose")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceended_event)
 */
inline val <C : MediaSource> C.sourceEndedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "sourceended")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceopen_event)
 */
inline val <C : MediaSource> C.sourceOpenEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "sourceopen")
