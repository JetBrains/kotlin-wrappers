// Automatically generated - do not modify!

package web.audio

import kotlin.js.definedExternally

/**
 * The **`PannerNode`** interface defines an audio-processing object that represents the location, direction, and behavior of an audio source signal in a simulated physical space. This AudioNode uses right-hand Cartesian coordinates to describe the source's position as a vector and its orientation as a 3D directional cone.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode)
 */
open external class PannerNode(
    context: BaseAudioContext,
    options: PannerOptions = definedExternally,
) : AudioNode {
    /**
     * The **`coneInnerAngle`** property of the PannerNode interface is a double value describing the angle, in degrees, of a cone inside of which there will be no volume reduction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneInnerAngle)
     */
    var coneInnerAngle: Double

    /**
     * The **`coneOuterAngle`** property of the PannerNode interface is a double value describing the angle, in degrees, of a cone outside of which the volume will be reduced by a constant value, defined by the coneOuterGain property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneOuterAngle)
     */
    var coneOuterAngle: Double

    /**
     * The **`coneOuterGain`** property of the PannerNode interface is a double value, describing the amount of volume reduction outside the cone, defined by the coneOuterAngle attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneOuterGain)
     */
    var coneOuterGain: Double

    /**
     * The **`distanceModel`** property of the PannerNode interface is an enumerated value determining which algorithm to use to reduce the volume of the audio source as it moves away from the listener.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/distanceModel)
     */
    var distanceModel: DistanceModelType

    /**
     * The **`maxDistance`** property of the PannerNode interface is a double value representing the maximum distance between the audio source and the listener, after which the volume is not reduced any further. This value is used only by the linear distance model.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/maxDistance)
     */
    var maxDistance: Double

    /**
     * The **`orientationX`** property of the PannerNode interface indicates the X (horizontal) component of the direction in which the audio source is facing, in a 3D Cartesian coordinate space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationX)
     */
    val orientationX: AudioParam

    /**
     * The **`orientationY`** property of the PannerNode interface indicates the Y (vertical) component of the direction the audio source is facing, in 3D Cartesian coordinate space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationY)
     */
    val orientationY: AudioParam

    /**
     * The **`orientationZ`** property of the PannerNode interface indicates the Z (depth) component of the direction the audio source is facing, in 3D Cartesian coordinate space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationZ)
     */
    val orientationZ: AudioParam

    /**
     * The **`panningModel`** property of the PannerNode interface is an enumerated value determining which spatialization algorithm to use to position the audio in 3D space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/panningModel)
     */
    var panningModel: PanningModelType

    /**
     * The **`positionX`** property of the PannerNode interface specifies the X coordinate of the audio source's position in 3D Cartesian coordinates, corresponding to the horizontal axis (left-right).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionX)
     */
    val positionX: AudioParam

    /**
     * The **`positionY`** property of the PannerNode interface specifies the Y coordinate of the audio source's position in 3D Cartesian coordinates, corresponding to the vertical axis (top-bottom). The complete vector is defined by the position of the audio source, given as (positionX, positionY, positionZ), and the orientation of the audio source (that is, the direction in which it's facing), given as (orientationX, orientationY, orientationZ).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionY)
     */
    val positionY: AudioParam

    /**
     * The **`positionZ`** property of the PannerNode interface specifies the Z coordinate of the audio source's position in 3D Cartesian coordinates, corresponding to the depth axis (behind-in front of the listener). The complete vector is defined by the position of the audio source, given as (positionX, positionY, positionZ), and the orientation of the audio source (that is, the direction in which it's facing), given as (orientationX, orientationY, orientationZ).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionZ)
     */
    val positionZ: AudioParam

    /**
     * The **`refDistance`** property of the PannerNode interface is a double value representing the reference distance for reducing volume as the audio source moves further from the listener – i.e., the distance at which the volume reduction starts taking effect. This value is used by all distance models.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/refDistance)
     */
    var refDistance: Double

    /**
     * The **`rolloffFactor`** property of the PannerNode interface is a double value describing how quickly the volume is reduced as the source moves away from the listener. This value is used by all distance models. The rolloffFactor property's default value is 1.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/rolloffFactor)
     */
    var rolloffFactor: Double
}
