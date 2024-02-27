// Automatically generated - do not modify!

package web.speech

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class SpeechSynthesisErrorEventTypes :
    SpeechSynthesisErrorEventTypes_deprecated {

    @JsValue("error")
    fun <C : EventTarget> error(): EventType<SpeechSynthesisErrorEvent<C>>
}
