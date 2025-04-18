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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/buffer)
     */
    var buffer: AudioBuffer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/normalize)
     */
    var normalize: Boolean
}
