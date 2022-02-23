// Automatically generated - do not modify!

package cesium

external interface CameraOrientation {
    var heading: Double
    var pitch: Double
    var roll: Double
}

fun CameraOrientation(
    heading: Double,
    pitch: Double,
    roll: Double,
): CameraOrientation {
    val o: CameraOrientation = js("({})")
    o.heading = heading
    o.pitch = pitch
    o.roll = roll
    return o
}    
