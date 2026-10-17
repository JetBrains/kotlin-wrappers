// Automatically generated - do not modify!

package web.speech

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/SpeechSynthesisEvent#options)
 */
@JsPlainObject
external interface SpeechSynthesisEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/SpeechSynthesisEvent#charIndex)
     */
    var charIndex: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/SpeechSynthesisEvent#charLength)
     */
    var charLength: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/SpeechSynthesisEvent#elapsedTime)
     */
    var elapsedTime: Float?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/SpeechSynthesisEvent#name)
     */
    var name: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisEvent/SpeechSynthesisEvent#utterance)
     */
    var utterance: SpeechSynthesisUtterance
}
