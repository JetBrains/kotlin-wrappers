// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventHandler
import web.messaging.MessagePort

external class AudioWorkletNode(
    context: BaseAudioContext,
    name: String,
    options: AudioWorkletNodeOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event) */
    var onprocessorerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/parameters) */
    val parameters: AudioParamMap

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/port) */
    val port: MessagePort
}
