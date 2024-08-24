// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.rtc

import web.events.Event
import web.events.EventType

inline fun Event.Companion.bufferedAmountLow(): EventType<Event> =
    EventType("bufferedamountlow")

inline fun Event.Companion.connectionStateChange(): EventType<Event> =
    EventType("connectionstatechange")

inline fun Event.Companion.gatheringStateChange(): EventType<Event> =
    EventType("gatheringstatechange")

inline fun Event.Companion.iceConnectionStateChange(): EventType<Event> =
    EventType("iceconnectionstatechange")

inline fun Event.Companion.iceGatheringStateChange(): EventType<Event> =
    EventType("icegatheringstatechange")

inline fun Event.Companion.negotiationNeeded(): EventType<Event> =
    EventType("negotiationneeded")

inline fun Event.Companion.selectedCandidatePairChange(): EventType<Event> =
    EventType("selectedcandidatepairchange")

inline fun Event.Companion.signalingStateChange(): EventType<Event> =
    EventType("signalingstatechange")

inline fun Event.Companion.stateChange(): EventType<Event> =
    EventType("statechange")
