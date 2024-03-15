// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.rtc

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.bufferedAmountLow(): EventType<Event, C> =
    EventType("bufferedamountlow")

inline fun <C : EventTarget> Event.Companion.connectionStateChange(): EventType<Event, C> =
    EventType("connectionstatechange")

inline fun <C : EventTarget> Event.Companion.gatheringStateChange(): EventType<Event, C> =
    EventType("gatheringstatechange")

inline fun <C : EventTarget> Event.Companion.iceConnectionStateChange(): EventType<Event, C> =
    EventType("iceconnectionstatechange")

inline fun <C : EventTarget> Event.Companion.iceGatheringStateChange(): EventType<Event, C> =
    EventType("icegatheringstatechange")

inline fun <C : EventTarget> Event.Companion.negotiationNeeded(): EventType<Event, C> =
    EventType("negotiationneeded")

inline fun <C : EventTarget> Event.Companion.selectedCandidatePairChange(): EventType<Event, C> =
    EventType("selectedcandidatepairchange")

inline fun <C : EventTarget> Event.Companion.signalingStateChange(): EventType<Event, C> =
    EventType("signalingstatechange")

inline fun <C : EventTarget> Event.Companion.stateChange(): EventType<Event, C> =
    EventType("statechange")
