// Automatically generated - do not modify!

package dom.html

import kotlinx.js.Void
import media.MediaEncryptedEvent
import media.MediaError
import media.key.MediaKeys
import media.source.TimeRanges
import remoteplayback.RemotePlayback
import web.events.Event
import webvtt.TextTrack
import webvtt.TextTrackKind
import webvtt.TextTrackList
import kotlin.js.Promise

abstract external class HTMLMediaElement :
    HTMLElement {
    /** Gets or sets a value that indicates whether to start playing the media automatically. */
    var autoplay: Boolean

    /** Gets a collection of buffered time ranges. */
    val buffered: TimeRanges

    /** Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player). */
    var controls: Boolean
    var crossOrigin: String?

    /** Gets the address or URL of the current media resource that is selected by IHTMLMediaElement. */
    val currentSrc: String

    /** Gets or sets the current playback position, in seconds. */
    var currentTime: Double
    var defaultMuted: Boolean

    /** Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource. */
    var defaultPlaybackRate: Double
    var disableRemotePlayback: Boolean

    /** Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming. */
    val duration: Double

    /** Gets information about whether the playback has ended or not. */
    val ended: Boolean

    /** Returns an object representing the current error state of the audio or video element. */
    val error: MediaError?

    /** Gets or sets a flag to specify whether playback should restart after it completes. */
    var loop: Boolean

    /** Available only in secure contexts. */
    val mediaKeys: MediaKeys?

    /** Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted. */
    var muted: Boolean

    /** Gets the current network activity for the element. */
    val networkState: Short
    var onencrypted: ((event: MediaEncryptedEvent) -> Unit)?
    var onwaitingforkey: ((event: Event) -> Unit)?

    /** Gets a flag that specifies whether playback is paused. */
    val paused: Boolean

    /** Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource. */
    var playbackRate: Double

    /** Gets TimeRanges for the current media resource that has been played. */
    val played: TimeRanges

    /** Gets or sets a value indicating what data should be preloaded, if any. */
    var preload: String /* "none" | "metadata" | "auto" | "" */
    var preservesPitch: Boolean
    val readyState: Short
    val remote: RemotePlayback

    /** Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked. */
    val seekable: TimeRanges

    /** Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource. */
    val seeking: Boolean

    /** The address or URL of the a media resource that is to be considered. */
    var src: String
    var srcObject: MediaProvider?
    val textTracks: TextTrackList

    /** Gets or sets the volume level for audio portions of the media element. */
    var volume: Double
    fun addTextTrack(
        kind: TextTrackKind,
        label: String = definedExternally,
        language: String = definedExternally,
    ): TextTrack

    /** Returns a string that specifies whether the client can play a given media resource type. */
    fun canPlayType(type: String): CanPlayTypeResult
    fun fastSeek(time: Number)

    /** Resets the audio or video object and loads a new media resource. */
    fun load()

    /** Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not. */
    fun pause()

    /** Loads and starts playback of a media resource. */
    fun play(): Promise<Void>

    /** Available only in secure contexts. */
    fun setMediaKeys(mediaKeys: MediaKeys?): Promise<Void>
    val HAVE_CURRENT_DATA: Short
    val HAVE_ENOUGH_DATA: Short
    val HAVE_FUTURE_DATA: Short
    val HAVE_METADATA: Short
    val HAVE_NOTHING: Short
    val NETWORK_EMPTY: Short
    val NETWORK_IDLE: Short
    val NETWORK_LOADING: Short
    val NETWORK_NO_SOURCE: Short
}
