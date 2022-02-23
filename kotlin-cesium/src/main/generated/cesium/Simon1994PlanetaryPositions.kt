// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Contains functions for finding the Cartesian coordinates of the sun and the moon in the
 * Earth-centered inertial frame.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Simon1994PlanetaryPositions.html">Online Documentation</a>
 */
external object Simon1994PlanetaryPositions {
    /**
     * Computes the position of the Sun in the Earth-centered inertial frame
     * @param [julianDate] The time at which to compute the Sun's position, if not provided the current system time is used.
     * @param [result] The object onto which to store the result.
     * @return Calculated sun position
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Simon1994PlanetaryPositions.html#.computeSunPositionInEarthInertialFrame">Online Documentation</a>
     */
    fun computeSunPositionInEarthInertialFrame(
        julianDate: JulianDate? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes the position of the Moon in the Earth-centered inertial frame
     * @param [julianDate] The time at which to compute the Sun's position, if not provided the current system time is used.
     * @param [result] The object onto which to store the result.
     * @return Calculated moon position
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Simon1994PlanetaryPositions.html#.computeMoonPositionInEarthInertialFrame">Online Documentation</a>
     */
    fun computeMoonPositionInEarthInertialFrame(
        julianDate: JulianDate? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3
}
