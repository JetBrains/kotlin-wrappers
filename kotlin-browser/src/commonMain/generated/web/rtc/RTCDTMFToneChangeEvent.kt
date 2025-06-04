// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`RTCDTMFToneChangeEvent`** interface represents events sent to indicate that DTMF tones have started or finished playing.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent)
 */
open external class RTCDTMFToneChangeEvent(
    override val type: EventType<RTCDTMFToneChangeEvent>,
    init: RTCDTMFToneChangeEventInit = definedExternally,
) : Event {
    /**
     * The read-only property **`RTCDTMFToneChangeEvent.tone`** returns the DTMF character which has just begun to play, or an empty string (`''`).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent/tone)
     */
    val tone: String

    @JsAlias(THIS)
    override fun asInit(): RTCDTMFToneChangeEventInit

    companion object {
        @JsValue("tonechange")
        val TONE_CHANGE: EventType<RTCDTMFToneChangeEvent>
    }
}
