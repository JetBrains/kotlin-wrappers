// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import js.typedarrays.Float32Array
import web.messaging.MessagePort

/**
 * The **`AudioWorkletProcessor`** interface of the Web Audio API represents an audio processing code behind a custom AudioWorkletNode. It lives in the AudioWorkletGlobalScope and runs on the Web Audio rendering thread. In turn, an AudioWorkletNode based on it runs on the main thread.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor)
 */
abstract external class AudioWorkletProcessor {
    /**
     * The read-only **`port`** property of the AudioWorkletProcessor interface returns the associated MessagePort. It can be used to communicate between the processor and the AudioWorkletNode to which it belongs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor/port)
     */
    val port: MessagePort
    abstract fun process(
        inputs: ReadonlyArray<ReadonlyArray<Float32Array<*>>>,
        outputs: ReadonlyArray<ReadonlyArray<Float32Array<*>>>,
        parameters: ReadonlyRecord<AudioParamName, Float32Array<*>>,
    ): Boolean
}
