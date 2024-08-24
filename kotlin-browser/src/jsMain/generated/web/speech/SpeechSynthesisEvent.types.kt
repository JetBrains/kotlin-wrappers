// Automatically generated - do not modify!

package web.speech

import seskar.js.JsValue
import web.events.EventType

sealed external class SpeechSynthesisEventTypes {

    @JsValue("boundary")
    fun boundary(): EventType<SpeechSynthesisEvent>

    @JsValue("end")
    fun end(): EventType<SpeechSynthesisEvent>

    @JsValue("mark")
    fun mark(): EventType<SpeechSynthesisEvent>

    @JsValue("pause")
    fun pause(): EventType<SpeechSynthesisEvent>

    @JsValue("resume")
    fun resume(): EventType<SpeechSynthesisEvent>

    @JsValue("start")
    fun start(): EventType<SpeechSynthesisEvent>
}
