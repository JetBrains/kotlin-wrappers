// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.speech

import seskar.js.JsValue
import web.events.EventType

sealed external interface SpeechSynthesisEventTypes_deprecated {
    @JsValue("boundary")
    val BOUNDARY: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @JsValue("end")
    val END: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @JsValue("mark")
    val MARK: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @JsValue("pause")
    val PAUSE: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @JsValue("resume")
    val RESUME: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @JsValue("start")
    val START: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally
}
