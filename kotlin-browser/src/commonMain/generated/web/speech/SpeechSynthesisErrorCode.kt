// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.speech

import js.reflect.unsafeCast

sealed external interface SpeechSynthesisErrorCode {
    companion object
}

inline val SpeechSynthesisErrorCode.Companion.audioBusy: SpeechSynthesisErrorCode
    get() = unsafeCast("audio-busy")

inline val SpeechSynthesisErrorCode.Companion.audioHardware: SpeechSynthesisErrorCode
    get() = unsafeCast("audio-hardware")

inline val SpeechSynthesisErrorCode.Companion.canceled: SpeechSynthesisErrorCode
    get() = unsafeCast("canceled")

inline val SpeechSynthesisErrorCode.Companion.interrupted: SpeechSynthesisErrorCode
    get() = unsafeCast("interrupted")

inline val SpeechSynthesisErrorCode.Companion.invalidArgument: SpeechSynthesisErrorCode
    get() = unsafeCast("invalid-argument")

inline val SpeechSynthesisErrorCode.Companion.languageUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("language-unavailable")

inline val SpeechSynthesisErrorCode.Companion.network: SpeechSynthesisErrorCode
    get() = unsafeCast("network")

inline val SpeechSynthesisErrorCode.Companion.notAllowed: SpeechSynthesisErrorCode
    get() = unsafeCast("not-allowed")

inline val SpeechSynthesisErrorCode.Companion.synthesisFailed: SpeechSynthesisErrorCode
    get() = unsafeCast("synthesis-failed")

inline val SpeechSynthesisErrorCode.Companion.synthesisUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("synthesis-unavailable")

inline val SpeechSynthesisErrorCode.Companion.textTooLong: SpeechSynthesisErrorCode
    get() = unsafeCast("text-too-long")

inline val SpeechSynthesisErrorCode.Companion.voiceUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("voice-unavailable")
