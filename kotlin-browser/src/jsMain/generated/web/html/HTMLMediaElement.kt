// Automatically generated - do not modify!

package web.html

import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.media.key.MediaKeys
import web.media.source.TimeRanges
import web.remoteplayback.RemotePlayback
import webvtt.TextTrack
import webvtt.TextTrackKind
import webvtt.TextTrackList
import kotlin.js.Promise

abstract external class HTMLMediaElement :
    HTMLElement {
    /**
     * Gets or sets a value that indicates whether to start playing the media automatically.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/autoplay)
     */
    var autoplay: Boolean

    /**
     * Gets a collection of buffered time ranges.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/buffered)
     */
    val buffered: TimeRanges

    /**
     * Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/controls)
     */
    var controls: Boolean
    var crossOrigin: CrossOrigin?

    /**
     * Gets the address or URL of the current media resource that is selected by IHTMLMediaElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/currentSrc)
     */
    val currentSrc: String

    /**
     * Gets or sets the current playback position, in seconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/currentTime)
     */
    var currentTime: Double
    var defaultMuted: Boolean

    /**
     * Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/defaultPlaybackRate)
     */
    var defaultPlaybackRate: Double
    var disableRemotePlayback: Boolean

    /**
     * Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/duration)
     */
    val duration: Double

    /**
     * Gets information about whether the playback has ended or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ended)
     */
    val ended: Boolean

    /**
     * Returns an object representing the current error state of the audio or video element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/error)
     */
    val error: MediaError?

    /**
     * Gets or sets a flag to specify whether playback should restart after it completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loop)
     */
    var loop: Boolean

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/mediaKeys)
     */
    val mediaKeys: MediaKeys?

    /**
     * Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/muted)
     */
    var muted: Boolean

    /**
     * Gets the current network activity for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/networkState)
     */
    val networkState: Short
    var onencrypted: EventHandler<MediaEncryptedEvent>?
    var onwaitingforkey: EventHandler<Event>?

    /**
     * Gets a flag that specifies whether playback is paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/paused)
     */
    val paused: Boolean

    /**
     * Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/playbackRate)
     */
    var playbackRate: Double

    /**
     * Gets TimeRanges for the current media resource that has been played.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/played)
     */
    val played: TimeRanges

    /**
     * Gets or sets a value indicating what data should be preloaded, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preload)
     */
    var preload: String /* "none" | "metadata" | "auto" | "" */
    var preservesPitch: Boolean
    val readyState: Short
    val remote: RemotePlayback

    /**
     * Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seekable)
     */
    val seekable: TimeRanges

    /**
     * Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeking)
     */
    val seeking: Boolean

    /**
     * The address or URL of the a media resource that is to be considered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/src)
     */
    var src: String
    var srcObject: MediaProvider?
    val textTracks: TextTrackList

    /**
     * Gets or sets the volume level for audio portions of the media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/volume)
     */
    var volume: Double
    fun addTextTrack(
        kind: TextTrackKind,
        label: String = definedExternally,
        language: String = definedExternally,
    ): TextTrack

    /**
     * Returns a string that specifies whether the client can play a given media resource type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canPlayType)
     */
    fun canPlayType(type: String): CanPlayTypeResult
    fun fastSeek(time: Number)

    /**
     * Resets the audio or video object and loads a new media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/load)
     */
    fun load()

    /**
     * Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/pause)
     */
    fun pause()

    /**
     * Loads and starts playback of a media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play)
     */
    fun play(): Promise<Void>

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/setMediaKeys)
     */
    fun setMediaKeys(mediaKeys: MediaKeys?): Promise<Void>
    val NETWORK_EMPTY: Short
    val NETWORK_IDLE: Short
    val NETWORK_LOADING: Short
    val NETWORK_NO_SOURCE: Short
    val HAVE_NOTHING: Short
    val HAVE_METADATA: Short
    val HAVE_CURRENT_DATA: Short
    val HAVE_FUTURE_DATA: Short
    val HAVE_ENOUGH_DATA: Short

    companion object {
        val NETWORK_EMPTY: Short
        val NETWORK_IDLE: Short
        val NETWORK_LOADING: Short
        val NETWORK_NO_SOURCE: Short
        val HAVE_NOTHING: Short
        val HAVE_METADATA: Short
        val HAVE_CURRENT_DATA: Short
        val HAVE_FUTURE_DATA: Short
        val HAVE_ENOUGH_DATA: Short
    }
}
