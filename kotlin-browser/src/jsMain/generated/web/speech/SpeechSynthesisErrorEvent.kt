// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.speech

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent)
 */
open external class SpeechSynthesisErrorEvent(
    override val type: EventType<SpeechSynthesisErrorEvent>,
    init: SpeechSynthesisErrorEventInit,
) : SpeechSynthesisEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error)
     */
    val error: SpeechSynthesisErrorCode

    @JsAlias(THIS)
    override fun asInit(): SpeechSynthesisErrorEventInit

    companion object : SpeechSynthesisErrorEventTypes
}
