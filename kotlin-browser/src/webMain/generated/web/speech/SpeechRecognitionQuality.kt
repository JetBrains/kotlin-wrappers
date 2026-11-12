// Automatically generated - do not modify!

package web.speech

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SpeechRecognitionQuality

inline val SpeechRecognitionQuality.Companion.command: SpeechRecognitionQuality
    get() = unsafeCast("command")

inline val SpeechRecognitionQuality.Companion.conversation: SpeechRecognitionQuality
    get() = unsafeCast("conversation")

inline val SpeechRecognitionQuality.Companion.dictation: SpeechRecognitionQuality
    get() = unsafeCast("dictation")
