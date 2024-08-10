// Automatically generated - do not modify!

package web.speech

import web.events.EventHandler
import web.events.EventTarget

/**
 * This Web Speech API interface represents a speech request. It contains the content the speech service should read and information about how to read it (e.g. language, pitch and volume.)
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance)
 */
open external class SpeechSynthesisUtterance(
    text: String = definedExternally,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/lang)
     */
    var lang: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/boundary_event)
     */
    var onboundary: EventHandler<SpeechSynthesisEvent, SpeechSynthesisUtterance, SpeechSynthesisUtterance>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/end_event)
     */
    var onend: EventHandler<SpeechSynthesisEvent, SpeechSynthesisUtterance, SpeechSynthesisUtterance>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/error_event)
     */
    var onerror: EventHandler<SpeechSynthesisErrorEvent, SpeechSynthesisUtterance, SpeechSynthesisUtterance>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/mark_event)
     */
    var onmark: EventHandler<SpeechSynthesisEvent, SpeechSynthesisUtterance, SpeechSynthesisUtterance>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/pause_event)
     */
    var onpause: EventHandler<SpeechSynthesisEvent, SpeechSynthesisUtterance, SpeechSynthesisUtterance>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/resume_event)
     */
    var onresume: EventHandler<SpeechSynthesisEvent, SpeechSynthesisUtterance, SpeechSynthesisUtterance>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/start_event)
     */
    var onstart: EventHandler<SpeechSynthesisEvent, SpeechSynthesisUtterance, SpeechSynthesisUtterance>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/pitch)
     */
    var pitch: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/rate)
     */
    var rate: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/text)
     */
    var text: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/voice)
     */
    var voice: SpeechSynthesisVoice?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/volume)
     */
    var volume: Float
}
