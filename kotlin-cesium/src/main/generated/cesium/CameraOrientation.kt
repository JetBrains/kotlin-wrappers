// Automatically generated - do not modify!

package cesium

sealed external interface CameraOrientation

fun CameraOrientation(
    heading: Double,
    pitch: Double,
    roll: Double,
): CameraOrientation {
    val o: HeadingPitchRollValues = js("({})")
    o.heading = heading
    o.pitch = pitch
    o.roll = roll
    return o
}

fun CameraOrientation(
    direction: Cartesian3,
    up: Cartesian3,
): CameraOrientation {
    val o: DirectionUp = js("({})")
    o.direction = direction
    o.up = up
    return o
}
