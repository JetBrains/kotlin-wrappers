// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import cesium.core.JulianDate
import cesium.core.Matrix3
import cesium.core.TimeInterval
import js.promise.Promise
import js.void.Void
import seskar.js.JsAsync

/**
 * Contains functions for transforming positions to various reference frames.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html">Online Documentation</a>
 */
external object Transforms {
    /**
     * The default function to compute a rotation matrix to transform a point or vector from the International Celestial
     * Reference Frame (GCRF/ICRF) inertial frame axes to the central body, typically Earth, fixed frame axis at a given
     * time for use in lighting and transformation from inertial reference frames. This function may return undefined if
     * the data necessary to do the transformation is not yet loaded.
     * ```
     * // Set the default ICRF to fixed transformation to that of the Moon.
     * CelestialFrameTransforms.computeIcrfToCentralBodyFixedMatrix = CelestialFrameTransforms.computeIcrfToMoonFixedMatrix;
     * ```
     * @param [date] The time at which to compute the rotation matrix.
     * @param [result] The object onto which to store the result.  If this parameter is
     *   not specified, a new instance is created and returned.
     * @return The rotation matrix, or undefined if the data necessary to do the
     *   transformation is not yet loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.computeIcrfToCentralBodyFixedMatrix">Online Documentation</a>
     */
    fun computeIcrfToCentralBodyFixedMatrix(
        date: JulianDate,
        result: Matrix3? = definedExternally,
    ): Matrix3?

    /**
     * Computes a rotation matrix to transform a point or vector from True Equator Mean Equinox (TEME) axes to the
     * pseudo-fixed axes at a given time.  This method treats the UT1 time standard as equivalent to UTC.
     * ```
     * //Set the view to the inertial frame.
     * scene.postUpdate.addEventListener(function(scene, time) {
     *    const now = JulianDate.now();
     *    const offset = Matrix4.multiplyByPoint(camera.transform, camera.position, new Cartesian3());
     *    const transform = Matrix4.fromRotationTranslation(CelestialFrameTransforms.computeTemeToPseudoFixedMatrix(now));
     *    const inverseTransform = Matrix4.inverseTransformation(transform, new Matrix4());
     *    Matrix4.multiplyByPoint(inverseTransform, offset, offset);
     *    camera.lookAtTransform(transform, offset);
     * });
     * ```
     * @param [date] The time at which to compute the rotation matrix.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix3 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.computeTemeToPseudoFixedMatrix">Online Documentation</a>
     */
    fun computeTemeToPseudoFixedMatrix(
        date: JulianDate,
        result: Matrix3? = definedExternally,
    ): Matrix3

    /**
     * Preloads the data necessary to transform between the ICRF and Fixed axes, in either
     * direction, over a given interval.  This function returns a promise that, when resolved,
     * indicates that the preload has completed.
     * ```
     * const interval = new TimeInterval(...);
     * await CelestialFrameTransforms.preloadIcrfFixed(interval));
     * // the data is now loaded
     * ```
     * @param [timeInterval] The interval to preload.
     * @return A promise that, when resolved, indicates that the preload has completed
     *   and evaluation of the transformation between the fixed and ICRF axes will
     *   no longer return undefined for a time inside the interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.preloadIcrfFixed">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun preloadIcrfFixed(timeInterval: TimeInterval)

    @JsName("preloadIcrfFixed")
    fun preloadIcrfFixedAsync(timeInterval: TimeInterval): Promise<Void>

    /**
     * Computes a rotation matrix to transform a point or vector from the International Celestial
     * Reference Frame (GCRF/ICRF) inertial frame axes to the Earth-Fixed frame axes (ITRF)
     * at a given time.  This function may return undefined if the data necessary to
     * do the transformation is not yet loaded.
     * ```
     * scene.postUpdate.addEventListener(function(scene, time) {
     *   // View in ICRF.
     *   const icrfToFixed = CelestialFrameTransforms.computeIcrfToFixedMatrix(time);
     *   if (defined(icrfToFixed)) {
     *     const offset = Cartesian3.clone(camera.position);
     *     const transform = Matrix4.fromRotationTranslation(icrfToFixed);
     *     camera.lookAtTransform(transform, offset);
     *   }
     * });
     * ```
     * @param [date] The time at which to compute the rotation matrix.
     * @param [result] The object onto which to store the result.  If this parameter is
     *   not specified, a new instance is created and returned.
     * @return The rotation matrix, or undefined if the data necessary to do the
     *   transformation is not yet loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.computeIcrfToFixedMatrix">Online Documentation</a>
     */
    fun computeIcrfToFixedMatrix(
        date: JulianDate,
        result: Matrix3? = definedExternally,
    ): Matrix3?

    /**
     * Computes a rotation matrix to transform a point or vector from the Moon-Fixed frame axes
     * to the International Celestial Reference Frame (GCRF/ICRF) inertial frame axes
     * at a given time.
     * ```
     * // Transform a point from the Fixed axes to the ICRF axes.
     * const now = JulianDate.now();
     * const pointInFixed = Cartesian3.fromDegrees(0.0, 0.0);
     * const fixedToIcrf = CelestialFrameTransforms.computeMoonFixedToIcrfMatrix(now);
     * let pointInInertial = new Cartesian3();
     * if (defined(fixedToIcrf)) {
     *     pointInInertial = Matrix3.multiplyByVector(fixedToIcrf, pointInFixed, pointInInertial);
     * }
     * ```
     * @param [date] The time at which to compute the rotation matrix.
     * @param [result] The object onto which to store the result.  If this parameter is
     *   not specified, a new instance is created and returned.
     * @return The rotation matrix.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.computeMoonFixedToIcrfMatrix">Online Documentation</a>
     */
    fun computeMoonFixedToIcrfMatrix(
        date: JulianDate,
        result: Matrix3? = definedExternally,
    ): Matrix3

    /**
     * Computes a rotation matrix to transform a point or vector from the International Celestial
     * Reference Frame (GCRF/ICRF) inertial frame axes to the Moon-Fixed frame axes
     * at a given time.
     * ```
     * // Set the default ICRF to fixed transformation to that of the Moon.
     * CelestialFrameTransforms.computeIcrfToCentralBodyFixedMatrix = CelestialFrameTransforms.computeIcrfToMoonFixedMatrix;
     * ```
     * @param [date] The time at which to compute the rotation matrix.
     * @param [result] The object onto which to store the result.  If this parameter is
     *   not specified, a new instance is created and returned.
     * @return The rotation matrix.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.computeIcrfToMoonFixedMatrix">Online Documentation</a>
     */
    fun computeIcrfToMoonFixedMatrix(
        date: JulianDate,
        result: Matrix3? = definedExternally,
    ): Matrix3

    /**
     * Computes a rotation matrix to transform a point or vector from the Earth-Fixed frame axes (ITRF)
     * to the International Celestial Reference Frame (GCRF/ICRF) inertial frame axes
     * at a given time.  This function may return undefined if the data necessary to
     * do the transformation is not yet loaded.
     * ```
     * // Transform a point from the Fixed axes to the ICRF axes.
     * const now = JulianDate.now();
     * const pointInFixed = Cartesian3.fromDegrees(0.0, 0.0);
     * const fixedToIcrf = CelestialFrameTransforms.computeFixedToIcrfMatrix(now);
     * let pointInInertial = new Cartesian3();
     * if (defined(fixedToIcrf)) {
     *     pointInInertial = Matrix3.multiplyByVector(fixedToIcrf, pointInFixed, pointInInertial);
     * }
     * ```
     * @param [date] The time at which to compute the rotation matrix.
     * @param [result] The object onto which to store the result.  If this parameter is
     *   not specified, a new instance is created and returned.
     * @return The rotation matrix, or undefined if the data necessary to do the
     *   transformation is not yet loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.computeFixedToIcrfMatrix">Online Documentation</a>
     */
    fun computeFixedToIcrfMatrix(
        date: JulianDate,
        result: Matrix3? = definedExternally,
    ): Matrix3?
}
