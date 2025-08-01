// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The `StereoPannerNode` interface of the Web Audio API represents a simple stereo panner node that can be used to pan an audio stream left or right.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode)
 */
open external class StereoPannerNode(
    context: BaseAudioContext,
    options: StereoPannerOptions = definedExternally,
) : AudioNode {
    /**
     * The `pan` property of the StereoPannerNode interface is an a-rate AudioParam representing the amount of panning to apply.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode/pan)
     */
    val pan: AudioParam
}
