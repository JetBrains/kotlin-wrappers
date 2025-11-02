// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`DelayNode`** interface represents a delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data and its propagation to the output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode)
 */
open external class DelayNode(
    context: BaseAudioContext,
    options: DelayOptions = definedExternally,
) : AudioNode {
    /**
     * The **`delayTime`** property of the DelayNode interface is an a-rate AudioParam representing the amount of delay to apply.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode/delayTime)
     */
    val delayTime: AudioParam
}
