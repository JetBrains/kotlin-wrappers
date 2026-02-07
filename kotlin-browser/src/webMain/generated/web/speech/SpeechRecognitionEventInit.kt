// Automatically generated - do not modify!

package web.speech

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionEvent/SpeechRecognitionEvent#options)
 */
@JsPlainObject
external interface SpeechRecognitionEventInit :
    EventInit {
    var resultIndex: Int?
    var results: SpeechRecognitionResultList
}
