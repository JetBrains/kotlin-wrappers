// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.speech

external interface SpeechSynthesisErrorEventInit : SpeechSynthesisEventInit {
    var error: SpeechSynthesisErrorCode
}

open external class SpeechSynthesisErrorEvent(
    type: String,
    init: SpeechSynthesisErrorEventInit,
) : SpeechSynthesisEvent {
    val error: SpeechSynthesisErrorCode

    companion object
}
