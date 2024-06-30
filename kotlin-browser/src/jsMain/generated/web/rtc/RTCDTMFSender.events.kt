// Automatically generated - do not modify!

package web.rtc

import web.events.EventInstance
import web.events.EventType

inline val <C : RTCDTMFSender> C.toneChangeEvent: EventInstance<RTCDTMFToneChangeEvent, C, C>
    get() = EventInstance(this, EventType("tonechange"))
