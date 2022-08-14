// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A vertex format defines what attributes make up a vertex.  A VertexFormat can be provided
 * to a [Geometry] to request that certain properties be computed, e.g., just position,
 * position and normal, etc.
 * ```
 * // Create a vertex format with position and 2D texture coordinate attributes.
 * const format = new VertexFormat({
 *   position : true,
 *   st : true
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object with boolean properties corresponding to VertexFormat properties as shown in the code example.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html">Online Documentation</a>
 */
external class VertexFormat(options: Any? = definedExternally) {
    /**
     * When `true`, the vertex has a 3D position attribute.
     *
     * 64-bit floating-point (for precision).  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#position">Online Documentation</a>
     */
    var position: Boolean

    /**
     * When `true`, the vertex has a normal attribute (normalized), which is commonly used for lighting.
     *
     * 32-bit floating-point.  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#normal">Online Documentation</a>
     */
    var normal: Boolean

    /**
     * When `true`, the vertex has a 2D texture coordinate attribute.
     *
     * 32-bit floating-point.  2 components per attribute
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#st">Online Documentation</a>
     */
    var st: Boolean

    /**
     * When `true`, the vertex has a bitangent attribute (normalized), which is used for tangent-space effects like bump mapping.
     *
     * 32-bit floating-point.  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#bitangent">Online Documentation</a>
     */
    var bitangent: Boolean

    /**
     * When `true`, the vertex has a tangent attribute (normalized), which is used for tangent-space effects like bump mapping.
     *
     * 32-bit floating-point.  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#tangent">Online Documentation</a>
     */
    var tangent: Boolean

    /**
     * When `true`, the vertex has an RGB color attribute.
     *
     * 8-bit unsigned byte.  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#color">Online Documentation</a>
     */
    var color: Boolean

    companion object : Packable<VertexFormat> {
        /**
         * An immutable vertex format with only a position attribute.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.POSITION_ONLY">Online Documentation</a>
         */
        val POSITION_ONLY: VertexFormat

        /**
         * An immutable vertex format with position and normal attributes.
         * This is compatible with per-instance color appearances like [PerInstanceColorAppearance].
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.POSITION_AND_NORMAL">Online Documentation</a>
         */
        val POSITION_AND_NORMAL: VertexFormat

        /**
         * An immutable vertex format with position, normal, and st attributes.
         * This is compatible with [MaterialAppearance] when [MaterialAppearance.materialSupport]
         * is <code>TEXTURED/code>.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.POSITION_NORMAL_AND_ST">Online Documentation</a>
         */
        val POSITION_NORMAL_AND_ST: VertexFormat

        /**
         * An immutable vertex format with position and st attributes.
         * This is compatible with [EllipsoidSurfaceAppearance].
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.POSITION_AND_ST">Online Documentation</a>
         */
        val POSITION_AND_ST: VertexFormat

        /**
         * An immutable vertex format with position and color attributes.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.POSITION_AND_COLOR">Online Documentation</a>
         */
        val POSITION_AND_COLOR: VertexFormat

        /**
         * An immutable vertex format with well-known attributes: position, normal, st, tangent, and bitangent.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.ALL">Online Documentation</a>
         */
        val ALL: VertexFormat

        /**
         * An immutable vertex format with position, normal, and st attributes.
         * This is compatible with most appearances and materials; however
         * normal and st attributes are not always required.  When this is
         * known in advance, another `VertexFormat` should be used.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.DEFAULT">Online Documentation</a>
         */
        val DEFAULT: VertexFormat

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: VertexFormat,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new VertexFormat instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: VertexFormat?,
        ): VertexFormat

        /**
         * Duplicates a VertexFormat instance.
         * @param [vertexFormat] The vertex format to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new VertexFormat instance if one was not provided. (Returns undefined if vertexFormat is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VertexFormat.html#.clone">Online Documentation</a>
         */
        fun clone(
            vertexFormat: VertexFormat,
            result: VertexFormat? = definedExternally,
        ): VertexFormat
    }
}
