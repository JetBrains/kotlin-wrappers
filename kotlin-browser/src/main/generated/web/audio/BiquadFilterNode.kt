// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array

external class BiquadFilterNode(
    context: BaseAudioContext,
    options: BiquadFilterOptions = definedExternally,
) : AudioNode {
    val Q: AudioParam
    val detune: AudioParam
    val frequency: AudioParam
    val gain: AudioParam
    var type: BiquadFilterType
    fun getFrequencyResponse(
        frequencyHz: Float32Array,
        magResponse: Float32Array,
        phaseResponse: Float32Array,
    )
}
