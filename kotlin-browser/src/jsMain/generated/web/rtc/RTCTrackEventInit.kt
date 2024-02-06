// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import web.events.EventInit
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack

external interface RTCTrackEventInit : EventInit {
    var receiver: RTCRtpReceiver
    var streams: ReadonlyArray<MediaStream>?
    var track: MediaStreamTrack
    var transceiver: RTCRtpTransceiver
}
