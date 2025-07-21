// Automatically generated - do not modify!

package web.speech

/**
 * The **`SpeechRecognitionAlternative`** interface of the Web Speech API represents a single word that has been recognized by the speech recognition service.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionAlternative)
 */
open external class SpeechRecognitionAlternative
private constructor() {
    /**
     * The **`confidence`** read-only property of the SpeechRecognitionResult interface returns a numeric estimate of how confident the speech recognition system is that the recognition is correct.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionAlternative/confidence)
     */
    val confidence: Float

    /**
     * The **`transcript`** read-only property of the SpeechRecognitionResult interface returns a string containing the transcript of the recognized word(s).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionAlternative/transcript)
     */
    val transcript: String
}
