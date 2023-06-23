// Automatically generated - do not modify!

package web.speech

import js.core.ArrayLike
import js.core.JsIterable

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList) */
sealed external class SpeechRecognitionResultList :
    ArrayLike<SpeechRecognitionResult>,
    JsIterable<SpeechRecognitionResult> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResultList/item) */
    fun item(index: Int): SpeechRecognitionResult
}
