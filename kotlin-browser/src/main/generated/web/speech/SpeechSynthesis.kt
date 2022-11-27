// Automatically generated - do not modify!

package web.speech

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class SpeechSynthesis :
    EventTarget {
    var onvoiceschanged: EventHandler<Event>?
    val paused: Boolean
    val pending: Boolean
    val speaking: Boolean
    fun cancel()
    fun getVoices(): ReadonlyArray<SpeechSynthesisVoice>
    fun pause()
    fun resume()
    fun speak(utterance: SpeechSynthesisUtterance)
}
