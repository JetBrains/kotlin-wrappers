// Automatically generated - do not modify!

package web.audio

/**
 * A PannerNode always has exactly one input and one output: the input can be mono or stereo but the output is always stereo (2 channels); you can't have panning effects without at least two audio channels!
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode)
 */
external class PannerNode(
    context: BaseAudioContext,
    options: PannerOptions = definedExternally,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneInnerAngle) */
    var coneInnerAngle: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneOuterAngle) */
    var coneOuterAngle: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneOuterGain) */
    var coneOuterGain: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/distanceModel) */
    var distanceModel: DistanceModelType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/maxDistance) */
    var maxDistance: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationX) */
    val orientationX: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationY) */
    val orientationY: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationZ) */
    val orientationZ: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/panningModel) */
    var panningModel: PanningModelType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionX) */
    val positionX: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionY) */
    val positionY: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionZ) */
    val positionZ: AudioParam

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/refDistance) */
    var refDistance: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/rolloffFactor) */
    var rolloffFactor: Double
}
