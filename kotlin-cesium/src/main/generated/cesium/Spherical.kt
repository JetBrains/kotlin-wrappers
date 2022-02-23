// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A set of curvilinear 3-dimensional coordinates.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html">Online Documentation</a>
 *
 * @constructor
 * @property [clock] The angular coordinate lying in the xy-plane measured from the positive x-axis and toward the positive y-axis.
 *   Default value - `0.0`
 * @property [cone] The angular coordinate measured from the positive z-axis and toward the negative z-axis.
 *   Default value - `0.0`
 * @property [magnitude] The linear coordinate measured from the origin.
 *   Default value - `1.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html">Online Documentation</a>
 */
external class Spherical(
    var clock: Double = definedExternally,
    var cone: Double = definedExternally,
    var magnitude: Double = definedExternally,
) {
    /**
     * Creates a duplicate of this Spherical.
     * @param [result] The object to store the result into, if undefined a new instance will be created.
     * @return The modified result parameter or a new instance if result was undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html#clone">Online Documentation</a>
     */
    fun clone(result: Spherical? = definedExternally): Spherical

    /**
     * Returns true if this spherical is within the provided epsilon of the provided spherical, false otherwise.
     * @param [other] The Spherical to be compared.
     * @param [epsilon] The epsilon to compare against.
     * @return true if this spherical is within the provided epsilon of the provided spherical, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        other: Spherical,
        epsilon: Double,
    ): Boolean

    companion object {
        /**
         * Converts the provided Cartesian3 into Spherical coordinates.
         * @param [cartesian3] The Cartesian3 to be converted to Spherical.
         * @param [result] The object in which the result will be stored, if undefined a new instance will be created.
         * @return The modified result parameter, or a new instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html#.fromCartesian3">Online Documentation</a>
         */
        fun fromCartesian3(
            cartesian3: Cartesian3,
            result: Spherical? = definedExternally,
        ): Spherical

        /**
         * Creates a duplicate of a Spherical.
         * @param [spherical] The spherical to clone.
         * @param [result] The object to store the result into, if undefined a new instance will be created.
         * @return The modified result parameter or a new instance if result was undefined. (Returns undefined if spherical is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html#.clone">Online Documentation</a>
         */
        fun clone(
            spherical: Spherical,
            result: Spherical? = definedExternally,
        ): Spherical

        /**
         * Computes the normalized version of the provided spherical.
         * @param [spherical] The spherical to be normalized.
         * @param [result] The object to store the result into, if undefined a new instance will be created.
         * @return The modified result parameter or a new instance if result was undefined.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html#.normalize">Online Documentation</a>
         */
        fun normalize(
            spherical: Spherical,
            result: Spherical? = definedExternally,
        ): Spherical

        /**
         * Returns true if the first spherical is equal to the second spherical, false otherwise.
         * @param [left] The first Spherical to be compared.
         * @param [right] The second Spherical to be compared.
         * @return true if the first spherical is equal to the second spherical, false otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Spherical,
            right: Spherical,
        ): Boolean

        /**
         * Returns true if the first spherical is within the provided epsilon of the second spherical, false otherwise.
         * @param [left] The first Spherical to be compared.
         * @param [right] The second Spherical to be compared.
         * @param [epsilon] The epsilon to compare against.
         *   Default value - `0.0`
         * @return true if the first spherical is within the provided epsilon of the second spherical, false otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spherical.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Spherical,
            right: Spherical,
            epsilon: Double? = definedExternally,
        ): Boolean
    }
}
