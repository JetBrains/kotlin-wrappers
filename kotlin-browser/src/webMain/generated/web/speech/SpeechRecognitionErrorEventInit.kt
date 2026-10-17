// Automatically generated - do not modify!

package web.speech

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/SpeechRecognitionErrorEvent#options)
 */
@JsPlainObject
external interface SpeechRecognitionErrorEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/SpeechRecognitionErrorEvent#error)
     */
    var error: SpeechRecognitionErrorCode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/SpeechRecognitionErrorEvent#message)
     */
    var message: String?
}
