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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/metadata)
     */
    var metadata: MediaMetadata?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/playbackState)
     */
    var playbackState: MediaSessionPlaybackState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setActionHandler)
     */
    fun setActionHandler(
        action: MediaSessionAction,
        handler: MediaSessionActionHandler?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setCameraActive)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setCameraActive(active: Boolean)

    @JsName("setCameraActive")
    fun setCameraActiveAsync(active: Boolean): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setMicrophoneActive)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setMicrophoneActive(active: Boolean)

    @JsName("setMicrophoneActive")
    fun setMicrophoneActiveAsync(active: Boolean): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setPositionState)
     */
    fun setPositionState(state: MediaPositionState = definedExternally)
}
