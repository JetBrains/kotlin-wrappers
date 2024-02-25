// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import js.array.ReadonlyArray
import web.events.Event
import web.events.EventTarget
import web.events.EventType
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent)
 */
open external class RTCTrackEvent<out C : EventTarget?>(
    override val type: EventType<RTCTrackEvent<*>>,
    init: RTCTrackEventInit,
) : Event<C>,
    RTCTrackEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/receiver)
     */
    override val receiver: RTCRtpReceiver

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/streams)
     */
    override val streams: ReadonlyArray<MediaStream>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/track)
     */
    override val track: MediaStreamTrack

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/transceiver)
     */
    override val transceiver: RTCRtpTransceiver

    companion object : RTCTrackEventTypes
}
