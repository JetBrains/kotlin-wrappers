// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * View bound to the underlying buffer data of a [BufferPointCollection].
 *
 * BufferPoint instances are [flyweights](https://en.wikipedia.org/wiki/Flyweight_pattern):
 * a single BufferPoint instance can be temporarily bound to any conceptual
 * "point" in a BufferPointCollection, allowing very large collections to be
 * iterated and updated with a minimal memory footprint.
 *
 * Represented as one (1) position.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPoint.html">Online Documentation</a>
 */
external class BufferPoint {
    /**
     * Count of positions (vertices) in this primitive. Always 1.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPoint.html#vertexCount">Online Documentation</a>
     */
    val vertexCount: Double

    /**
     * Gets the position of this point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPoint.html#getPosition">Online Documentation</a>
     */
    fun getPosition(result: Cartesian3? = definedExternally): Cartesian3

    /**
     * Sets the position of this point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPoint.html#setPosition">Online Documentation</a>
     */
    fun setPosition(position: Cartesian3)

    /**
     * Returns a JSON-serializable object representing the point. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * @return JSON-serializable object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPoint.html#toJSON">Online Documentation</a>
     */
    fun toJSON(): JsAny

    companion object {
        /**
         * Copies data from source point to result.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPoint.html#.clone">Online Documentation</a>
         */
        fun clone(
            point: BufferPoint,
            result: BufferPoint,
        ): BufferPoint
    }
}
