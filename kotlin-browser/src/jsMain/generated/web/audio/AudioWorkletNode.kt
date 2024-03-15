// Automatically generated - do not modify!

package web.audio

import web.errors.ErrorEvent
import web.events.EventHandler
import web.messaging.MessagePort

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode)
 */
external class AudioWorkletNode(
    context: BaseAudioContext,
    name: String,
    options: AudioWorkletNodeOptions = definedExternally,
) : AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event)
     */
    var onprocessorerror: EventHandler<ErrorEvent, AudioWorkletNode>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/parameters)
     */
    val parameters: AudioParamMap

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/port)
     */
    val port: MessagePort
}
