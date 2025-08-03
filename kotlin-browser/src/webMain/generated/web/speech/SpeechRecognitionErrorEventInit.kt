// Automatically generated - do not modify!

package web.speech

import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/SpeechRecognitionErrorEvent#options)
 */
@JsPlainObject
external interface SpeechRecognitionErrorEventInit :
    EventInit {
    var error: SpeechRecognitionErrorCode
    var message: String?
}
