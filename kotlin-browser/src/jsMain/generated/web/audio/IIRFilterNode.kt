// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array

/**
 * The IIRFilterNode interface of the Web Audio API is a AudioNode processor which implements a general infinite impulse response (IIR)  filter; this type of filter can be used to implement tone control devices and graphic equalizers as well. It lets the parameters of the filter response be specified, so that it can be tuned as needed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode)
 */
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
