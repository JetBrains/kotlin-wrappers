// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Collection of polygons held in ArrayBuffer storage for performance and memory optimization.
 *
 * Default buffer memory allocation is arbitrary, and collections cannot be resized,
 * so specific per-buffer capacities should be provided in the collection
 * constructor when available.
 * ```
 * import earcut from "earcut";
 *
 * const collection = new BufferPolygonCollection({
 *   primitiveCountMax: 1024,
 *   vertexCountMax: 4096,
 *   holeCountMax: 1024,
 *   triangleCountMax: 2048,
 * });
 *
 * const polygon = new BufferPolygon();
 * const positions = [ ... ];
 * const holes = [ ... ];
 * const material = new BufferPolygonMaterial({color: Color.WHITE});
 *
 * // Create a new polygon, temporarily bound to 'polygon' local variable.
 * collection.add({
 *   positions: new Float64Array(positions),
 *   holes: new Uint32Array(holes),
 *   triangles: new Uint32Array(earcut(positions, holes, 3)),
 *   material
 * }, polygon);
 *
 * // Iterate over all polygons in collection, temporarily binding 'polygon'
 * // local variable to each, and updating polygon material.
 * for (let i = 0; i < collection.primitiveCount; i++) {
 *   collection.get(i, polygon);
 *   polygon.setMaterial(material);
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonCollection.html">Online Documentation</a>
 */
open external class BufferPolygonCollection(
    options: ConstructorOptions,
) {
    /**
     * @property [allowPicking] When `true`, primitives are pickable with [Scene.pick]. When `false`, memory and initialization cost are lower.
     *   Default value - `true`
     */
    @JsPlainObject
    interface ConstructorOptions {
        val primitiveCountMax: Double?
        val vertexCountMax: Double?
        val holeCountMax: Double?
        val triangleCountMax: Double?
        val positionDatatype: ComponentDatatype?
        val show: Boolean?
        val allowPicking: Boolean?
        val debugShowBoundingVolume: Boolean?
    }

    /**
     * Adds a new polygon to the collection, with the specified options. A
     * [BufferPolygon] instance is linked to the new polygon, using
     * the 'result' argument if given, or a new instance if not. For repeated
     * calls, prefer to reuse a single BufferPolygon instance rather than
     * allocating a new instance on each call.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonCollection.html#add">Online Documentation</a>
     */
    fun add(
        options: BufferPolygonOptions,
        result: BufferPolygon,
    ): BufferPolygon

    /**
     * Total byte length of buffers owned by this collection. Includes any unused
     * space allocated by [primitiveCountMax], even if no polygons have
     * yet been added in that space.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonCollection.html#byteLength">Online Documentation</a>
     */
    val byteLength: Int

    /**
     * Number of holes in collection. Must be <= [holeCountMax].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonCollection.html#holeCount">Online Documentation</a>
     */
    val holeCount: Double

    /**
     * Maximum number of holes in collection. Must be >= [holeCount].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonCollection.html#holeCountMax">Online Documentation</a>
     */
    val holeCountMax: Double

    /**
     * Number of triangles in collection. Must be <= [triangleCountMax].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonCollection.html#triangleCount">Online Documentation</a>
     */
    val triangleCount: Double

    /**
     * Maximum number of triangles in collection. Must be >= [triangleCount].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonCollection.html#triangleCountMax">Online Documentation</a>
     */
    val triangleCountMax: Double

    companion object {
        /**
         * Duplicates the contents of this collection into the result collection.
         * Result collection is not resized, and must contain enough space for all
         * primitives in the source collection. Existing polygons in the result
         * collection will be overwritten.
         *
         * Useful when allocating more space for a collection that has reached its
         * capacity, and efficiently transferring polygons to the new collection.
         * ```
         * const result = new BufferPolygonCollection({ ... }); // allocate larger 'result' collection
         * BufferPolygonCollection.clone(collection, result);   // copy polygons from 'collection' into 'result'
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonCollection.html#.clone">Online Documentation</a>
         */
        fun clone(
            collection: BufferPolygonCollection,
            result: BufferPolygonCollection,
        ): BufferPolygonCollection
    }
}
