// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.speech

import web.events.Event
import web.events.EventInit

external interface SpeechSynthesisEventInit : EventInit {
    var charIndex: Int?
    var charLength: Int?
    var elapsedTime: Double?
    var name: String?
    var utterance: SpeechSynthesisUtterance
}

sealed external class SpeechSynthesisEvent : Event {
    companion object
}
