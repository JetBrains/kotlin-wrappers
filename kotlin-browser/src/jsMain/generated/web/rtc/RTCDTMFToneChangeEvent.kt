// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Events sent to indicate that DTMF tones have started or finished playing. This interface is used by the tonechange event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent)
 */
open external class RTCDTMFToneChangeEvent(
    override val type: EventType<RTCDTMFToneChangeEvent, EventTarget>,
    init: RTCDTMFToneChangeEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent/tone)
     */
    val tone: String

    @JsAlias(THIS)
    override fun asInit(): RTCDTMFToneChangeEventInit

    companion object : RTCDTMFToneChangeEventTypes
}
