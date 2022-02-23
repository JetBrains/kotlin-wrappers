// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Represents a scalar value's lower and upper bound at a near distance and far distance in eye space.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NearFarScalar.html">Online Documentation</a>
 *
 * @constructor
 * @property [near] The lower bound of the camera range.
 *   Default value - `0.0`
 * @property [nearValue] The value at the lower bound of the camera range.
 *   Default value - `0.0`
 * @property [far] The upper bound of the camera range.
 *   Default value - `1.0`
 * @property [farValue] The value at the upper bound of the camera range.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NearFarScalar.html">Online Documentation</a>
 */
external class NearFarScalar(
    var near: Double = definedExternally,
    var nearValue: Double = definedExternally,
    var far: Double = definedExternally,
    var farValue: Double = definedExternally,
) {
    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new NearFarScalar instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NearFarScalar.html#clone">Online Documentation</a>
     */
    fun clone(result: NearFarScalar? = definedExternally): NearFarScalar

    companion object : Packable<NearFarScalar> {
        /**
         * Duplicates a NearFarScalar instance.
         * @param [nearFarScalar] The NearFarScalar to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new NearFarScalar instance if one was not provided. (Returns undefined if nearFarScalar is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NearFarScalar.html#.clone">Online Documentation</a>
         */
        fun clone(
            nearFarScalar: NearFarScalar,
            result: NearFarScalar? = definedExternally,
        ): NearFarScalar

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NearFarScalar.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NearFarScalar.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: NearFarScalar,
            array: Array<out Double>,
            startingIndex: Int?,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new NearFarScalar instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NearFarScalar.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: Array<out Double>,
            startingIndex: Int?,
            result: NearFarScalar?,
        ): NearFarScalar

        /**
         * Compares the provided NearFarScalar and returns `true` if they are equal,
         * `false` otherwise.
         * @param [left] The first NearFarScalar.
         * @param [right] The second NearFarScalar.
         * @return `true` if left and right are equal; otherwise `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NearFarScalar.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: NearFarScalar? = definedExternally,
            right: NearFarScalar? = definedExternally,
        ): Boolean
    }
}
