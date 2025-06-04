// Automatically generated - do not modify!

package web.speech

import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import kotlin.js.definedExternally

/**
 * The **`SpeechSynthesisUtterance`** interface of the Web Speech API represents a speech request.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance)
 */
open external class SpeechSynthesisUtterance(
    /**
     * The **`text`** property of the The text may be provided as plain text, or a well-formed SSML document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/text)
     */
    var text: String = definedExternally,
) : EventTarget {
    /**
     * The **`lang`** property of the SpeechSynthesisUtterance interface gets and sets the language of the utterance.
     *
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
     * The **`pitch`** property of the SpeechSynthesisUtterance interface gets and sets the pitch at which the utterance will be spoken at.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/pitch)
     */
    var pitch: Float

    /**
     * The **`rate`** property of the SpeechSynthesisUtterance interface gets and sets the speed at which the utterance will be spoken at.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/rate)
     */
    var rate: Float

    /**
     * The **`voice`** property of the SpeechSynthesisUtterance interface gets and sets the voice that will be used to speak the utterance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/voice)
     */
    var voice: SpeechSynthesisVoice?

    /**
     * The **`volume`** property of the SpeechSynthesisUtterance interface gets and sets the volume that the utterance will be spoken at.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/volume)
     */
    var volume: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/boundary_event)
     */
    @JsEvent("boundary")
    val boundaryEvent: EventInstance<SpeechSynthesisEvent, SpeechSynthesisUtterance /* this */, SpeechSynthesisUtterance /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/end_event)
     */
    @JsEvent("end")
    val endEvent: EventInstance<SpeechSynthesisEvent, SpeechSynthesisUtterance /* this */, SpeechSynthesisUtterance /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<SpeechSynthesisErrorEvent, SpeechSynthesisUtterance /* this */, SpeechSynthesisUtterance /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/mark_event)
     */
    @JsEvent("mark")
    val markEvent: EventInstance<SpeechSynthesisEvent, SpeechSynthesisUtterance /* this */, SpeechSynthesisUtterance /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/pause_event)
     */
    @JsEvent("pause")
    val pauseEvent: EventInstance<SpeechSynthesisEvent, SpeechSynthesisUtterance /* this */, SpeechSynthesisUtterance /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/resume_event)
     */
    @JsEvent("resume")
    val resumeEvent: EventInstance<SpeechSynthesisEvent, SpeechSynthesisUtterance /* this */, SpeechSynthesisUtterance /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/start_event)
     */
    @JsEvent("start")
    val startEvent: EventInstance<SpeechSynthesisEvent, SpeechSynthesisUtterance /* this */, SpeechSynthesisUtterance /* this */>
}
