// Automatically generated - do not modify!

package media.streams

import kotlinx.js.ReadonlyArray
import web.events.EventHandler
import web.events.EventTarget

external class MediaStream() : EventTarget {
    constructor(stream: MediaStream)
    constructor(tracks: ReadonlyArray<MediaStreamTrack>)

    val active: Boolean
    val id: String
    var onaddtrack: EventHandler<MediaStreamTrackEvent>?
    var onremovetrack: EventHandler<MediaStreamTrackEvent>?
    fun addTrack(track: MediaStreamTrack)
    fun clone(): MediaStream
    fun getAudioTracks(): ReadonlyArray<MediaStreamTrack>
    fun getTrackById(trackId: String): MediaStreamTrack?
    fun getTracks(): ReadonlyArray<MediaStreamTrack>
    fun getVideoTracks(): ReadonlyArray<MediaStreamTrack>
    fun removeTrack(track: MediaStreamTrack)
}
