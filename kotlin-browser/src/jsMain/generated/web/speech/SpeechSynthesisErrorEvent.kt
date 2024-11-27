// Automatically generated - do not modify!

package web.speech

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
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

    companion object {
        @JsValue("error")
        val ERROR: EventType<SpeechSynthesisErrorEvent>
    }
}
