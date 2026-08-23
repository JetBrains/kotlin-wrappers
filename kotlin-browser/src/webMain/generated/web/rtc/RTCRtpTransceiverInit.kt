// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.mediastreams.MediaStream

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTransceiver#init)
 */
@JsPlainObject
external interface RTCRtpTransceiverInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTransceiver#direction)
     */
    var direction: RTCRtpTransceiverDirection?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTransceiver#sendEncodings)
     */
    var sendEncodings: ReadonlyArray<RTCRtpEncodingParameters>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTransceiver#streams)
     */
    var streams: ReadonlyArray<MediaStream>?
}
