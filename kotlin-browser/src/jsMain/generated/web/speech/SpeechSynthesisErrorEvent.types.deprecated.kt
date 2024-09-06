// Automatically generated - do not modify!

package web.speech

import seskar.js.JsValue
import web.events.EventType

sealed external class SpeechSynthesisErrorEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SpeechSynthesisErrorEvent.ERROR"),
    )
    @JsValue("error")
    fun error(): EventType<SpeechSynthesisErrorEvent>
}
