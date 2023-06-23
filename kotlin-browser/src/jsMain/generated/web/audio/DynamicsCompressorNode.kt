// Automatically generated - do not modify!

package web.audio

/**
 * Inherits properties from its parent, AudioNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode)
 */
external class DynamicsCompressorNode(
    context: BaseAudioContext,
    options: DynamicsCompressorOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/attack) */
    val attack: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/knee) */
    val knee: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/ratio) */
    val ratio: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/reduction) */
    val reduction: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/release) */
    val release: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/threshold) */
    val threshold: AudioParam
}
