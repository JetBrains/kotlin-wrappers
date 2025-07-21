// Automatically generated - do not modify!

package web.mediastreams

import js.array.ReadonlyArray
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`MediaStream`** interface of the Media Capture and Streams API represents a stream of media content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream)
 */
open external class MediaStream() :
    EventTarget {
    constructor(stream: MediaStream)
    constructor(tracks: ReadonlyArray<MediaStreamTrack>)

    /**
     * The **`active`** read-only property of the MediaStream interface returns a Boolean value which is `true` if the stream is currently active; otherwise, it returns `false`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/active)
     */
    val active: Boolean

    /**
     * The **`id`** read-only property of the MediaStream interface is a string containing 36 characters denoting a unique identifier (GUID) for the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addtrack_event)
     */
    var onaddtrack: EventHandler<MediaStreamTrackEvent, MediaStream, MediaStream>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removetrack_event)
     */
    var onremovetrack: EventHandler<MediaStreamTrackEvent, MediaStream, MediaStream>?

    /**
     * The **`addTrack()`** method of the MediaStream interface adds a new track to the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addTrack)
     */
    fun addTrack(track: MediaStreamTrack)

    /**
     * The **`clone()`** method of the MediaStream interface creates a duplicate of the `MediaStream`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/clone)
     */
    fun clone(): MediaStream

    /**
     * The **`getAudioTracks()`** method of the MediaStream interface returns a sequence that represents all the MediaStreamTrack objects in this stream's track set where MediaStreamTrack.kind is `audio`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getAudioTracks)
     */
    fun getAudioTracks(): ReadonlyArray<MediaStreamTrack>

    /**
     * The **`getTrackById()`** method of the MediaStream interface returns a MediaStreamTrack object representing the track with the specified ID string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTrackById)
     */
    fun getTrackById(trackId: String): MediaStreamTrack?

    /**
     * The **`getTracks()`** method of the MediaStream interface returns a sequence that represents all the MediaStreamTrack objects in this stream's track set, regardless of MediaStreamTrack.kind.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTracks)
     */
    fun getTracks(): ReadonlyArray<MediaStreamTrack>

    /**
     * The **`getVideoTracks()`** method of the MediaStream interface returns a sequence of MediaStreamTrack objects representing the video tracks in this stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getVideoTracks)
     */
    fun getVideoTracks(): ReadonlyArray<MediaStreamTrack>

    /**
     * The **`removeTrack()`** method of the MediaStream interface removes a MediaStreamTrack from a stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removeTrack)
     */
    fun removeTrack(track: MediaStreamTrack)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addtrack_event)
 */
inline val <C : MediaStream> C.addTrackEvent: EventInstance<MediaStreamTrackEvent, C, C>
    get() = EventInstance(this, "addtrack")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removetrack_event)
 */
inline val <C : MediaStream> C.removeTrackEvent: EventInstance<MediaStreamTrackEvent, C, C>
    get() = EventInstance(this, "removetrack")
