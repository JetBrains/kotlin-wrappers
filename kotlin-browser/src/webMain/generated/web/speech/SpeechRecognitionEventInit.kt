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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionEvent/SpeechRecognitionEvent#resultIndex)
     */
    var resultIndex: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionEvent/SpeechRecognitionEvent#results)
     */
    var results: SpeechRecognitionResultList
}
