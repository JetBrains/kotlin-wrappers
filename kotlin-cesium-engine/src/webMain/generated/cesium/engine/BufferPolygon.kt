// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.typedarrays.TypedArray

/**
 * View bound to the underlying buffer data of a [BufferPolygonCollection].
 *
 * BufferPolygon instances are [flyweights](https://en.wikipedia.org/wiki/Flyweight_pattern):
 * a single BufferPolygon instance can be temporarily bound to any conceptual
 * "polygon" in a BufferPolygonCollection, allowing very large collections to be
 * iterated and updated with a minimal memory footprint.
 *
 * Represented as one (1) external linear ring of three (3) or more positions.
 * May optionally define one or more internal linear rings ("holes") within the
 * polygon. Each hole is represented as a single index into the positions array,
 * where the vertex at that index is the start of an internal linear ring that
 * continues along the following vertices until reaching either the vertex
 * index of the next hole, or the end of the vertex list. Stores a precomputed
 * triangulation, represented as three vertex indices per triangle.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html">Online Documentation</a>
 */
open external class BufferPolygon :
    BufferPrimitive {
    /**
     * Count of positions (vertices) in this polygon, including both outer ring and
     * internal rings (holes), number of VEC3 elements.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#vertexCount">Online Documentation</a>
     */
    val vertexCount: Double

    /**
     * Returns an array view of this polygon's vertex positions. If 'result'
     * argument is given, vertex positions are written to that array and returned.
     * Otherwise, returns an ArrayView on collection memory — changes to this array
     * will not trigger render updates, which requires `.setPositions()`.
     * @param [result] return {TypedArray}
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#getPositions">Online Documentation</a>
     */
    fun getPositions(result: TypedArray<*, *, *, *>? = definedExternally)

    fun setPositions(positions: TypedArray<*, *, *, *>)

    /**
     * Offset in collection position array to first vertex in polygon's outer
     * linear ring, number of VEC3 elements.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#outerVertexOffset">Online Documentation</a>
     */
    val outerVertexOffset: Double

    /**
     * Count of positions (vertices) in this polygon's outer linear ring, number
     * of VEC3 elements.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#outerVertexCount">Online Documentation</a>
     */
    val outerVertexCount: Double

    /**
     * Returns an array view of this polygon's outer linear ring vertex positions.
     * If 'result' argument is given, vertex positions are written to that array
     * and returned. Otherwise, returns an ArrayView on collection memory —
     * changes to this array will not trigger render updates, which requires
     * `.setPositions()`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#getOuterPositions">Online Documentation</a>
     */
    fun getOuterPositions(result: TypedArray<*, *, *, *>? = definedExternally): TypedArray<*, *, *, *>

    /**
     * Count of holes (indices) in this polygon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#holeCount">Online Documentation</a>
     */
    val holeCount: Double

    /**
     * Gets this polygon's hole indices, with each hole represented as a single
     * offset into this polygon's positions array. Each hole implicitly
     * continues along an internal linear ring from that vertex offset until
     * reaching either the end of the positions array, or the next hole offset.
     *
     * If 'result' argument is given, hole indices are written to that array and
     * returned. Otherwise, returns an ArrayView on collection memory — changes
     * to this array will not trigger render updates, which requires `.setHoles()`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#getHoles">Online Documentation</a>
     */
    fun getHoles(result: TypedArray<*, *, *, *>? = definedExternally): TypedArray<*, *, *, *>

    /**
     * Sets this polygon's hole indices, with holes represented as a single
     * offset into this polygon's positions array. Each hole implicitly
     * continues along an internal linear ring from that vertex offset until
     * reaching either the end of the positions array, or the next hole offset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#setHoles">Online Documentation</a>
     */
    fun setHoles(holes: TypedArray<*, *, *, *>)

    /**
     * Returns the number of (VEC3) vertices in the specified hole.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#getHoleVertexCount">Online Documentation</a>
     */
    fun getHoleVertexCount(holeIndex: Int): Double

    /**
     * Returns an array view of the inner linear ring vertex positions for the
     * specified hole. If 'result' argument is given, vertex positions are written
     * to that array and returned. Otherwise, returns an ArrayView on collection
     * memory — changes to this array will not trigger render updates, which
     * requires `.setPositions()`.
     * @param [result] return {TypedArray}
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#getHolePositions">Online Documentation</a>
     */
    fun getHolePositions(
        holeIndex: Int,
        result: TypedArray<*, *, *, *>? = definedExternally,
    )

    /**
     * Count of triangles in this polygon, number of VEC3 elements.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#triangleCount">Online Documentation</a>
     */
    val triangleCount: Double

    /**
     * Returns an array view of this polygon's triangle indices, represented as
     * three vertex indices per triangle.
     *
     * If 'result' argument is given, triangle indices are written to that array
     * and returned. Otherwise, returns an ArrayView on collection memory —
     * changes to this array will not trigger render updates, which requires
     * `.setTriangles()`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#getTriangles">Online Documentation</a>
     */
    fun getTriangles(result: TypedArray<*, *, *, *>? = definedExternally): TypedArray<*, *, *, *>

    /**
     * Sets this polygon's triangle indices, represented as three vertex indices
     * per triangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#setTriangles">Online Documentation</a>
     */
    fun setTriangles(indices: TypedArray<*, *, *, *>)

    /**
     * Returns a JSON-serializable object representing the polygon. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * @return JSON-serializable object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#toJSON">Online Documentation</a>
     */
    override fun toJSON(): JsAny

    companion object {
        /**
         * Copies data from source polygon to result. If the result polygon is not
         * new (the last polygon in the collection) then source and result polygons
         * must have the same vertex counts, hole counts, and triangle counts.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygon.html#.clone">Online Documentation</a>
         */
        fun clone(
            polygon: BufferPolygon,
            result: BufferPolygon,
        ): BufferPolygon
    }
}
