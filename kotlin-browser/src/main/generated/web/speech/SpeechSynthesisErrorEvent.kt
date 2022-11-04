// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.speech

import web.events.Event

external interface SpeechSynthesisErrorEventInit : SpeechSynthesisEventInit {
    var error: SpeechSynthesisErrorCode
}

sealed external class SpeechSynthesisErrorEvent : Event {
    companion object
}
