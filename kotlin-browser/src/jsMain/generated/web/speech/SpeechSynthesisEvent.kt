// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.speech

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * This Web Speech API interface contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent)
 */
open external class SpeechSynthesisEvent<out C : EventTarget?>(
    override val type: EventType<SpeechSynthesisEvent<EventTarget>>,
    init: SpeechSynthesisEventInit,
) : Event<C>,
    SpeechSynthesisEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/charIndex)
     */
    override val charIndex: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/charLength)
     */
    override val charLength: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/elapsedTime)
     */
    override val elapsedTime: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/name)
     */
    override val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/utterance)
     */
    override val utterance: SpeechSynthesisUtterance

    companion object : SpeechSynthesisEventTypes
}
