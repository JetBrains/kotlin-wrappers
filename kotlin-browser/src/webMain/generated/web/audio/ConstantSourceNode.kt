// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The `ConstantSourceNode` interface—part of the Web Audio API—represents an audio source (based upon AudioScheduledSourceNode) whose output is single unchanging value.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConstantSourceNode)
 */
open external class ConstantSourceNode(
    context: BaseAudioContext,
    options: ConstantSourceOptions = definedExternally,
) : AudioScheduledSourceNode {
    /**
     * The read-only `offset` property of the ConstantSourceNode interface returns an AudioParam object indicating the numeric a-rate value which is always returned by the source when asked for the next sample.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConstantSourceNode/offset)
     */
    val offset: AudioParam
}
