// Automatically generated - do not modify!

package web.audio

import web.errors.ErrorEvent
import web.events.EventHandler
import web.events.EventInstance
import web.messaging.MessagePort
import kotlin.js.definedExternally

/**
 * The **`AudioWorkletNode`** interface of the Web Audio API represents a base class for a user-defined AudioNode, which can be connected to an audio routing graph along with other nodes.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode)
 */
open external class AudioWorkletNode(
    context: BaseAudioContext,
    name: String,
    options: AudioWorkletNodeOptions = definedExternally,
) : AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event)
     */
    var onprocessorerror: EventHandler<ErrorEvent, AudioWorkletNode, AudioWorkletNode>?

    /**
     * The read-only **`parameters`** property of the underlying AudioWorkletProcessor according to its getter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/parameters)
     */
    val parameters: AudioParamMap

    /**
     * The read-only **`port`** property of the associated AudioWorkletProcessor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/port)
     */
    val port: MessagePort
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event)
 */
inline val <C : AudioWorkletNode> C.processorErrorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, "processorerror")
