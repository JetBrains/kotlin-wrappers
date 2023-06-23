// Automatically generated - do not modify!

package web.audio

/**
 * An AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect. A ConvolverNode always has exactly one input and one output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode)
 */
external class ConvolverNode(
    context: BaseAudioContext,
    options: ConvolverOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/buffer) */
    var buffer: AudioBuffer?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/normalize) */
    var normalize: Boolean
}
