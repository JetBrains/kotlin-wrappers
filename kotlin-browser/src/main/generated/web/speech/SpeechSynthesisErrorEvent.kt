// Automatically generated - do not modify!

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
