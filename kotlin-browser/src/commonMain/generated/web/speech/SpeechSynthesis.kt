// Automatically generated - do not modify!

package web.speech

import js.array.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`SpeechSynthesis`** interface of the Web Speech API is the controller interface for the speech service; this can be used to retrieve information about the synthesis voices available on the device, start and pause speech, and other commands besides.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis)
 */
external class SpeechSynthesis
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/voiceschanged_event)
     */
    var onvoiceschanged: EventHandler<Event, SpeechSynthesis, SpeechSynthesis>?

    /**
     * The **`paused`** read-only property of the `true` if the `SpeechSynthesis` object is in a paused state, or `false` if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/paused)
     */
    val paused: Boolean

    /**
     * The **`pending`** read-only property of the `true` if the utterance queue contains as-yet-unspoken utterances.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/pending)
     */
    val pending: Boolean

    /**
     * The **`speaking`** read-only property of the `true` if an utterance is currently in the process of being spoken — even if `SpeechSynthesis` is in a A boolean value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/speaking)
     */
    val speaking: Boolean

    /**
     * The **`cancel()`** method of the SpeechSynthesis interface removes all utterances from the utterance queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/cancel)
     */
    fun cancel()

    /**
     * The **`getVoices()`** method of the current device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/getVoices)
     */
    fun getVoices(): ReadonlyArray<SpeechSynthesisVoice>

    /**
     * The **`pause()`** method of the SpeechSynthesis interface puts the `SpeechSynthesis` object into a paused state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/pause)
     */
    fun pause()

    /**
     * The **`resume()`** method of the SpeechSynthesis interface puts the `SpeechSynthesis` object into a non-paused state: resumes it if it was already paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/resume)
     */
    fun resume()

    /**
     * The **`speak()`** method of the SpeechSynthesis interface adds an SpeechSynthesisUtterance to the utterance queue; it will be spoken when any other utterances queued before it have been spoken.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/speak)
     */
    fun speak(utterance: SpeechSynthesisUtterance)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/voiceschanged_event)
 */
inline val SpeechSynthesis.voicesChangedEvent: EventInstance<Event, SpeechSynthesis, SpeechSynthesis>
    get() = EventInstance(this, "voiceschanged")
