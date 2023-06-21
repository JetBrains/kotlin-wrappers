// Automatically generated - do not modify!

package web.speech

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class SpeechSynthesis :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/voiceschanged_event) */
    var onvoiceschanged: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/paused) */
    val paused: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/pending) */
    val pending: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/speaking) */
    val speaking: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/cancel) */
    fun cancel()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/getVoices) */
    fun getVoices(): ReadonlyArray<SpeechSynthesisVoice>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/pause) */
    fun pause()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/resume) */
    fun resume()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/speak) */
    fun speak(utterance: SpeechSynthesisUtterance)
}
