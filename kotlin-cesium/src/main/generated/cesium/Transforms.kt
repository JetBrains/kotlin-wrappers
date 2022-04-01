// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Contains functions for transforming positions to various reference frames.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html">Online Documentation</a>
 */
external object Transforms {
    /**
     * Generates a function that computes a 4x4 transformation matrix from a reference frame
     * centered at the provided origin to the provided ellipsoid's fixed reference frame.
     * @param [firstAxis] name of the first axis of the local reference frame. Must be
     *   'east', 'north', 'up', 'west', 'south' or 'down'.
     * @param [secondAxis] name of the second axis of the local reference frame. Must be
     *   'east', 'north', 'up', 'west', 'south' or 'down'.
     * @return The function that will computes a
     *   4x4 transformation matrix from a reference frame, with first axis and second axis compliant with the parameters,
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.localFrameToFixedFrameGenerator">Online Documentation</a>
     */
    fun localFrameToFixedFrameGenerator(
        firstAxis: String,
        secondAxis: String,
    ): LocalFrameToFixedFrame

    /**
     * Computes a 4x4 transformation matrix from a reference frame with an east-north-up axes
     * centered at the provided origin to the provided ellipsoid's fixed reference frame.
     * The local axes are defined as:
     * - The `x` axis points in the local east direction.
     * - The `y` axis points in the local north direction.
     * - The `z` axis points in the direction of the ellipsoid surface normal which passes through the position.
     * ```
     * // Get the transform from local east-north-up at cartographic (0.0, 0.0) to Earth's fixed frame.
     * const center = Cartesian3.fromDegrees(0.0, 0.0);
     * const transform = Transforms.eastNorthUpToFixedFrame(center);
     * ```
     * @param [origin] The center point of the local reference frame.
     * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
     *   Default value - [Ellipsoid.WGS84]
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix4 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.eastNorthUpToFixedFrame">Online Documentation</a>
     */
    fun eastNorthUpToFixedFrame(
        origin: Cartesian3,
        ellipsoid: Ellipsoid? = definedExternally,
        result: Matrix4? = definedExternally,
    ): Matrix4

    /**
     * Computes a 4x4 transformation matrix from a reference frame with an north-east-down axes
     * centered at the provided origin to the provided ellipsoid's fixed reference frame.
     * The local axes are defined as:
     * - The `x` axis points in the local north direction.
     * - The `y` axis points in the local east direction.
     * - The `z` axis points in the opposite direction of the ellipsoid surface normal which passes through the position.
     * ```
     * // Get the transform from local north-east-down at cartographic (0.0, 0.0) to Earth's fixed frame.
     * const center = Cartesian3.fromDegrees(0.0, 0.0);
     * const transform = Transforms.northEastDownToFixedFrame(center);
     * ```
     * @param [origin] The center point of the local reference frame.
     * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
     *   Default value - [Ellipsoid.WGS84]
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix4 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.northEastDownToFixedFrame">Online Documentation</a>
     */
    fun northEastDownToFixedFrame(
        origin: Cartesian3,
        ellipsoid: Ellipsoid? = definedExternally,
        result: Matrix4? = definedExternally,
    ): Matrix4

    /**
     * Computes a 4x4 transformation matrix from a reference frame with an north-up-east axes
     * centered at the provided origin to the provided ellipsoid's fixed reference frame.
     * The local axes are defined as:
     * - The `x` axis points in the local north direction.
     * - The `y` axis points in the direction of the ellipsoid surface normal which passes through the position.
     * - The `z` axis points in the local east direction.
     * ```
     * // Get the transform from local north-up-east at cartographic (0.0, 0.0) to Earth's fixed frame.
     * const center = Cartesian3.fromDegrees(0.0, 0.0);
     * const transform = Transforms.northUpEastToFixedFrame(center);
     * ```
     * @param [origin] The center point of the local reference frame.
     * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
     *   Default value - [Ellipsoid.WGS84]
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix4 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.northUpEastToFixedFrame">Online Documentation</a>
     */
    fun northUpEastToFixedFrame(
        origin: Cartesian3,
        ellipsoid: Ellipsoid? = definedExternally,
        result: Matrix4? = definedExternally,
    ): Matrix4

    /**
     * Computes a 4x4 transformation matrix from a reference frame with an north-west-up axes
     * centered at the provided origin to the provided ellipsoid's fixed reference frame.
     * The local axes are defined as:
     * - The `x` axis points in the local north direction.
     * - The `y` axis points in the local west direction.
     * - The `z` axis points in the direction of the ellipsoid surface normal which passes through the position.
     * ```
     * // Get the transform from local north-West-Up at cartographic (0.0, 0.0) to Earth's fixed frame.
     * const center = Cartesian3.fromDegrees(0.0, 0.0);
     * const transform = Transforms.northWestUpToFixedFrame(center);
     * ```
     * @param [origin] The center point of the local reference frame.
     * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
     *   Default value - [Ellipsoid.WGS84]
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix4 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.northWestUpToFixedFrame">Online Documentation</a>
     */
    fun northWestUpToFixedFrame(
        origin: Cartesian3,
        ellipsoid: Ellipsoid? = definedExternally,
        result: Matrix4? = definedExternally,
    ): Matrix4

    /**
     * Computes a 4x4 transformation matrix from a reference frame with axes computed from the heading-pitch-roll angles
     * centered at the provided origin to the provided ellipsoid's fixed reference frame. Heading is the rotation from the local north
     * direction where a positive angle is increasing eastward. Pitch is the rotation from the local east-north plane. Positive pitch angles
     * are above the plane. Negative pitch angles are below the plane. Roll is the first rotation applied about the local east axis.
     * ```
     * // Get the transform from local heading-pitch-roll at cartographic (0.0, 0.0) to Earth's fixed frame.
     * const center = Cartesian3.fromDegrees(0.0, 0.0);
     * const heading = -Cesium.Math.PI_OVER_TWO;
     * const pitch = Math.PI_OVER_FOUR;
     * const roll = 0.0;
     * const hpr = new HeadingPitchRoll(heading, pitch, roll);
     * const transform = Transforms.headingPitchRollToFixedFrame(center, hpr);
     * ```
     * @param [origin] The center point of the local reference frame.
     * @param [headingPitchRoll] The heading, pitch, and roll.
     * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
     *   Default value - [Ellipsoid.WGS84]
     * @param [fixedFrameTransform] A 4x4 transformation
     *   matrix from a reference frame to the provided ellipsoid's fixed reference frame
     *   Default value - [Transforms.eastNorthUpToFixedFrame]
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix4 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.headingPitchRollToFixedFrame">Online Documentation</a>
     */
    fun headingPitchRollToFixedFrame(
        origin: Cartesian3,
        headingPitchRoll: HeadingPitchRoll,
        ellipsoid: Ellipsoid? = definedExternally,
        fixedFrameTransform: LocalFrameToFixedFrame? = definedExternally,
        result: Matrix4? = definedExternally,
    ): Matrix4

    /**
     * Computes a quaternion from a reference frame with axes computed from the heading-pitch-roll angles
     * centered at the provided origin. Heading is the rotation from the local north
     * direction where a positive angle is increasing eastward. Pitch is the rotation from the local east-north plane. Positive pitch angles
     * are above the plane. Negative pitch angles are below the plane. Roll is the first rotation applied about the local east axis.
     * ```
     * // Get the quaternion from local heading-pitch-roll at cartographic (0.0, 0.0) to Earth's fixed frame.
     * const center = Cartesian3.fromDegrees(0.0, 0.0);
     * const heading = -Cesium.Math.PI_OVER_TWO;
     * const pitch = Math.PI_OVER_FOUR;
     * const roll = 0.0;
     * const hpr = new HeadingPitchRoll(heading, pitch, roll);
     * const quaternion = Transforms.headingPitchRollQuaternion(center, hpr);
     * ```
     * @param [origin] The center point of the local reference frame.
     * @param [headingPitchRoll] The heading, pitch, and roll.
     * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
     *   Default value - [Ellipsoid.WGS84]
     * @param [fixedFrameTransform] A 4x4 transformation
     *   matrix from a reference frame to the provided ellipsoid's fixed reference frame
     *   Default value - [Transforms.eastNorthUpToFixedFrame]
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Quaternion instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.headingPitchRollQuaternion">Online Documentation</a>
     */
    fun headingPitchRollQuaternion(
        origin: Cartesian3,
        headingPitchRoll: HeadingPitchRoll,
        ellipsoid: Ellipsoid? = definedExternally,
        fixedFrameTransform: LocalFrameToFixedFrame? = definedExternally,
        result: Quaternion? = definedExternally,
    ): Quaternion

    /**
     * Computes heading-pitch-roll angles from a transform in a particular reference frame. Heading is the rotation from the local north
     * direction where a positive angle is increasing eastward. Pitch is the rotation from the local east-north plane. Positive pitch angles
     * are above the plane. Negative pitch angles are below the plane. Roll is the first rotation applied about the local east axis.
     * @param [transform] The transform
     * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
     *   Default value - [Ellipsoid.WGS84]
     * @param [fixedFrameTransform] A 4x4 transformation
     *   matrix from a reference frame to the provided ellipsoid's fixed reference frame
     *   Default value - [Transforms.eastNorthUpToFixedFrame]
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new HeadingPitchRoll instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.fixedFrameToHeadingPitchRoll">Online Documentation</a>
     */
    fun fixedFrameToHeadingPitchRoll(
        transform: Matrix4,
        ellipsoid: Ellipsoid? = definedExternally,
        fixedFrameTransform: LocalFrameToFixedFrame? = definedExternally,
        result: HeadingPitchRoll? = definedExternally,
    ): HeadingPitchRoll

    /**
     * Computes a rotation matrix to transform a point or vector from True Equator Mean Equinox (TEME) axes to the
     * pseudo-fixed axes at a given time.  This method treats the UT1 time standard as equivalent to UTC.
     * ```
     * //Set the view to the inertial frame.
     * scene.postUpdate.addEventListener(function(scene, time) {
     *    const now = JulianDate.now();
     *    const offset = Matrix4.multiplyByPoint(camera.transform, camera.position, new Cartesian3());
     *    const transform = Matrix4.fromRotationTranslation(Transforms.computeTemeToPseudoFixedMatrix(now));
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
     * Promise.resolve(Transforms.preloadIcrfFixed(interval)).then(function() {
     *     // the data is now loaded
     * });
     * ```
     * @param [timeInterval] The interval to preload.
     * @return A promise that, when resolved, indicates that the preload has completed
     *   and evaluation of the transformation between the fixed and ICRF axes will
     *   no longer return undefined for a time inside the interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.preloadIcrfFixed">Online Documentation</a>
     */
    fun preloadIcrfFixed(timeInterval: TimeInterval): kotlin.js.Promise<Unit>

    /**
     * Computes a rotation matrix to transform a point or vector from the International Celestial
     * Reference Frame (GCRF/ICRF) inertial frame axes to the Earth-Fixed frame axes (ITRF)
     * at a given time.  This function may return undefined if the data necessary to
     * do the transformation is not yet loaded.
     * ```
     * scene.postUpdate.addEventListener(function(scene, time) {
     *   // View in ICRF.
     *   const icrfToFixed = Transforms.computeIcrfToFixedMatrix(time);
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
    ): Matrix3

    /**
     * Computes a rotation matrix to transform a point or vector from the Earth-Fixed frame axes (ITRF)
     * to the International Celestial Reference Frame (GCRF/ICRF) inertial frame axes
     * at a given time.  This function may return undefined if the data necessary to
     * do the transformation is not yet loaded.
     * ```
     * // Transform a point from the ICRF axes to the Fixed axes.
     * const now = JulianDate.now();
     * const pointInFixed = Cartesian3.fromDegrees(0.0, 0.0);
     * const fixedToIcrf = Transforms.computeIcrfToFixedMatrix(now);
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
    ): Matrix3

    /**
     * Transform a point from model coordinates to window coordinates.
     * @param [modelViewProjectionMatrix] The 4x4 model-view-projection matrix.
     * @param [viewportTransformation] The 4x4 viewport transformation.
     * @param [point] The point to transform.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian2 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.pointToWindowCoordinates">Online Documentation</a>
     */
    fun pointToWindowCoordinates(
        modelViewProjectionMatrix: Matrix4,
        viewportTransformation: Matrix4,
        point: Cartesian3,
        result: Cartesian2? = definedExternally,
    ): Cartesian2

    /**
     * Transform a position and velocity to a rotation matrix.
     * @param [position] The position to transform.
     * @param [velocity] The velocity vector to transform.
     * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
     *   Default value - [Ellipsoid.WGS84]
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix3 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.rotationMatrixFromPositionVelocity">Online Documentation</a>
     */
    fun rotationMatrixFromPositionVelocity(
        position: Cartesian3,
        velocity: Cartesian3,
        ellipsoid: Ellipsoid? = definedExternally,
        result: Matrix3? = definedExternally,
    ): Matrix3
}

/**
 * Computes a 4x4 transformation matrix from a reference frame
 * centered at the provided origin to the provided ellipsoid's fixed reference frame.
 * @param [origin] The center point of the local reference frame.
 * @param [ellipsoid] The ellipsoid whose fixed frame is used in the transformation.
 *   Default value - [Ellipsoid.WGS84]
 * @param [result] The object onto which to store the result.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Transforms.html#.LocalFrameToFixedFrame">Online Documentation</a>
 */
typealias LocalFrameToFixedFrame = (origin: Cartesian3, ellipsoid: Ellipsoid?, result: Matrix4?) -> Matrix4
