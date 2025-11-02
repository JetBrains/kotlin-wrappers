// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`ConstantSourceNode`** interface—part of the Web Audio API—represents an audio source (based upon AudioScheduledSourceNode) whose output is single unchanging value. This makes it useful for cases in which you need a constant value coming in from an audio source. In addition, it can be used like a constructible AudioParam by automating the value of its offset or by connecting another node to it; see Controlling multiple parameters with ConstantSourceNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConstantSourceNode)
 */
open external class ConstantSourceNode(
    context: BaseAudioContext,
    options: ConstantSourceOptions = definedExternally,
) : AudioScheduledSourceNode {
    /**
     * The read-only **`offset`** property of the ConstantSourceNode interface returns an AudioParam object indicating the numeric a-rate value which is always returned by the source when asked for the next sample.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConstantSourceNode/offset)
     */
    val offset: AudioParam
}
