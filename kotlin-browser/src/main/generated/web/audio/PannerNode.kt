// Automatically generated - do not modify!

package web.audio

external class PannerNode(
    context: BaseAudioContext,
    options: PannerOptions = definedExternally,
) : AudioNode {
    var coneInnerAngle: Number
    var coneOuterAngle: Number
    var coneOuterGain: Number
    var distanceModel: DistanceModelType
    var maxDistance: Number
    val orientationX: AudioParam
    val orientationY: AudioParam
    val orientationZ: AudioParam
    var panningModel: PanningModelType
    val positionX: AudioParam
    val positionY: AudioParam
    val positionZ: AudioParam
    var refDistance: Number
    var rolloffFactor: Number
}
