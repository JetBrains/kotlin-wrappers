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

open external class SpeechSynthesisEvent(
    type: String,
    eventInitDict: SpeechSynthesisEventInit,
) : Event {
    val charIndex: Int
    val charLength: Int
    val elapsedTime: Double
    val name: String
    val utterance: SpeechSynthesisUtterance

    companion object
}
