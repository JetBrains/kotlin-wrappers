// Automatically generated - do not modify!

package web.mediasession

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`MediaSession`** interface of the Media Session API allows a web page to provide custom behaviors for standard media playback interactions, and to report metadata that can be sent by the user agent to the device or operating system for presentation in standardized user interface elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession)
 */
external class MediaSession
private constructor() {
    /**
     * The **`metadata`** property of the MediaSession interface contains a MediaMetadata object providing descriptive information about the currently playing media, or `null` if the metadata has not been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/metadata)
     */
    var metadata: MediaMetadata?

    /**
     * The **`playbackState`** property of the playing or paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/playbackState)
     */
    var playbackState: MediaSessionPlaybackState

    /**
     * The **`setActionHandler()`** method of the MediaSession interface sets a handler for a media session action.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setActionHandler)
     */
    fun setActionHandler(
        action: MediaSessionAction,
        handler: MediaSessionActionHandler?,
    )

    /**
     * The **`setCameraActive()`** method of the MediaSession interface is used to indicate to the user agent whether the user's camera is considered to be active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setCameraActive)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setCameraActive(active: Boolean)

    @JsName("setCameraActive")
    fun setCameraActiveAsync(active: Boolean): Promise<Void>

    /**
     * The **`setMicrophoneActive()`** method of the MediaSession interface is used to indicate to the user agent whether the user's microphone is considered to be currently muted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setMicrophoneActive)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setMicrophoneActive(active: Boolean)

    @JsName("setMicrophoneActive")
    fun setMicrophoneActiveAsync(active: Boolean): Promise<Void>

    /**
     * The **`setPositionState()`** method of the document's media playback position and speed for presentation by user's device in any kind of interface that provides details about ongoing media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setPositionState)
     */
    fun setPositionState(state: MediaPositionState = definedExternally)
}
