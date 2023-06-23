// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array

/**
 * A WaveShaperNode always has exactly one input and one output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode)
 */
external class WaveShaperNode(
    context: BaseAudioContext,
    options: WaveShaperOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/curve) */
    var curve: Float32Array?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample) */
    var oversample: OverSampleType
}
