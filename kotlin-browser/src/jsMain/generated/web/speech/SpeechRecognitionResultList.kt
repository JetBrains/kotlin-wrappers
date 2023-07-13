// Automatically generated - do not modify!

package web.speech

import js.core.ArrayLike
import js.iterable.JsIterable

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList) */
sealed external class SpeechRecognitionResultList :
    ArrayLike<SpeechRecognitionResult>,
    JsIterable<SpeechRecognitionResult> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList/item) */
    fun item(index: Int): SpeechRecognitionResult
}
