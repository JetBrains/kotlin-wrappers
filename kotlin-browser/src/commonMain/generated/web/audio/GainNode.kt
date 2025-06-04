// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The `GainNode` interface represents a change in volume.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode)
 */
open external class GainNode(
    context: BaseAudioContext,
    options: GainOptions = definedExternally,
) : AudioNode {
    /**
     * The `gain` property of the GainNode interface is an a-rate AudioParam representing the amount of gain to apply.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode/gain)
     */
    val gain: AudioParam
}
