// Automatically generated - do not modify!

package web.speech

import js.core.ArrayLike
import js.core.JsIterable

sealed external class SpeechRecognitionResult :
    ArrayLike<SpeechRecognitionAlternative>,
    JsIterable<SpeechRecognitionAlternative> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/isFinal) */
    val isFinal: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/item) */
    fun item(index: Int): SpeechRecognitionAlternative
}
