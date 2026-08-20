// Automatically generated - do not modify!

package web.speech

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error)
 */
@JsUnion
sealed /* union */
external interface SpeechRecognitionErrorCode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error#aborted)
 */
inline val SpeechRecognitionErrorCode.Companion.aborted: SpeechRecognitionErrorCode
    get() = unsafeCast("aborted")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error#audio-capture)
 */
inline val SpeechRecognitionErrorCode.Companion.audioCapture: SpeechRecognitionErrorCode
    get() = unsafeCast("audio-capture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error#language-not-supported)
 */
inline val SpeechRecognitionErrorCode.Companion.languageNotSupported: SpeechRecognitionErrorCode
    get() = unsafeCast("language-not-supported")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error#network)
 */
inline val SpeechRecognitionErrorCode.Companion.network: SpeechRecognitionErrorCode
    get() = unsafeCast("network")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error#no-speech)
 */
inline val SpeechRecognitionErrorCode.Companion.noSpeech: SpeechRecognitionErrorCode
    get() = unsafeCast("no-speech")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error#not-allowed)
 */
inline val SpeechRecognitionErrorCode.Companion.notAllowed: SpeechRecognitionErrorCode
    get() = unsafeCast("not-allowed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error#phrases-not-supported)
 */
inline val SpeechRecognitionErrorCode.Companion.phrasesNotSupported: SpeechRecognitionErrorCode
    get() = unsafeCast("phrases-not-supported")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionErrorEvent/error#service-not-allowed)
 */
inline val SpeechRecognitionErrorCode.Companion.serviceNotAllowed: SpeechRecognitionErrorCode
    get() = unsafeCast("service-not-allowed")
