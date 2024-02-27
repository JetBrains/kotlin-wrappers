// Automatically generated - do not modify!

package web.speech

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class SpeechSynthesisEventTypes :
    SpeechSynthesisEventTypes_deprecated {

    @JsValue("boundary")
    fun <C : EventTarget> boundary(): EventType<SpeechSynthesisEvent<C>>

    @JsValue("end")
    fun <C : EventTarget> end(): EventType<SpeechSynthesisEvent<C>>

    @JsValue("mark")
    fun <C : EventTarget> mark(): EventType<SpeechSynthesisEvent<C>>

    @JsValue("pause")
    fun <C : EventTarget> pause(): EventType<SpeechSynthesisEvent<C>>

    @JsValue("resume")
    fun <C : EventTarget> resume(): EventType<SpeechSynthesisEvent<C>>

    @JsValue("start")
    fun <C : EventTarget> start(): EventType<SpeechSynthesisEvent<C>>
}
