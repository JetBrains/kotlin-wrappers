// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array

external class IIRFilterNode(
    context: BaseAudioContext,
    options: IIRFilterOptions,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode/getFrequencyResponse) */
    fun getFrequencyResponse(
        frequencyHz: Float32Array,
        magResponse: Float32Array,
        phaseResponse: Float32Array,
    )
}
