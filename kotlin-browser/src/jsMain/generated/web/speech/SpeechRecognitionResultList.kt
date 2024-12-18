// Automatically generated - do not modify!

package web.speech

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList)
 */
external class SpeechRecognitionResultList
private constructor() :
    ArrayLike<SpeechRecognitionResult>,
    JsIterable<SpeechRecognitionResult> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList/length)
     */
    val length: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList/item)
     */
    fun item(index: UInt): SpeechRecognitionResult
}
