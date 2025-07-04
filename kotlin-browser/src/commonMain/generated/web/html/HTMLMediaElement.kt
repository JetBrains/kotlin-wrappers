// Automatically generated - do not modify!

package web.html

import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.http.CrossOrigin
import web.mediakey.MediaKeys
import web.mediasource.TimeRanges
import web.remoteplayback.RemotePlayback
import web.vtt.TextTrack
import web.vtt.TextTrackKind
import web.vtt.TextTrackList
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`HTMLMediaElement`** interface adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement)
 */
open external class HTMLMediaElement
private constructor() :
    HTMLElement {
    /**
     * The **`HTMLMediaElement.autoplay`** property reflects the `autoplay` HTML attribute, indicating whether playback should automatically begin as soon as enough media is available to do so without interruption.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/autoplay)
     */
    var autoplay: Boolean

    /**
     * The **`buffered`** read-only property of HTMLMediaElement objects returns a new static normalized `TimeRanges` object that represents the ranges of the media resource, if any, that the user agent has buffered at the moment the `buffered` property is accessed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/buffered)
     */
    val buffered: TimeRanges

    /**
     * The **`HTMLMediaElement.controls`** property reflects the `controls` HTML attribute, which controls whether user interface controls for playing the media item will be displayed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/controls)
     */
    var controls: Boolean

    /**
     * The **`HTMLMediaElement.crossOrigin`** property is the CORS setting for this media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * The **`HTMLMediaElement.currentSrc`** property contains the absolute URL of the chosen media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/currentSrc)
     */
    val currentSrc: String

    /**
     * The HTMLMediaElement interface's **`currentTime`** property specifies the current playback time in seconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/currentTime)
     */
    var currentTime: Double

    /**
     * The **`HTMLMediaElement.defaultMuted`** property reflects the `muted` HTML attribute, which indicates whether the media element's audio output should be muted by default.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/defaultMuted)
     */
    var defaultMuted: Boolean

    /**
     * The **`HTMLMediaElement.defaultPlaybackRate`** property indicates the default playback rate for the media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/defaultPlaybackRate)
     */
    var defaultPlaybackRate: Double

    /**
     * The **`disableRemotePlayback`** property of the HTMLMediaElement interface determines whether the media element is allowed to have a remote playback UI.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/disableRemotePlayback)
     */
    var disableRemotePlayback: Boolean

    /**
     * The _read-only_ HTMLMediaElement property **`duration`** indicates the length of the element's media in seconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/duration)
     */
    val duration: Double

    /**
     * The **`HTMLMediaElement.ended`** property indicates whether the media element has ended playback.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ended)
     */
    val ended: Boolean

    /**
     * The **`HTMLMediaElement.error`** property is the there has not been an error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/error)
     */
    val error: MediaError?

    /**
     * The **`HTMLMediaElement.loop`** property reflects the `loop` HTML attribute, which controls whether the media element should start over when it reaches the end.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loop)
     */
    var loop: Boolean

    /**
     * The read-only **`HTMLMediaElement.mediaKeys`** property returns a MediaKeys object, that is a set of keys that the element can use for decryption of media data during playback.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/mediaKeys)
     */
    val mediaKeys: MediaKeys?

    /**
     * The **`HTMLMediaElement.muted`** property indicates whether the media element is muted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/muted)
     */
    var muted: Boolean

    /**
     * The **`HTMLMediaElement.networkState`** property indicates the current state of the fetching of media over the network.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/networkState)
     */
    val networkState: NetworkState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/encrypted_event)
     */
    var onencrypted: EventHandler<MediaEncryptedEvent, HTMLMediaElement, HTMLMediaElement>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/waitingforkey_event)
     */
    var onwaitingforkey: EventHandler<Event, HTMLMediaElement, HTMLMediaElement>?

    /**
     * The read-only **`HTMLMediaElement.paused`** property tells whether the media element is paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/paused)
     */
    val paused: Boolean

    /**
     * The **`HTMLMediaElement.playbackRate`** property sets the rate at which the media is being played back.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/playbackRate)
     */
    var playbackRate: Double

    /**
     * The **`played`** read-only property of the HTMLMediaElement interface indicates the time ranges the resource, an audio or video media file, has played.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/played)
     */
    val played: TimeRanges

    /**
     * The **`preload`** property of the HTMLMediaElement interface is a string that provides a hint to the browser about what the author thinks will lead to the best user experience.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preload)
     */
    var preload: Preload

    /**
     * The **`HTMLMediaElement.preservesPitch`** property determines whether or not the browser should adjust the pitch of the audio to compensate for changes to the playback rate made by setting HTMLMediaElement.playbackRate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preservesPitch)
     */
    var preservesPitch: Boolean

    /**
     * The **`HTMLMediaElement.readyState`** property indicates the readiness state of the media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/readyState)
     */
    val readyState: ReadyState

    /**
     * The **`remote`** read-only property of the HTMLMediaElement interface returns the RemotePlayback object associated with the media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/remote)
     */
    val remote: RemotePlayback

    /**
     * The **`seekable`** read-only property of HTMLMediaElement objects returns a new static normalized `TimeRanges` object that represents the ranges of the media resource, if any, that the user agent is able to seek to at the time `seekable` property is accessed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seekable)
     */
    val seekable: TimeRanges

    /**
     * The **`seeking`** read-only property of the HTMLMediaElement interface is a Boolean indicating whether the resource, the audio or video, is in the process of seeking to a new position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeking)
     */
    val seeking: Boolean

    /**
     * The **`sinkId`** read-only property of the HTMLMediaElement interface returns a string that is the unique ID of the device to be used for playing audio output.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/sinkId)
     */
    val sinkId: String

    /**
     * The **`HTMLMediaElement.src`** property reflects the value of the HTML media element's `src` attribute, which indicates the URL of a media resource to use in the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/src)
     */
    var src: String

    /**
     * The **`srcObject`** property of the the source of the media associated with the HTMLMediaElement, or `null` if not assigned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/srcObject)
     */
    var srcObject: MediaProvider?

    /**
     * The read-only **`textTracks`** property on HTMLMediaElement objects returns a objects representing the media element's text tracks, in the same order as in the list of text tracks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/textTracks)
     */
    val textTracks: TextTrackList

    /**
     * The **`HTMLMediaElement.volume`** property sets the volume at which the media will be played.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/volume)
     */
    var volume: Double

    /**
     * The **`addTextTrack()`** method of the HTMLMediaElement interface creates a new TextTrack object and adds it to the media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/addTextTrack)
     */
    fun addTextTrack(
        kind: TextTrackKind,
        label: String = definedExternally,
        language: String = definedExternally,
    ): TextTrack

    /**
     * The HTMLMediaElement method **`canPlayType()`** reports how likely it is that the current browser will be able to play media of a given MIME type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canPlayType)
     */
    fun canPlayType(type: String): CanPlayTypeResult

    /**
     * The **`HTMLMediaElement.fastSeek()`** method quickly seeks the media to the new time with precision tradeoff.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/fastSeek)
     */
    fun fastSeek(time: Double)

    /**
     * The HTMLMediaElement method **`load()`** resets the media element to its initial state and begins the process of selecting a media source and loading the media in preparation for playback to begin at the beginning.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/load)
     */
    fun load()

    /**
     * The **`HTMLMediaElement.pause()`** method will pause playback of the media, if the media is already in a paused state this method will have no effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/pause)
     */
    fun pause()

    /**
     * The HTMLMediaElement **`play()`** method attempts to begin playback of the media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play)
     */
    @JsName("play")
    fun playAsync(): Promise<Void>

    /**
     * The **`setMediaKeys()`** method of the HTMLMediaElement interface sets the MediaKeys that will be used to decrypt media during playback.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/setMediaKeys)
     */
    @JsName("setMediaKeys")
    fun setMediaKeysAsync(mediaKeys: MediaKeys?): Promise<Void>

    /**
     * The **`setSinkId()`** method of the HTMLMediaElement interface sets the ID of the audio device to use for output and returns a Promise.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/setSinkId)
     */
    @JsName("setSinkId")
    fun setSinkIdAsync(sinkId: String): Promise<Void>
    val NETWORK_EMPTY: NetworkState
    val NETWORK_IDLE: NetworkState
    val NETWORK_LOADING: NetworkState
    val NETWORK_NO_SOURCE: NetworkState
    val HAVE_NOTHING: ReadyState
    val HAVE_METADATA: ReadyState
    val HAVE_CURRENT_DATA: ReadyState
    val HAVE_FUTURE_DATA: ReadyState
    val HAVE_ENOUGH_DATA: ReadyState

    companion object {
        val NETWORK_EMPTY: NetworkState
        val NETWORK_IDLE: NetworkState
        val NETWORK_LOADING: NetworkState
        val NETWORK_NO_SOURCE: NetworkState
        val HAVE_NOTHING: ReadyState
        val HAVE_METADATA: ReadyState
        val HAVE_CURRENT_DATA: ReadyState
        val HAVE_FUTURE_DATA: ReadyState
        val HAVE_ENOUGH_DATA: ReadyState
    }

    sealed interface NetworkState
    sealed interface ReadyState
}

/**
 * The HTMLMediaElement **`play()`** method attempts to begin playback of the media.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play)
 */
suspend inline fun HTMLMediaElement.play() {
    awaitPromiseLike(playAsync())
}

/**
 * The **`setMediaKeys()`** method of the HTMLMediaElement interface sets the MediaKeys that will be used to decrypt media during playback.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/setMediaKeys)
 */
suspend inline fun HTMLMediaElement.setMediaKeys(mediaKeys: MediaKeys?) {
    awaitPromiseLike(setMediaKeysAsync(mediaKeys))
}

/**
 * The **`setSinkId()`** method of the HTMLMediaElement interface sets the ID of the audio device to use for output and returns a Promise.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/setSinkId)
 */
suspend inline fun HTMLMediaElement.setSinkId(sinkId: String) {
    awaitPromiseLike(setSinkIdAsync(sinkId))
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/abort_event)
 */
inline val <C : HTMLMediaElement> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "abort")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canplay_event)
 */
inline val <C : HTMLMediaElement> C.canPlayEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "canplay")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canplaythrough_event)
 */
inline val <C : HTMLMediaElement> C.canPlayThroughEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "canplaythrough")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/durationchange_event)
 */
inline val <C : HTMLMediaElement> C.durationChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "durationchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/emptied_event)
 */
inline val <C : HTMLMediaElement> C.emptiedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "emptied")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/encrypted_event)
 */
inline val <C : HTMLMediaElement> C.encryptedEvent: EventInstance<MediaEncryptedEvent, C, C>
    get() = EventInstance(this, "encrypted")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ended_event)
 */
inline val <C : HTMLMediaElement> C.endedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "ended")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/error_event)
 */
inline val <C : HTMLMediaElement> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadeddata_event)
 */
inline val <C : HTMLMediaElement> C.loadedDataEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "loadeddata")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadedmetadata_event)
 */
inline val <C : HTMLMediaElement> C.loadedMetadataEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "loadedmetadata")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadstart_event)
 */
inline val <C : HTMLMediaElement> C.loadStartEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "loadstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/pause_event)
 */
inline val <C : HTMLMediaElement> C.pauseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "pause")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play_event)
 */
inline val <C : HTMLMediaElement> C.playEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "play")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/playing_event)
 */
inline val <C : HTMLMediaElement> C.playingEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "playing")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/progress_event)
 */
inline val <C : HTMLMediaElement> C.progressEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "progress")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ratechange_event)
 */
inline val <C : HTMLMediaElement> C.rateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "ratechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/resize_event)
 */
inline val <C : HTMLMediaElement> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "resize")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeked_event)
 */
inline val <C : HTMLMediaElement> C.seekedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "seeked")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeking_event)
 */
inline val <C : HTMLMediaElement> C.seekingEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "seeking")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/stalled_event)
 */
inline val <C : HTMLMediaElement> C.stalledEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "stalled")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/suspend_event)
 */
inline val <C : HTMLMediaElement> C.suspendEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "suspend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/timeupdate_event)
 */
inline val <C : HTMLMediaElement> C.timeUpdateEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "timeupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/volumechange_event)
 */
inline val <C : HTMLMediaElement> C.volumeChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "volumechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/waiting_event)
 */
inline val <C : HTMLMediaElement> C.waitingEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "waiting")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/waitingforkey_event)
 */
inline val <C : HTMLMediaElement> C.waitingForKeyEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "waitingforkey")
