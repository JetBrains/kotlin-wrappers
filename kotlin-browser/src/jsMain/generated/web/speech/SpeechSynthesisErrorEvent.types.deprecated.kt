// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.speech

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface SpeechSynthesisErrorEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("SpeechSynthesisErrorEvent.error()"),
    )
    @JsValue("error")
    val ERROR: EventType<SpeechSynthesisErrorEvent<EventTarget>>
        get() = definedExternally
}
