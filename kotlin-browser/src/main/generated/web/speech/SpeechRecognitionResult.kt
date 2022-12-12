// Automatically generated - do not modify!

package web.speech

import js.core.ArrayLike
import js.core.JsIterable

sealed external class SpeechRecognitionResult :
    ArrayLike<SpeechRecognitionAlternative>,
    JsIterable<SpeechRecognitionAlternative> {
    val isFinal: Boolean
    fun item(index: Int): SpeechRecognitionAlternative
}
