// Automatically generated - do not modify!

package web.speech

import web.events.EventHandler
import web.events.EventTarget

external class SpeechSynthesisUtterance :
    EventTarget {
    var lang: String
    var onboundary: EventHandler<SpeechSynthesisEvent>?
    var onend: EventHandler<SpeechSynthesisEvent>?
    var onerror: EventHandler<SpeechSynthesisErrorEvent>?
    var onmark: EventHandler<SpeechSynthesisEvent>?
    var onpause: EventHandler<SpeechSynthesisEvent>?
    var onresume: EventHandler<SpeechSynthesisEvent>?
    var onstart: EventHandler<SpeechSynthesisEvent>?
    var pitch: Double
    var rate: Double
    var text: String
    var voice: SpeechSynthesisVoice?
    var volume: Double
}
