// Automatically generated - do not modify!

package web.audio

/**
 * A delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data and its propagation to the output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode)
 */
external class DelayNode(
    context: BaseAudioContext,
    options: DelayOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode/delayTime) */
    val delayTime: AudioParam
}
