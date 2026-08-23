// Automatically generated - do not modify!

package web.mediastreams

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia#constraints)
 */
@JsPlainObject
external interface MediaStreamConstraints {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia#audio)
     */
    var audio: MediaTrackConstraints /* | Boolean */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia#peerIdentity)
     */
    var peerIdentity: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia#preferCurrentTab)
     */
    var preferCurrentTab: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia#video)
     */
    var video: MediaTrackConstraints /* | Boolean */?
}
