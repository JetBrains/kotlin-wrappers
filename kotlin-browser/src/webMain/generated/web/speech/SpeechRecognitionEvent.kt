// Automatically generated - do not modify!

package web.speech

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType

/**
 * The **`SpeechRecognitionEvent`** interface of the Web Speech API represents the event object for the SpeechRecognition.result_event and SpeechRecognition.nomatch_event events, and contains all the data associated with an interim or final speech recognition result.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionEvent)
 */
open external class SpeechRecognitionEvent(
    override val type: EventType<SpeechRecognitionEvent>,
    init: SpeechRecognitionEventInit,
) : Event {
    /**
     * The **`resultIndex`** read-only property of the SpeechRecognitionEvent interface returns the lowest index value result in the SpeechRecognitionResultList 'array' that has actually changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionEvent/resultIndex)
     */
    val resultIndex: Int

    /**
     * The **`results`** read-only property of the SpeechRecognitionEvent interface returns a SpeechRecognitionResultList object representing all the speech recognition results for the current session.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionEvent/results)
     */
    val results: SpeechRecognitionResultList
}

inline fun SpeechRecognitionEvent.asInit(): SpeechRecognitionEventInit =
    unsafeCast(this)
