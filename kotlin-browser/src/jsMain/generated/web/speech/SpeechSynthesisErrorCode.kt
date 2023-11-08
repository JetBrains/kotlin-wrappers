// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.speech

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SpeechSynthesisErrorCode {
    companion object {
        @JsValue("audio-busy")
        val audioBusy: SpeechSynthesisErrorCode

        @JsValue("audio-hardware")
        val audioHardware: SpeechSynthesisErrorCode

        @JsValue("canceled")
        val canceled: SpeechSynthesisErrorCode

        @JsValue("interrupted")
        val interrupted: SpeechSynthesisErrorCode

        @JsValue("invalid-argument")
        val invalidArgument: SpeechSynthesisErrorCode

        @JsValue("language-unavailable")
        val languageUnavailable: SpeechSynthesisErrorCode

        @JsValue("network")
        val network: SpeechSynthesisErrorCode

        @JsValue("not-allowed")
        val notAllowed: SpeechSynthesisErrorCode

        @JsValue("synthesis-failed")
        val synthesisFailed: SpeechSynthesisErrorCode

        @JsValue("synthesis-unavailable")
        val synthesisUnavailable: SpeechSynthesisErrorCode

        @JsValue("text-too-long")
        val textTooLong: SpeechSynthesisErrorCode

        @JsValue("voice-unavailable")
        val voiceUnavailable: SpeechSynthesisErrorCode
    }
}
