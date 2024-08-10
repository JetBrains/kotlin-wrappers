// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * This Media Source Extensions API interface represents a source of media data for an HTMLMediaElement object. A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource)
 */
open external class MediaSource :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/activeSourceBuffers)
     */
    val activeSourceBuffers: SourceBufferList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/duration)
     */
    var duration: Double
    var onsourceclose: EventHandler<Event, MediaSource, MediaSource>?
    var onsourceended: EventHandler<Event, MediaSource, MediaSource>?
    var onsourceopen: EventHandler<Event, MediaSource, MediaSource>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/readyState)
     */
    val readyState: ReadyState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceBuffers)
     */
    val sourceBuffers: SourceBufferList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/addSourceBuffer)
     */
    fun addSourceBuffer(type: String): SourceBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/clearLiveSeekableRange)
     */
    fun clearLiveSeekableRange()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/endOfStream)
     */
    fun endOfStream(error: EndOfStreamError = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/removeSourceBuffer)
     */
    fun removeSourceBuffer(sourceBuffer: SourceBuffer)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/setLiveSeekableRange)
     */
    fun setLiveSeekableRange(
        start: Double,
        end: Double,
    )

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/canConstructInDedicatedWorker_static)
         */
        val canConstructInDedicatedWorker: Boolean

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/isTypeSupported_static)
         */
        fun isTypeSupported(type: String): Boolean
    }
}
