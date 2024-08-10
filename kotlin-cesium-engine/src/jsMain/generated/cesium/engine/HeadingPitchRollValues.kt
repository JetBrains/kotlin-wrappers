// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * An orientation given by numeric heading, pitch, and roll
 * @property [heading] The heading in radians
 *   Default value - `0.0`
 * @property [pitch] The pitch in radians
 *   Default value - `-Math.PI_OVER_TWO`
 * @property [roll] The roll in radians
 *   Default value - `0.0`
 */
@JsPlainObject
sealed external interface HeadingPitchRollValues : CameraOrientation {
    var heading: Double?
    var pitch: Double?
    var roll: Double?
}
