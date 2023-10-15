// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.speech

import seskar.js.JsValue
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface SpeechSynthesisEventInit : EventInit {
    var charIndex: Int?
    var charLength: Int?
    var elapsedTime: Double?
    var name: String?
    var utterance: SpeechSynthesisUtterance
}

/**
 * This Web Speech API interface contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent)
 */
open external class SpeechSynthesisEvent(
    override val type: EventType<SpeechSynthesisEvent>,
    init: SpeechSynthesisEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/charIndex) */
    val charIndex: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/charLength) */
    val charLength: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/elapsedTime) */
    val elapsedTime: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/name) */
    val name: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/utterance) */
    val utterance: SpeechSynthesisUtterance

    companion object {
        @JsValue("boundary")
        val BOUNDARY: EventType<SpeechSynthesisEvent>

        @JsValue("end")
        val END: EventType<SpeechSynthesisEvent>

        @JsValue("mark")
        val MARK: EventType<SpeechSynthesisEvent>

        @JsValue("pause")
        val PAUSE: EventType<SpeechSynthesisEvent>

        @JsValue("resume")
        val RESUME: EventType<SpeechSynthesisEvent>

        @JsValue("start")
        val START: EventType<SpeechSynthesisEvent>
    }
}
