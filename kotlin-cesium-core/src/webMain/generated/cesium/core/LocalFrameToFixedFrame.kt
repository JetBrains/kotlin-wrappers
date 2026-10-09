// Automatically generated - do not modify!

package cesium.core

/**
 * Computes a 4x4 transformation matrix from a reference frame
 * centered at the provided origin to the provided ellipsoid's fixed reference frame.
 * @param [origin] The center point of the local reference frame.
 * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
 *   Default value - [Ellipsoid.default]
 * @param [result] The object onto which to store the result.
 */
typealias LocalFrameToFixedFrame = (
    origin: Cartesian3,
    ellipsoid: Ellipsoid?,
    result: Matrix4?,
) -> Matrix4
