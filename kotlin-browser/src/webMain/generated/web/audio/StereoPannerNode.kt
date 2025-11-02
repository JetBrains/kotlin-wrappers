// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`StereoPannerNode`** interface of the Web Audio API represents a simple stereo panner node that can be used to pan an audio stream left or right. It is an AudioNode audio-processing module that positions an incoming audio stream in a stereo image using a low-cost equal-power panning algorithm.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode)
 */
open external class StereoPannerNode(
    context: BaseAudioContext,
    options: StereoPannerOptions = definedExternally,
) : AudioNode {
    /**
     * The **`pan`** property of the StereoPannerNode interface is an a-rate AudioParam representing the amount of panning to apply. The value can range between -1 (full left pan) and 1 (full right pan).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode/pan)
     */
    val pan: AudioParam
}
