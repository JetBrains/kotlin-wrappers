// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray

/**
 * Describes geometry representing the outline of a plane centered at the origin, with a unit width and length.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneOutlineGeometry.html">Online Documentation</a>
 */
external class PlaneOutlineGeometry {


    companion object {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneOutlineGeometry.html#.packedLength">Online Documentation</a>
         */
        val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneOutlineGeometry.html#.pack">Online Documentation</a>
         */
        fun pack(
            value: PlaneOutlineGeometry,
            array: ReadonlyArray<Double>,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new PlaneOutlineGeometry instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneOutlineGeometry.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: PlaneOutlineGeometry? = definedExternally,
        ): PlaneOutlineGeometry

        /**
         * Computes the geometric representation of an outline of a plane, including its vertices, indices, and a bounding sphere.
         * @return The computed vertices and indices.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PlaneOutlineGeometry.html#.createGeometry">Online Documentation</a>
         */
        fun createGeometry(): Geometry?
    }
}
