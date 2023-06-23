// Automatically generated - do not modify!

package web.audio

/**
 * The pan property takes a unitless value between -1 (full left pan) and 1 (full right pan). This interface was introduced as a much simpler way to apply a simple panning effect than having to use a full PannerNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode)
 */
external class StereoPannerNode(
    context: BaseAudioContext,
    options: StereoPannerOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode/pan) */
    val pan: AudioParam
}
