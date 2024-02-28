// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.rtc

import web.events.EventTarget
import web.events.EventType

inline fun RTCPeerConnectionIceEvent(
    type: EventType<RTCPeerConnectionIceEvent<EventTarget?>>,
): RTCPeerConnectionIceEvent<*> =
    RTCPeerConnectionIceEvent<EventTarget?>(
        type = type,
    )

inline fun RTCPeerConnectionIceEvent(
    type: EventType<RTCPeerConnectionIceEvent<EventTarget?>>,
    init: RTCPeerConnectionIceEventInit,
): RTCPeerConnectionIceEvent<*> =
    RTCPeerConnectionIceEvent<EventTarget?>(
        type = type,
        init = init,
    )
