// Automatically generated - do not modify!

package cesium

import js.core.jso

sealed external interface CameraOrientation

fun CameraOrientation(
    heading: Double,
    pitch: Double,
    roll: Double,
): CameraOrientation {
    val o: HeadingPitchRollValues = jso()
    o.heading = heading
    o.pitch = pitch
    o.roll = roll
    return o
}

fun CameraOrientation(
    direction: Cartesian3,
    up: Cartesian3,
): CameraOrientation {
    val o: DirectionUp = jso()
    o.direction = direction
    o.up = up
    return o
}
