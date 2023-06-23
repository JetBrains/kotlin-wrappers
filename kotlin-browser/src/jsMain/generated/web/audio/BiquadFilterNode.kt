// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array

/**
 * A simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode)
 */
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
