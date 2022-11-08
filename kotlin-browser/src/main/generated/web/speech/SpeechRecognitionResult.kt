// Automatically generated - do not modify!

package web.speech

import kotlinx.js.ArrayLike

sealed external class SpeechRecognitionResult :
    ArrayLike<SpeechRecognitionAlternative> {
    val isFinal: Boolean
    fun item(index: Number): SpeechRecognitionAlternative
}
