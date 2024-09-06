// Automatically generated - do not modify!

package web.speech

import seskar.js.JsValue
import web.events.EventType

sealed external class SpeechSynthesisEventTypes :
    SpeechSynthesisEventTypes_deprecated {

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
