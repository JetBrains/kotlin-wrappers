// Automatically generated - do not modify!

package web.audio

import web.messaging.MessagePort

/**
 * The **`AudioWorkletProcessor`** interface of the Web Audio API represents an audio processing code behind a custom AudioWorkletNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor)
 */
open external class AudioWorkletProcessor
private constructor() {
    /**
     * The read-only **`port`** property of the The MessagePort object that is connecting the `AudioWorkletProcessor` and the associated `AudioWorkletNode`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor/port)
     */
    val port: MessagePort
}
