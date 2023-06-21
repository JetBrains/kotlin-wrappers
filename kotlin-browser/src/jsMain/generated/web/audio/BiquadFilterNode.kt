// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array

external class BiquadFilterNode(
    context: BaseAudioContext,
    options: BiquadFilterOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/Q) */
    val Q: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/detune) */
    val detune: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/frequency) */
    val frequency: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/gain) */
    val gain: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type) */
    var type: BiquadFilterType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/getFrequencyResponse) */
    fun getFrequencyResponse(
        frequencyHz: Float32Array,
        magResponse: Float32Array,
        phaseResponse: Float32Array,
    )
}
