// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Compute the vehicle velocity, local horizontal (VVLH) transform for a position property at a given time.
 * The VVLH axes is defined based on the motion of the provided position point as follows:
 * - The X axis is directed toward the point's velocity vector, in the direction of motion.
 * - The Y axis is along the angular momentum vector.
 * - The Z axis is along the position vector.
 * @param [time] The time at which to compute the VVLH transform.
 * @param [positionProperty] The position to compute the VVLH frame for.
 * @param [result] The object onto which to store the result.
 * @return The VVLH transform.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#computeVvlhTransform">Online Documentation</a>
 */
external fun computeVvlhTransform(
    time: JulianDate,
    positionProperty: PositionProperty,
    result: Matrix4,
): Matrix4
