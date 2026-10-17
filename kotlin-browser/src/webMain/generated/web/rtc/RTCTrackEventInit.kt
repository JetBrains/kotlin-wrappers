// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.events.EventInit
import web.mediastreams.MediaStream
import web.mediastreams.MediaStreamTrack

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/RTCTrackEvent#options)
 */
@JsPlainObject
external interface RTCTrackEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/RTCTrackEvent#receiver)
     */
    var receiver: RTCRtpReceiver

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/RTCTrackEvent#streams)
     */
    var streams: ReadonlyArray<MediaStream>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/RTCTrackEvent#track)
     */
    var track: MediaStreamTrack

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/RTCTrackEvent#transceiver)
     */
    var transceiver: RTCRtpTransceiver
}
