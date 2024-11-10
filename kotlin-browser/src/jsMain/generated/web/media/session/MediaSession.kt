// Automatically generated - do not modify!

package web.media.session

/**
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setPositionState)
     */
    fun setPositionState(state: MediaPositionState = definedExternally)
}
