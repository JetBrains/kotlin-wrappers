// Automatically generated - do not modify!

package web.speech

import kotlinx.js.ReadonlyArray
import web.events.EventTarget

sealed external class SpeechSynthesis :
    EventTarget {
    // onvoiceschanged: ((this: SpeechSynthesis, ev: Event) => any) | null
    val paused: Boolean
    val pending: Boolean
    val speaking: Boolean
    fun cancel()
    fun getVoices(): ReadonlyArray<SpeechSynthesisVoice>
    fun pause()
    fun resume()
    fun speak(utterance: SpeechSynthesisUtterance)
}
