// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A description of the outline of a frustum with the given the origin and orientation.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumOutlineGeometry.html">Online Documentation</a>
 */
external class FrustumOutlineGeometry(options: ConstructorOptions) {
    /**
     * @property [frustum] The frustum.
     * @property [origin] The origin of the frustum.
     * @property [orientation] The orientation of the frustum.
     */
    interface ConstructorOptions {
        var frustum: dynamic
        var origin: Cartesian3
        var orientation: Quaternion
    }

    /**
     * The number of elements used to pack the object into an array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumOutlineGeometry.html#packedLength">Online Documentation</a>
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumOutlineGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: FrustumOutlineGeometry,
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: FrustumOutlineGeometry? = definedExternally,
        )

        /**
         * Computes the geometric representation of a frustum outline, including its vertices, indices, and a bounding sphere.
         * @param [frustumGeometry] A description of the frustum.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FrustumOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(frustumGeometry: FrustumOutlineGeometry): Geometry?
    }
}

inline fun FrustumOutlineGeometry(
    block: FrustumOutlineGeometry.ConstructorOptions.() -> Unit,
): FrustumOutlineGeometry =
    FrustumOutlineGeometry(options = jso(block))
