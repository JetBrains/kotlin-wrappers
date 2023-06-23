// Automatically generated - do not modify!

package web.audio

/**
 * A change in volume. It is an AudioNode audio-processing module that causes a given gain to be applied to the input data before its propagation to the output. A GainNode always has exactly one input and one output, both with the same number of channels.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode)
 */
external class GainNode(
    context: BaseAudioContext,
    options: GainOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode/gain) */
    val gain: AudioParam
}
