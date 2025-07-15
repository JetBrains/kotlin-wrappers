// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.speech

import js.reflect.unsafeCast

sealed external interface SpeechRecognitionErrorCode {
    companion object
}

inline val SpeechRecognitionErrorCode.Companion.aborted: SpeechRecognitionErrorCode
    get() = unsafeCast("aborted")

inline val SpeechRecognitionErrorCode.Companion.audioCapture: SpeechRecognitionErrorCode
    get() = unsafeCast("audio-capture")

inline val SpeechRecognitionErrorCode.Companion.languageNotSupported: SpeechRecognitionErrorCode
    get() = unsafeCast("language-not-supported")

inline val SpeechRecognitionErrorCode.Companion.network: SpeechRecognitionErrorCode
    get() = unsafeCast("network")

inline val SpeechRecognitionErrorCode.Companion.noSpeech: SpeechRecognitionErrorCode
    get() = unsafeCast("no-speech")

inline val SpeechRecognitionErrorCode.Companion.notAllowed: SpeechRecognitionErrorCode
    get() = unsafeCast("not-allowed")

inline val SpeechRecognitionErrorCode.Companion.phrasesNotSupported: SpeechRecognitionErrorCode
    get() = unsafeCast("phrases-not-supported")

inline val SpeechRecognitionErrorCode.Companion.serviceNotAllowed: SpeechRecognitionErrorCode
    get() = unsafeCast("service-not-allowed")
