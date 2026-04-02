// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Transforms a path entity's position into the local frame of the reference entity.
 * If the reference entity has an orientation, uses that orientation to define the local frame.
 * Otherwise, falls back to a VVLH (Vehicle Velocity Local Horizontal) frame derived from the reference entity's velocity.
 * @param [time] The time at which to evaluate the orientation or VVLH frame.
 * @param [pathEntityPos] The position of the path entity in the FIXED reference frame.
 * @param [refEntityPos] The position of the reference entity in the FIXED reference frame.
 * @param [refEntity] The reference entity whose frame to transform into.
 * @param [result] The object onto which to store the result.
 * @return The transformed position in the reference entity's local frame, or undefined if either input position is undefined.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#transformToEntityFrame">Online Documentation</a>
 */
external fun transformToEntityFrame(
    time: JulianDate,
    pathEntityPos: Cartesian3,
    refEntityPos: Cartesian3,
    refEntity: Entity,
    result: Cartesian3,
): Cartesian3?
