// Automatically generated - do not modify!

package web.audio

import js.buffer.ArrayBuffer
import js.typedarrays.Float32Array
import kotlin.js.definedExternally

/**
 * The **`BiquadFilterNode`** interface represents a simple low-order filter, and is created using the BaseAudioContext/createBiquadFilter method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers. A BiquadFilterNode always has exactly one input and one output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode)
 */
open external class BiquadFilterNode(
    context: BaseAudioContext,
    options: BiquadFilterOptions = definedExternally,
) : AudioNode {
    /**
     * The **`Q`** property of the BiquadFilterNode interface is an a-rate AudioParam, a double representing a Q factor, or quality factor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/Q)
     */
    val Q: AudioParam

    /**
     * The **`detune`** property of the BiquadFilterNode interface is an a-rate AudioParam representing detuning of the frequency in cents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/detune)
     */
    val detune: AudioParam

    /**
     * The **`frequency`** property of the BiquadFilterNode interface is an a-rate AudioParam — a double representing a frequency in the current filtering algorithm measured in hertz (Hz).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/frequency)
     */
    val frequency: AudioParam

    /**
     * The **`gain`** property of the BiquadFilterNode interface is an a-rate AudioParam — a double representing the gain used in the current filtering algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/gain)
     */
    val gain: AudioParam

    /**
     * The **`type`** property of the BiquadFilterNode interface is a string (enum) value defining the kind of filtering algorithm the node is implementing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type)
     */
    var type: BiquadFilterType

    /**
     * The **`getFrequencyResponse()`** method of the BiquadFilterNode interface takes the current filtering algorithm's settings and calculates the frequency response for frequencies specified in a specified array of frequencies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/getFrequencyResponse)
     */
    fun getFrequencyResponse(
        frequencyHz: Float32Array<ArrayBuffer>,
        magResponse: Float32Array<ArrayBuffer>,
        phaseResponse: Float32Array<ArrayBuffer>,
    )
}
