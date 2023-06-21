// Automatically generated - do not modify!

package web.media.streams

import js.core.ReadonlyArray
import web.events.EventHandler
import web.events.EventTarget

external class MediaStream() : EventTarget {
    constructor(stream: MediaStream)
    constructor(tracks: ReadonlyArray<MediaStreamTrack>)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/active) */
    val active: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/id) */
    val id: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addtrack_event) */
    var onaddtrack: EventHandler<MediaStreamTrackEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removetrack_event) */
    var onremovetrack: EventHandler<MediaStreamTrackEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addTrack) */
    fun addTrack(track: MediaStreamTrack)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/clone) */
    fun clone(): MediaStream

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getAudioTracks) */
    fun getAudioTracks(): ReadonlyArray<MediaStreamTrack>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTrackById) */
    fun getTrackById(trackId: String): MediaStreamTrack?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTracks) */
    fun getTracks(): ReadonlyArray<MediaStreamTrack>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getVideoTracks) */
    fun getVideoTracks(): ReadonlyArray<MediaStreamTrack>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removeTrack) */
    fun removeTrack(track: MediaStreamTrack)
}
