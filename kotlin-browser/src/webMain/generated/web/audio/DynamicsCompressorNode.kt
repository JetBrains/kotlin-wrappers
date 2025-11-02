// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`DynamicsCompressorNode`** interface provides a compression effect, which lowers the volume of the loudest parts of the signal in order to help prevent clipping and distortion that can occur when multiple sounds are played and multiplexed together at once. This is often used in musical production and game audio. DynamicsCompressorNode is an AudioNode that has exactly one input and one output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode)
 */
open external class DynamicsCompressorNode(
    context: BaseAudioContext,
    options: DynamicsCompressorOptions = definedExternally,
) : AudioNode {
    /**
     * The **`attack`** property of the DynamicsCompressorNode interface is a k-rate AudioParam representing the amount of time, in seconds, required to reduce the gain by 10 dB. It defines how quickly the signal is adapted when its volume is increased.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/attack)
     */
    val attack: AudioParam

    /**
     * The **`knee`** property of the DynamicsCompressorNode interface is a k-rate AudioParam containing a decibel value representing the range above the threshold where the curve smoothly transitions to the compressed portion.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/knee)
     */
    val knee: AudioParam

    /**
     * The **`ratio`** property of the DynamicsCompressorNode interface Is a k-rate AudioParam representing the amount of change, in dB, needed in the input for a 1 dB change in the output.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/ratio)
     */
    val ratio: AudioParam

    /**
     * The **`reduction`** read-only property of the DynamicsCompressorNode interface is a float representing the amount of gain reduction currently applied by the compressor to the signal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/reduction)
     */
    val reduction: Float

    /**
     * The **`release`** property of the DynamicsCompressorNode interface Is a k-rate AudioParam representing the amount of time, in seconds, required to increase the gain by 10 dB. It defines how quick the signal is adapted when its volume is reduced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/release)
     */
    val release: AudioParam

    /**
     * The **`threshold`** property of the DynamicsCompressorNode interface is a k-rate AudioParam representing the decibel value above which the compression will start taking effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/threshold)
     */
    val threshold: AudioParam
}
