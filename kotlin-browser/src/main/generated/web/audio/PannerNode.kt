// Automatically generated - do not modify!

package web.audio

external class PannerNode(
    context: BaseAudioContext,
    options: PannerOptions = definedExternally,
) : AudioNode {
    var coneInnerAngle: Double
    var coneOuterAngle: Double
    var coneOuterGain: Double
    var distanceModel: DistanceModelType
    var maxDistance: Double
    val orientationX: AudioParam
    val orientationY: AudioParam
    val orientationZ: AudioParam
    var panningModel: PanningModelType
    val positionX: AudioParam
    val positionY: AudioParam
    val positionZ: AudioParam
    var refDistance: Double
    var rolloffFactor: Double
}
