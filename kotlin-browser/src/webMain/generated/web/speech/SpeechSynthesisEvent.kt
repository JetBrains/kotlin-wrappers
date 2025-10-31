// Automatically generated - do not modify!

package web.speech

import web.events.Event
import web.events.EventType

/**
 * The **`SpeechSynthesisEvent`** interface of the Web Speech API contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent)
 */
open external class SpeechSynthesisEvent(
    override val type: EventType<SpeechSynthesisEvent>,
    init: SpeechSynthesisEventInit,
) : Event {
    /**
     * The **`charIndex`** read-only property of the SpeechSynthesisUtterance interface returns the index position of the character in SpeechSynthesisUtterance.text that was being spoken when the event was triggered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/charIndex)
     */
    val charIndex: Int

    /**
     * The read-only **`charLength`** property of the SpeechSynthesisEvent interface returns the number of characters left to be spoken after the character at the SpeechSynthesisEvent.charIndex position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/charLength)
     */
    val charLength: Int

    /**
     * The **`elapsedTime`** read-only property of the SpeechSynthesisEvent returns the elapsed time in seconds, after the SpeechSynthesisUtterance.text started being spoken, at which the event was triggered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/elapsedTime)
     */
    val elapsedTime: Float

    /**
     * The **`name`** read-only property of the SpeechSynthesisUtterance interface returns the name associated with certain types of events occurring as the SpeechSynthesisUtterance.text is being spoken: the name of the SSML marker reached in the case of a SpeechSynthesisUtterance.mark_event event, or the type of boundary reached in the case of a SpeechSynthesisUtterance.boundary_event event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/name)
     */
    val name: String

    /**
     * The **`utterance`** read-only property of the SpeechSynthesisUtterance interface returns the SpeechSynthesisUtterance instance that the event was triggered on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/utterance)
     */
    val utterance: SpeechSynthesisUtterance

    companion object
}

inline val SpeechSynthesisEvent.Companion.BOUNDARY: EventType<SpeechSynthesisEvent>
    get() = EventType("boundary")

inline val SpeechSynthesisEvent.Companion.END: EventType<SpeechSynthesisEvent>
    get() = EventType("end")

inline val SpeechSynthesisEvent.Companion.MARK: EventType<SpeechSynthesisEvent>
    get() = EventType("mark")

inline val SpeechSynthesisEvent.Companion.PAUSE: EventType<SpeechSynthesisEvent>
    get() = EventType("pause")

inline val SpeechSynthesisEvent.Companion.RESUME: EventType<SpeechSynthesisEvent>
    get() = EventType("resume")

inline val SpeechSynthesisEvent.Companion.START: EventType<SpeechSynthesisEvent>
    get() = EventType("start")
