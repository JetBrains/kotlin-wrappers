// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The `ConvolverNode` interface is an AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode)
 */
open external class ConvolverNode(
    context: BaseAudioContext,
    options: ConvolverOptions = definedExternally,
) : AudioNode {
    /**
     * The **`buffer`** property of the ConvolverNode interface represents a mono, stereo, or 4-channel AudioBuffer containing the (possibly multichannel) impulse response used by the `ConvolverNode` to create the reverb effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/buffer)
     */
    var buffer: AudioBuffer?

    /**
     * The `normalize` property of the ConvolverNode interface is a boolean that controls whether the impulse response from the buffer will be scaled by an equal-power normalization when the `buffer` attribute is set, or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/normalize)
     */
    var normalize: Boolean
}
