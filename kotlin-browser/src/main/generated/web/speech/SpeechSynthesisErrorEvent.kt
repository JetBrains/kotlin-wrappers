// Automatically generated - do not modify!

package web.speech

import web.events.EventType

external interface SpeechSynthesisErrorEventInit : SpeechSynthesisEventInit {
    var error: SpeechSynthesisErrorCode
}

open external class SpeechSynthesisErrorEvent(
    type: EventType<SpeechSynthesisErrorEvent>,
    init: SpeechSynthesisErrorEventInit,
) : SpeechSynthesisEvent {
    val error: SpeechSynthesisErrorCode

    companion object
}
