// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.speech

import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent)
 */
open external class SpeechSynthesisErrorEvent<out C : EventTarget?>(
    override val type: EventType<SpeechSynthesisErrorEvent<C>>,
    init: SpeechSynthesisErrorEventInit,
) : SpeechSynthesisEvent<C>,
    SpeechSynthesisErrorEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error)
     */
    override val error: SpeechSynthesisErrorCode

    companion object : SpeechSynthesisErrorEventTypes
}
