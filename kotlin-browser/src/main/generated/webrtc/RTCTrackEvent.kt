// Automatically generated - do not modify!

package webrtc

import js.core.ReadonlyArray
import media.streams.MediaStream
import media.streams.MediaStreamTrack
import web.events.Event
import web.events.EventInit

external interface RTCTrackEventInit : EventInit {
    var receiver: RTCRtpReceiver
    var streams: ReadonlyArray<MediaStream>?
    var track: MediaStreamTrack
    var transceiver: RTCRtpTransceiver
}

open external class RTCTrackEvent(
    type: String,
    init: RTCTrackEventInit,
) : Event {
    val receiver: RTCRtpReceiver
    val streams: ReadonlyArray<MediaStream>
    val track: MediaStreamTrack
    val transceiver: RTCRtpTransceiver

    companion object
}
