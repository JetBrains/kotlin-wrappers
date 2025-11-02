// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`GainNode`** interface represents a change in volume. It is an AudioNode audio-processing module that causes a given gain to be applied to the input data before its propagation to the output. A GainNode always has exactly one input and one output, both with the same number of channels.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode)
 */
open external class GainNode(
    context: BaseAudioContext,
    options: GainOptions = definedExternally,
) : AudioNode {
    /**
     * The **`gain`** property of the GainNode interface is an a-rate AudioParam representing the amount of gain to apply.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode/gain)
     */
    val gain: AudioParam
}
