// Automatically generated - do not modify!

package web.speech

import web.events.Event
import web.events.EventType

/**
 * The **`SpeechRecognitionErrorEvent`** interface of the Web Speech API represents error messages from the recognition service.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent)
 */
open external class SpeechRecognitionErrorEvent(
    override val type: EventType<SpeechRecognitionErrorEvent>,
    init: SpeechRecognitionErrorEventInit,
) : Event {
    /**
     * The **`error`** read-only property of the SpeechRecognitionErrorEvent interface returns the type of error raised.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error)
     */
    val error: SpeechRecognitionErrorCode

    /**
     * The **`message`** read-only property of the SpeechRecognitionErrorEvent interface returns a message describing the error in more detail.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/message)
     */
    val message: String
}
