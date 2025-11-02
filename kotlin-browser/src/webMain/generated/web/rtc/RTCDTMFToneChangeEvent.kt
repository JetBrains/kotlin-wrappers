// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`RTCDTMFToneChangeEvent`** interface represents events sent to indicate that DTMF tones have started or finished playing. This interface is used by the tonechange event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent)
 */
open external class RTCDTMFToneChangeEvent(
    override val type: EventType<RTCDTMFToneChangeEvent>,
    init: RTCDTMFToneChangeEventInit = definedExternally,
) : Event {
    /**
     * The read-only property **`RTCDTMFToneChangeEvent.tone`** returns the DTMF character which has just begun to play, or an empty string (""). if all queued tones have finished playing (that is, RTCDTMFSender.toneBuffer is empty).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent/tone)
     */
    val tone: String

    companion object
}

inline val RTCDTMFToneChangeEvent.Companion.TONE_CHANGE: EventType<RTCDTMFToneChangeEvent>
    get() = EventType("tonechange")
