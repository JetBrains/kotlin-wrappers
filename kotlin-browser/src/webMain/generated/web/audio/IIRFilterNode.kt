// Automatically generated - do not modify!

package web.audio

import js.buffer.ArrayBuffer
import js.typedarrays.Float32Array

/**
 * The **`IIRFilterNode`** interface of the Web Audio API is an AudioNode processor which implements a general **infinite impulse response** (IIR) filter; this type of filter can be used to implement tone control devices and graphic equalizers as well.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode)
 */
open external class IIRFilterNode(
    context: BaseAudioContext,
    options: IIRFilterOptions,
) : AudioNode {
    /**
     * The `getFrequencyResponse()` method of the IIRFilterNode interface takes the current filtering algorithm's settings and calculates the frequency response for frequencies specified in a specified array of frequencies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode/getFrequencyResponse)
     */
    fun getFrequencyResponse(
        frequencyHz: Float32Array<ArrayBuffer>,
        magResponse: Float32Array<ArrayBuffer>,
        phaseResponse: Float32Array<ArrayBuffer>,
    )
}
