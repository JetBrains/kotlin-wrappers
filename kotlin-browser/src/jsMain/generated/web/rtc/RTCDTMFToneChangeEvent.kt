// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Events sent to indicate that DTMF tones have started or finished playing. This interface is used by the tonechange event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent)
 */
open external class RTCDTMFToneChangeEvent<out C : EventTarget?>(
    override val type: EventType<RTCDTMFToneChangeEvent<*>>,
    init: RTCDTMFToneChangeEventInit = definedExternally,
) : Event<C>,
    RTCDTMFToneChangeEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent/tone)
     */
    override val tone: String

    companion object : RTCDTMFToneChangeEventTypes
}
