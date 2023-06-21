// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.speech

import web.events.EventType

external interface SpeechSynthesisErrorEventInit : SpeechSynthesisEventInit {
    var error: SpeechSynthesisErrorCode
}

open external class SpeechSynthesisErrorEvent(
    override val type: EventType<SpeechSynthesisErrorEvent>,
    init: SpeechSynthesisErrorEventInit,
) : SpeechSynthesisEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error) */
    val error: SpeechSynthesisErrorCode

    companion object
}
