package web.audio

import js.array.ReadonlyArray

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor)
 */
internal external interface AudioWorkletProcessorStatic {
    var parameterDescriptors: ReadonlyArray<AudioParamDescriptor>?
}
