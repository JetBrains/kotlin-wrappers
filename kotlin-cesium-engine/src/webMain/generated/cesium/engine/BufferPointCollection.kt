// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import cesium.core.BoundingSphere
import cesium.core.ComponentDatatype
import cesium.core.Matrix4
import js.typedarrays.TypedArray
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
    /**
     * @property [modelMatrix] Transforms geometry from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [allowPicking] When `true`, primitives are pickable with [Scene.pick]. When `false`, memory and initialization cost are lower.
     *   Default value - `false`
     * @property [boundingVolume] Bounding volume, in world space, for the collection. When
     *   unspecified, a bounding volume is computed automatically and updated when primitive positions change. When
     *   specified, users are responsible for updating bounding volume as needed. Pre-computing the bounding volume
     *   manually, and updating it only as needed, will improve performance for larger dynamic collections.
     * @property [blendOption] Determines how primitives in the collection are blended with the scene. Must be [BlendOption.OPAQUE] or [BlendOption.TRANSLUCENT]; [BlendOption.OPAQUE_AND_TRANSLUCENT] is not supported.
     *   Default value - [BlendOption.TRANSLUCENT]
     */
    @JsPlainObject
    interface ConstructorOptions {
        val modelMatrix: Matrix4?
        val primitiveCountMax: Double?
        val positionDatatype: ComponentDatatype?
        val positionNormalized: Boolean?
        val show: Boolean?
        val allowPicking: Boolean?
        val boundingVolume: BoundingSphere?
        val debugShowBoundingVolume: Boolean?
        val blendOption: BlendOption?
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

    /**
     * Updates vertex positions over the specified range of primitives. For
     * position-only updates to many primitives, `setPositions()` is more
     * efficient than updating each primitive individually.
     *
     * Argument `positions` must contain the same total number of vertices as the
     * target primitive range; vertices cannot be added/removed by this method.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointCollection.html#setPositions">Online Documentation</a>
     */
    override fun setPositions(
        positions: TypedArray<*, *, *, *>,
        primitiveOffset: Double,
        primitiveCount: Double,
    )
}
