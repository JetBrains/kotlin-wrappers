// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The `DynamicsCompressorNode` interface provides a compression effect, which lowers the volume of the loudest parts of the signal in order to help prevent clipping and distortion that can occur when multiple sounds are played and multiplexed together at once.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode)
 */
open external class DynamicsCompressorNode(
    context: BaseAudioContext,
    options: DynamicsCompressorOptions = definedExternally,
) : AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/attack)
     */
    val attack: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/knee)
     */
    val knee: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/ratio)
     */
    val ratio: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/reduction)
     */
    val reduction: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/release)
     */
    val release: AudioParam

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/threshold)
     */
    val threshold: AudioParam
}
