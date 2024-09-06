// Automatically generated - do not modify!

package web.speech

import seskar.js.JsValue
import web.events.EventType

sealed external class SpeechSynthesisEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.BOUNDARY"),
    )
    @JsValue("boundary")
    fun boundary(): EventType<SpeechSynthesisEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.END"),
    )
    @JsValue("end")
    fun end(): EventType<SpeechSynthesisEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.MARK"),
    )
    @JsValue("mark")
    fun mark(): EventType<SpeechSynthesisEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.PAUSE"),
    )
    @JsValue("pause")
    fun pause(): EventType<SpeechSynthesisEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.RESUME"),
    )
    @JsValue("resume")
    fun resume(): EventType<SpeechSynthesisEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SpeechSynthesisEvent.START"),
    )
    @JsValue("start")
    fun start(): EventType<SpeechSynthesisEvent>
}
