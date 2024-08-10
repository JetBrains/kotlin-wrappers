// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.events.EventInit
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack

@JsPlainObject
external interface RTCTrackEventInit :
    EventInit {
    val receiver: RTCRtpReceiver
    val streams: ReadonlyArray<MediaStream>?
    val track: MediaStreamTrack
    val transceiver: RTCRtpTransceiver
}
