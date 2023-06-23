// Automatically generated - do not modify!

package web.speech

/**
 * This Web Speech API interface represents a voice that the system supports. Every SpeechSynthesisVoice has its own relative speech service including information about language, name and URI.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisVoice)
 */
sealed external class SpeechSynthesisVoice {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisVoice/default) */
    val default: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisVoice/lang) */
    val lang: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisVoice/localService) */
    val localService: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisVoice/name) */
    val name: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisVoice/voiceURI) */
    val voiceURI: String
}
