// Automatically generated - do not modify!

package web.audio

import kotlinx.js.Float32Array

external class IIRFilterNode(
    context: BaseAudioContext,
    options: IIRFilterOptions,
) : AudioNode {
    fun getFrequencyResponse(
        frequencyHz: Float32Array,
        magResponse: Float32Array,
        phaseResponse: Float32Array,
    )
}
