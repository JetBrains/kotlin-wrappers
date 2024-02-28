// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.speech

import seskar.js.JsValue
import web.events.EventType

sealed external interface SpeechSynthesisEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.boundary()"),
    )
    @JsValue("boundary")
    val BOUNDARY: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.end()"),
    )
    @JsValue("end")
    val END: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.mark()"),
    )
    @JsValue("mark")
    val MARK: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.pause()"),
    )
    @JsValue("pause")
    val PAUSE: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.resume()"),
    )
    @JsValue("resume")
    val RESUME: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.start()"),
    )
    @JsValue("start")
    val START: EventType<SpeechSynthesisEvent<*>>
        get() = definedExternally
}
