// Automatically generated - do not modify!

package web.speech

import web.events.EventTarget

external class SpeechSynthesisUtterance :
    EventTarget {
    var lang: String
    var onboundary: ((event: SpeechSynthesisEvent) -> Unit)?
    var onend: ((event: SpeechSynthesisEvent) -> Unit)?
    var onerror: ((event: SpeechSynthesisErrorEvent) -> Unit)?
    var onmark: ((event: SpeechSynthesisEvent) -> Unit)?
    var onpause: ((event: SpeechSynthesisEvent) -> Unit)?
    var onresume: ((event: SpeechSynthesisEvent) -> Unit)?
    var onstart: ((event: SpeechSynthesisEvent) -> Unit)?
    var pitch: Double
    var rate: Double
    var text: String
    var voice: SpeechSynthesisVoice?
    var volume: Double
}
