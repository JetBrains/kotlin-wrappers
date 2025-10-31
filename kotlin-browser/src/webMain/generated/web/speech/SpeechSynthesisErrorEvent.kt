// Automatically generated - do not modify!

package web.speech

import web.events.EventType

/**
 * The **`SpeechSynthesisErrorEvent`** interface of the Web Speech API contains information about any errors that occur while processing SpeechSynthesisUtterance objects in the speech service.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent)
 */
open external class SpeechSynthesisErrorEvent(
    override val type: EventType<SpeechSynthesisErrorEvent>,
    init: SpeechSynthesisErrorEventInit,
) : SpeechSynthesisEvent {
    /**
     * The **`error`** property of the SpeechSynthesisErrorEvent interface returns an error code indicating what has gone wrong with a speech synthesis attempt.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error)
     */
    val error: SpeechSynthesisErrorCode

    companion object
}

inline val SpeechSynthesisErrorEvent.Companion.ERROR: EventType<SpeechSynthesisErrorEvent>
    get() = EventType("error")
