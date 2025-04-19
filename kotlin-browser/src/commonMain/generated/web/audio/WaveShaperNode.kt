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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/curve)
     */
    var curve: Float32Array<ArrayBuffer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample)
     */
    var oversample: OverSampleType
}
