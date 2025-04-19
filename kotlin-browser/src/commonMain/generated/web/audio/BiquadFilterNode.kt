// Automatically generated - do not modify!

package web.audio

import js.buffer.ArrayBuffer
import js.typedarrays.Float32Array
import kotlin.js.definedExternally

/**
 * The `BiquadFilterNode` interface represents a simple low-order filter, and is created using the BaseAudioContext/createBiquadFilter method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode)
 */
open external class BiquadFilterNode(
    context: BaseAudioContext,
    options: BiquadFilterOptions = definedExternally,
) : AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/Q)
     */
    val Q: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/detune)
     */
    val detune: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/frequency)
     */
    val frequency: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/gain)
     */
    val gain: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type)
     */
    var type: BiquadFilterType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/getFrequencyResponse)
     */
    fun getFrequencyResponse(
        frequencyHz: Float32Array<ArrayBuffer>,
        magResponse: Float32Array<ArrayBuffer>,
        phaseResponse: Float32Array<ArrayBuffer>,
    )
}
