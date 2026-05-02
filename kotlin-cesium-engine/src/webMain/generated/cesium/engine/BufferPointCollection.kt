// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Collection of points held in ArrayBuffer storage for performance and memory optimization.
 *
 * Default buffer memory allocation is arbitrary, and collections cannot be resized,
 * so specific per-buffer capacities should be provided in the collection
 * constructor when available.
 * ```
 * const collection = new BufferPointCollection({primitiveCountMax: 1024});
 *
 * const point = new BufferPoint();
 * const material = new BufferPointMaterial({color: Color.WHITE});
 *
 * // Create a new point, temporarily bound to 'point' local variable.
 * collection.add({
 *   position: new Cartesian3(0.0, 0.0, 0.0),
 *   material
 * }, point);
 *
 * // Iterate over all points in collection, temporarily binding 'point'
 * // local variable to each, and updating point material.
 * for (let i = 0; i < collection.primitiveCount; i++) {
 *   collection.get(i, point);
 *   point.setMaterial(material);
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointCollection.html">Online Documentation</a>
 */
open external class BufferPointCollection(
    options: ConstructorOptions,
) : BufferPrimitiveCollection<BufferPoint> {
    @JsPlainObject
    interface ConstructorOptions {
        val primitiveCountMax: Double?
        val show: Boolean?
        val debugShowBoundingVolume: Boolean?
        val allowPicking: Boolean?
    }

    /**
     * Adds a new point to the collection, with the specified options. A
     * [BufferPoint] instance is linked to the new point, using
     * the 'result' argument if given, or a new instance if not. For repeated
     * calls, prefer to reuse a single BufferPoint instance rather than
     * allocating a new instance on each call.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointCollection.html#add">Online Documentation</a>
     */
    fun add(
        options: BufferPointOptions,
        result: BufferPoint,
    ): BufferPoint
}
