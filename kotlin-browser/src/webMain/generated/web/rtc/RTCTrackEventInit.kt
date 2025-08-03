// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.events.EventInit
import web.mediastreams.MediaStream
import web.mediastreams.MediaStreamTrack

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/RTCTrackEvent#options)
 */
@JsPlainObject
external interface RTCTrackEventInit :
    EventInit {
    var receiver: RTCRtpReceiver
    var streams: ReadonlyArray<MediaStream>?
    var track: MediaStreamTrack
    var transceiver: RTCRtpTransceiver
}
