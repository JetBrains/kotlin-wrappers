// Automatically generated - do not modify!

package web.speech

sealed external class SpeechRecognitionResult {
    val isFinal: Boolean
    val length: Int
    fun item(index: Number): SpeechRecognitionAlternative
    // [index: number]: SpeechRecognitionAlternative
}
