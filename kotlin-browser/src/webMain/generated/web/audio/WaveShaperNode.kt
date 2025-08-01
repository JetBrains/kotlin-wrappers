// Automatically generated - do not modify!

package web.audio

import js.buffer.ArrayBuffer
import js.typedarrays.Float32Array
import kotlin.js.definedExternally

/**
 * The **`WaveShaperNode`** interface represents a non-linear distorter.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode)
 */
open external class WaveShaperNode(
    context: BaseAudioContext,
    options: WaveShaperOptions = definedExternally,
) : AudioNode {
    /**
     * The `curve` property of the WaveShaperNode interface is a Float32Array of numbers describing the distortion to apply.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/curve)
     */
    var curve: Float32Array<ArrayBuffer>?

    /**
     * The `oversample` property of the WaveShaperNode interface is an enumerated value indicating if oversampling must be used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample)
     */
    var oversample: OverSampleType
}
