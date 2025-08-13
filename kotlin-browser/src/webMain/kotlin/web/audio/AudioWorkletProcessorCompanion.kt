package web.audio

import js.array.ReadonlyArray

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor)
 */
external interface AudioWorkletProcessorCompanion {
    val parameterDescriptors: ReadonlyArray<AudioParamDescriptor>?
}
