// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.speech

import seskar.js.JsValue
import web.events.EventType

sealed external interface SpeechSynthesisErrorEventTypes {
    @JsValue("error")
    val ERROR: EventType<SpeechSynthesisErrorEvent<*>>
        get() = definedExternally
}
