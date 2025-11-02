// Automatically generated - do not modify!

package web.audio

import js.core.UInt53
import web.worklets.WorkletGlobalScope

/**
 * The **`AudioWorkletGlobalScope`** interface of the Web Audio API represents a global execution context for user-supplied code, which defines custom AudioWorkletProcessor-derived classes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope)
 */
open external class AudioWorkletGlobalScope
private constructor() :
    WorkletGlobalScope {
    /**
     * The read-only **`currentFrame`** property of the AudioWorkletGlobalScope interface returns an integer that represents the ever-increasing current sample-frame of the audio block being processed. It is incremented by 128 (the size of a render quantum) after the processing of each audio block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentFrame)
     */
    val currentFrame: UInt53

    /**
     * The read-only **`currentTime`** property of the AudioWorkletGlobalScope interface returns a double that represents the ever-increasing context time of the audio block being processed. It is equal to the currentTime property of the BaseAudioContext the worklet belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentTime)
     */
    val currentTime: Double

    /**
     * The read-only **`sampleRate`** property of the AudioWorkletGlobalScope interface returns a float that represents the sample rate of the associated BaseAudioContext the worklet belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/sampleRate)
     */
    val sampleRate: Float

    /**
     * The **`registerProcessor`** method of the AudioWorkletGlobalScope interface registers a class constructor derived from AudioWorkletProcessor interface under a specified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/registerProcessor)
     */
    fun registerProcessor(
        name: AudioWorkletProcessorName,
        processorCtor: AudioWorkletProcessorConstructor,
    )
}
