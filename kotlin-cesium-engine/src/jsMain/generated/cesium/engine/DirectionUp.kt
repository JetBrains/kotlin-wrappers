// Automatically generated - do not modify!

package cesium.engine

import js.objects.JsPlainObject

/**
 * An orientation given by a pair of unit vectors
 * @property [direction] The unit "direction" vector
 * @property [up] The unit "up" vector
 */
@JsPlainObject
sealed external interface DirectionUp : CameraOrientation {
    var direction: Cartesian3
    var up: Cartesian3
}
