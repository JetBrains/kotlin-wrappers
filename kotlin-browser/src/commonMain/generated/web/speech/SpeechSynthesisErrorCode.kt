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
    get() = unsafeCast("audioBusy")

inline val SpeechSynthesisErrorCode.Companion.audioHardware: SpeechSynthesisErrorCode
    get() = unsafeCast("audioHardware")

inline val SpeechSynthesisErrorCode.Companion.canceled: SpeechSynthesisErrorCode
    get() = unsafeCast("canceled")

inline val SpeechSynthesisErrorCode.Companion.interrupted: SpeechSynthesisErrorCode
    get() = unsafeCast("interrupted")

inline val SpeechSynthesisErrorCode.Companion.invalidArgument: SpeechSynthesisErrorCode
    get() = unsafeCast("invalidArgument")

inline val SpeechSynthesisErrorCode.Companion.languageUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("languageUnavailable")

inline val SpeechSynthesisErrorCode.Companion.network: SpeechSynthesisErrorCode
    get() = unsafeCast("network")

inline val SpeechSynthesisErrorCode.Companion.notAllowed: SpeechSynthesisErrorCode
    get() = unsafeCast("notAllowed")

inline val SpeechSynthesisErrorCode.Companion.synthesisFailed: SpeechSynthesisErrorCode
    get() = unsafeCast("synthesisFailed")

inline val SpeechSynthesisErrorCode.Companion.synthesisUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("synthesisUnavailable")

inline val SpeechSynthesisErrorCode.Companion.textTooLong: SpeechSynthesisErrorCode
    get() = unsafeCast("textTooLong")

inline val SpeechSynthesisErrorCode.Companion.voiceUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("voiceUnavailable")
