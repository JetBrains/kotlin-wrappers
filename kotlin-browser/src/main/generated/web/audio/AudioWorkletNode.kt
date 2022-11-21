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
    var onprocessorerror: EventHandler<Event>?
    val parameters: AudioParamMap
    val port: MessagePort
}
