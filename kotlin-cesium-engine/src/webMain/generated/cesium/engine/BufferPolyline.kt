// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * View bound to the underlying buffer data of a [BufferPolylineCollection].
 *
 * BufferPolyline instances are [flyweights](https://en.wikipedia.org/wiki/Flyweight_pattern):
 * a single BufferPolyline instance can be temporarily bound to any conceptual
 * "polyline" in a BufferPolylineCollection, allowing very large collections to be
 * iterated and updated with a minimal memory footprint.
 *
 * Represented as two (2) or more positions.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolyline.html">Online Documentation</a>
 */
open external class BufferPolyline :
    BufferPrimitive {
    /**
     * Count of positions (vertices) in this polyline, number of VEC3 elements.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolyline.html#vertexCount">Online Documentation</a>
     */
    val vertexCount: Double

    /**
     * Returns an array view of this polyline's vertex positions. If 'result'
     * argument is given, vertex positions are written to that array and returned.
     * Otherwise, returns an ArrayView on collection memory — changes to this array
     * will not trigger render updates, which requires `.setPositions()`.
     * @param [result] return {TypedArray}
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolyline.html#getPositions">Online Documentation</a>
     */
    fun getPositions(
        result: JsAny /* TypedArray): void;
    setPositions(positions: TypedArray */? = definedExternally,
    )

    /**
     * Returns a JSON-serializable object representing the polyline. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * @return JSON-serializable object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolyline.html#toJSON">Online Documentation</a>
     */
    override fun toJSON(): JsAny

    companion object {
        /**
         * Copies data from source polyline to result. If the result polyline is not
         * new (the last polyline in the collection) then source and result polylines
         * must have the same vertex counts.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolyline.html#.clone">Online Documentation</a>
         */
        fun clone(
            polyline: BufferPolyline,
            result: BufferPolyline,
        ): BufferPolyline
    }
}
