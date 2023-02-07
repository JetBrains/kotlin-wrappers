// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A rotation expressed as a heading, pitch, and roll. Heading is the rotation about the
 * negative z axis. Pitch is the rotation about the negative y axis. Roll is the rotation about
 * the positive x axis.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html">Online Documentation</a>
 *
 * @constructor
 * @property [heading] The heading component in radians.
 *   Default value - `0.0`
 * @property [pitch] The pitch component in radians.
 *   Default value - `0.0`
 * @property [roll] The roll component in radians.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html">Online Documentation</a>
 */
external class HeadingPitchRoll(
    var heading: Double = definedExternally,
    var pitch: Double = definedExternally,
    var roll: Double = definedExternally,
) {
    /**
     * Duplicates this HeadingPitchRoll instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new HeadingPitchRoll instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html#clone">Online Documentation</a>
     */
    fun clone(result: HeadingPitchRoll? = definedExternally): HeadingPitchRoll

    /**
     * Compares this HeadingPitchRoll against the provided HeadingPitchRoll componentwise and returns
     * `true` if they pass an absolute or relative tolerance test,
     * `false` otherwise.
     * @param [right] The right hand side HeadingPitchRoll.
     * @param [relativeEpsilon] The relative epsilon tolerance to use for equality testing.
     *   Default value - `0`
     * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
     *   Default value - [relativeEpsilon]
     * @return `true` if they are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: HeadingPitchRoll? = definedExternally,
        relativeEpsilon: Double? = definedExternally,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean

    companion object {
        /**
         * Computes the heading, pitch and roll from a quaternion (see http://en.wikipedia.org/wiki/Conversion_between_quaternions_and_Euler_angles )
         * @param [quaternion] The quaternion from which to retrieve heading, pitch, and roll, all expressed in radians.
         * @param [result] The object in which to store the result. If not provided, a new instance is created and returned.
         * @return The modified result parameter or a new HeadingPitchRoll instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html#.fromQuaternion">Online Documentation</a>
         */
        fun fromQuaternion(
            quaternion: Quaternion,
            result: HeadingPitchRoll? = definedExternally,
        ): HeadingPitchRoll

        /**
         * Returns a new HeadingPitchRoll instance from angles given in degrees.
         * @param [heading] the heading in degrees
         * @param [pitch] the pitch in degrees
         * @param [roll] the heading in degrees
         * @param [result] The object in which to store the result. If not provided, a new instance is created and returned.
         * @return A new HeadingPitchRoll instance
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html#.fromDegrees">Online Documentation</a>
         */
        fun fromDegrees(
            heading: Double,
            pitch: Double,
            roll: Double,
            result: HeadingPitchRoll? = definedExternally,
        ): HeadingPitchRoll

        /**
         * Duplicates a HeadingPitchRoll instance.
         * @param [headingPitchRoll] The HeadingPitchRoll to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new HeadingPitchRoll instance if one was not provided. (Returns undefined if headingPitchRoll is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html#.clone">Online Documentation</a>
         */
        fun clone(
            headingPitchRoll: HeadingPitchRoll,
            result: HeadingPitchRoll? = definedExternally,
        ): HeadingPitchRoll

        /**
         * Compares the provided HeadingPitchRolls componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first HeadingPitchRoll.
         * @param [right] The second HeadingPitchRoll.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: HeadingPitchRoll? = definedExternally,
            right: HeadingPitchRoll? = definedExternally,
        ): Boolean

        /**
         * Compares the provided HeadingPitchRolls componentwise and returns
         * `true` if they pass an absolute or relative tolerance test,
         * `false` otherwise.
         * @param [left] The first HeadingPitchRoll.
         * @param [right] The second HeadingPitchRoll.
         * @param [relativeEpsilon] The relative epsilon tolerance to use for equality testing.
         *   Default value - `0`
         * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
         *   Default value - [relativeEpsilon]
         * @return `true` if left and right are within the provided epsilon, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRoll.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: HeadingPitchRoll? = definedExternally,
            right: HeadingPitchRoll? = definedExternally,
            relativeEpsilon: Double? = definedExternally,
            absoluteEpsilon: Double? = definedExternally,
        ): Boolean
    }
}
