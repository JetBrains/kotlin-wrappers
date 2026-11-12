// Automatically generated - do not modify!

package web.speech

/**
 * The **`SpeechRecognitionPhrase`** interface of the Web Speech API represents a phrase that can be passed to the speech recognition engine for contextual biasing.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionPhrase)
 */
open external class SpeechRecognitionPhrase(
    /**
     * The **`phrase`** read-only property of the SpeechRecognitionPhrase interface returns a string containing the word or phrase you want boosted in the recognition engine's contextual bias.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionPhrase/phrase)
     */
    open val phrase: String,
    /**
     * The **`boost`** read-only property of the SpeechRecognitionPhrase interface returns a floating point number representing the weight you want to give the corresponding phrase.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionPhrase/boost)
     */
    open val boost: Float = definedExternally,
)
