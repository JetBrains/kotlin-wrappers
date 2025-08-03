// Automatically generated - do not modify!

package web.speech

import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/SpeechSynthesisEvent#options)
 */
@JsPlainObject
external interface SpeechSynthesisEventInit :
    EventInit {
    var charIndex: Int?
    var charLength: Int?
    var elapsedTime: Float?
    var name: String?
    var utterance: SpeechSynthesisUtterance
}
