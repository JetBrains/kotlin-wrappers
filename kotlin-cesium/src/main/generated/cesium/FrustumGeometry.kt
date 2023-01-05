// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * Describes a frustum at the given the origin and orientation.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumGeometry.html">Online Documentation</a>
 */
external class FrustumGeometry(options: ConstructorOptions) {
    /**
     * @property [frustum] The frustum.
     * @property [origin] The origin of the frustum.
     * @property [orientation] The orientation of the frustum.
     * @property [vertexFormat] The vertex attributes to be computed.
     *   Default value - [VertexFormat.DEFAULT]
     */
    interface ConstructorOptions {
        var frustum: dynamic
        var origin: Cartesian3
        var orientation: Quaternion
        var vertexFormat: VertexFormat?
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumGeometry.html#packedLength">Online Documentation</a>
     */
    val packedLength: Int

    companion object {
        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: FrustumGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: FrustumGeometry? = definedExternally,
        )

        /**
         * Computes the geometric representation of a frustum, including its vertices, indices, and a bounding sphere.
         * @param [frustumGeometry] A description of the frustum.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(frustumGeometry: FrustumGeometry): Geometry?
    }
}

inline fun FrustumGeometry(
    block: FrustumGeometry.ConstructorOptions.() -> Unit,
): FrustumGeometry =
    FrustumGeometry(options = jso(block))
