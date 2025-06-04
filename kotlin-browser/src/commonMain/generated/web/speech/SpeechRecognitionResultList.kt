// Automatically generated - do not modify!

package web.speech

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`SpeechRecognitionResultList`** interface of the Web Speech API represents a list of SpeechRecognitionResult objects, or a single one if results are being captured in SpeechRecognition.continuous mode.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList)
 */
external class SpeechRecognitionResultList
private constructor() :
    ArrayLike<SpeechRecognitionResult>,
    JsIterable<SpeechRecognitionResult> {
    /**
     * The **`length`** read-only property of the 'array' — the number of SpeechRecognitionResult objects in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList/length)
     */
    override val length: Int

    /**
     * The **`item`** getter of the syntax.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList/item)
     */
    fun item(index: Int): SpeechRecognitionResult
}
