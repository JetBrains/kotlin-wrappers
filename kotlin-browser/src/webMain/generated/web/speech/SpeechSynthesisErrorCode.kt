// Automatically generated - do not modify!

package web.speech

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error)
 */
@JsUnion
sealed /* union */
external interface SpeechSynthesisErrorCode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#audio-busy)
 */
inline val SpeechSynthesisErrorCode.Companion.audioBusy: SpeechSynthesisErrorCode
    get() = unsafeCast("audio-busy")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#audio-hardware)
 */
inline val SpeechSynthesisErrorCode.Companion.audioHardware: SpeechSynthesisErrorCode
    get() = unsafeCast("audio-hardware")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#canceled)
 */
inline val SpeechSynthesisErrorCode.Companion.canceled: SpeechSynthesisErrorCode
    get() = unsafeCast("canceled")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#interrupted)
 */
inline val SpeechSynthesisErrorCode.Companion.interrupted: SpeechSynthesisErrorCode
    get() = unsafeCast("interrupted")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#invalid-argument)
 */
inline val SpeechSynthesisErrorCode.Companion.invalidArgument: SpeechSynthesisErrorCode
    get() = unsafeCast("invalid-argument")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#language-unavailable)
 */
inline val SpeechSynthesisErrorCode.Companion.languageUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("language-unavailable")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#network)
 */
inline val SpeechSynthesisErrorCode.Companion.network: SpeechSynthesisErrorCode
    get() = unsafeCast("network")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#not-allowed)
 */
inline val SpeechSynthesisErrorCode.Companion.notAllowed: SpeechSynthesisErrorCode
    get() = unsafeCast("not-allowed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#synthesis-failed)
 */
inline val SpeechSynthesisErrorCode.Companion.synthesisFailed: SpeechSynthesisErrorCode
    get() = unsafeCast("synthesis-failed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#synthesis-unavailable)
 */
inline val SpeechSynthesisErrorCode.Companion.synthesisUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("synthesis-unavailable")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#text-too-long)
 */
inline val SpeechSynthesisErrorCode.Companion.textTooLong: SpeechSynthesisErrorCode
    get() = unsafeCast("text-too-long")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error#voice-unavailable)
 */
inline val SpeechSynthesisErrorCode.Companion.voiceUnavailable: SpeechSynthesisErrorCode
    get() = unsafeCast("voice-unavailable")
