// Automatically generated - do not modify!

package web.speech

import web.events.EventTarget

external class SpeechSynthesisUtterance :
    EventTarget {
    var lang: String

    // onboundary: ((this: SpeechSynthesisUtterance, ev: SpeechSynthesisEvent) => any) | null
    // onend: ((this: SpeechSynthesisUtterance, ev: SpeechSynthesisEvent) => any) | null
    // onerror: ((this: SpeechSynthesisUtterance, ev: SpeechSynthesisErrorEvent) => any) | null
    // onmark: ((this: SpeechSynthesisUtterance, ev: SpeechSynthesisEvent) => any) | null
    // onpause: ((this: SpeechSynthesisUtterance, ev: SpeechSynthesisEvent) => any) | null
    // onresume: ((this: SpeechSynthesisUtterance, ev: SpeechSynthesisEvent) => any) | null
    // onstart: ((this: SpeechSynthesisUtterance, ev: SpeechSynthesisEvent) => any) | null
    var pitch: Double
    var rate: Double
    var text: String
    var voice: SpeechSynthesisVoice?
    var volume: Double
}
