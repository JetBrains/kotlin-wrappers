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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConstantSourceNode/offset)
     */
    val offset: AudioParam
}
