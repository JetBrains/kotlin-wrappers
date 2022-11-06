// Automatically generated - do not modify!

package web.speech

import kotlinx.js.ReadonlyArray
import web.events.Event
import web.events.EventTarget

sealed external class SpeechSynthesis :
    EventTarget {
    var onvoiceschanged: ((event: Event) -> Unit)?
    val paused: Boolean
    val pending: Boolean
    val speaking: Boolean
    fun cancel()
    fun getVoices(): ReadonlyArray<SpeechSynthesisVoice>
    fun pause()
    fun resume()
    fun speak(utterance: SpeechSynthesisUtterance)
}
