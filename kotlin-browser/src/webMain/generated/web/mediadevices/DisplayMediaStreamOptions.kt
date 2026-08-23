// Automatically generated - do not modify!

package web.mediadevices

import kotlinx.js.JsPlainObject
import web.mediastreams.MediaTrackConstraints

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia#options)
 */
@JsPlainObject
external interface DisplayMediaStreamOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia#audio)
     */
    var audio: MediaTrackConstraints /* | Boolean */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getDisplayMedia#video)
     */
    var video: MediaTrackConstraints /* | Boolean */?
}
