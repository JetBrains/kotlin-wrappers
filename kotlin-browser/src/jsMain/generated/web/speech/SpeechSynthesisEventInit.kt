// Automatically generated - do not modify!

package web.speech

import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface SpeechSynthesisEventInit :
    EventInit {
    val charIndex: UInt?
    val charLength: UInt?
    val elapsedTime: Float?
    val name: String?
    val utterance: SpeechSynthesisUtterance
}
