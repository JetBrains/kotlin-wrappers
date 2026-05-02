// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.typedarrays.Uint32Array
import kotlinx.js.JsPlainObject

/**
 * Collection of primitives held in ArrayBuffer storage for performance and memory optimization.
 *
 * To get the full performance benefit of using a BufferPrimitiveCollection containing "N" primitives,
 * be careful to avoid allocating "N" instances of any related JavaScript object. [BufferPrimitive],
 * [Color], [Cartesian3], and other objects can all be reused when working with large collections,
 * using the [flyweight pattern](https://en.wikipedia.org/wiki/Flyweight_pattern).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html">Online Documentation</a>
 */
open external class BufferPrimitiveCollection<T : BufferPrimitive>(
    options: ConstructorOptions,
) {
    /**
     * @property [modelMatrix] Transforms geometry from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [allowPicking] When `true`, primitives are pickable with [Scene.pick]. When `false`, memory and initialization cost are lower.
     *   Default value - `false`
     */
    @JsPlainObject
    interface ConstructorOptions {
        val modelMatrix: Matrix4?
        val primitiveCountMax: Double?
        val vertexCountMax: Double?
        val show: Boolean?
        val positionDatatype: ComponentDatatype?
        val allowPicking: Boolean?
        val debugShowBoundingVolume: Boolean?
    }

    /**
     * Determines if primitives in this collection will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#show">Online Documentation</a>
     */
    var show: JsAny /* boolean;
    protected readonly _modelMatrix: Matrix4;
    protected readonly _boundingVolume: BoundingSphere;
    protected readonly _boundingVolumeWC: BoundingSphere */

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys collection and its GPU resources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Sorts primitives of the collection.
     *
     * Because sorting changes the indices (but not the feature IDs) of primitives
     * in the collection, the function also returns an array mapping from previous
     * index to new index. When sorting repeatedly, the array can be reused and
     * passed as the 'result' argument for each call.
     * @return Mapping from previous index to new index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#sort">Online Documentation</a>
     */
    fun sort(
        sortFn: Function<*>,
        result: Uint32Array<*>,
    ): Uint32Array<*>

    /**
     * Makes the given [BufferPrimitive] a view onto this collection's
     * primitive at the given index, for use when reading/writing primitive
     * properties. When iterating over a large collection, prefer to reuse
     * the same BufferPrimitive instance throughout the loop — rebinding
     * an existing instance to a different primitive is cheap, and avoids
     * allocating in-memory objects for every object.
     * ```
     * const primitive = new BufferPrimitive();
     * for (let i = 0; i < collection.primitiveCount; i++) {
     *   collection.get(i, primitive);
     *   primitive.setColor(Color.RED);
     * }
     * ```
     * @return The BufferPrimitive instance passed as the
     *   'result' argument, now bound to the specified primitive index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#get">Online Documentation</a>
     */
    fun get(
        index: Int,
        result: BufferPrimitive,
    ): BufferPrimitive

    /**
     * Adds a new primitive to the collection, with the specified options. A
     * [BufferPrimitive] instance is linked to the new primitive, using
     * the 'result' argument if given, or a new instance if not. For repeated
     * calls, prefer to reuse a single BufferPrimitive instance rather than
     * allocating a new instance on each call.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#add">Online Documentation</a>
     */
    fun add(
        options: BufferPrimitiveOptions,
        result: JsAny,
        /* BufferPrimitive): BufferPrimitive;
    update(frameState: any */
    )

    /**
     * Number of primitives in collection. Must be <= [primitiveCountMax].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#primitiveCount">Online Documentation</a>
     */
    val primitiveCount: Double

    /**
     * Maximum number of primitives this collection can contain. Must be >=
     * [primitiveCount].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#primitiveCountMax">Online Documentation</a>
     */
    val primitiveCountMax: Double

    /**
     * Total byte length of buffers owned by this collection. Includes any unused
     * space allocated by [primitiveCountMax], even if no primitives have
     * yet been added in that space.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#byteLength">Online Documentation</a>
     */
    val byteLength: Int

    /**
     * Number of vertices in collection. Must be <= [vertexCountMax].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#vertexCount">Online Documentation</a>
     */
    val vertexCount: Double

    /**
     * Maximum number of vertices this collection can contain. Must be >=
     * [vertexCount].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#vertexCountMax">Online Documentation</a>
     */
    val vertexCountMax: Double

    /**
     * Transforms geometry from model to world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#modelMatrix">Online Documentation</a>
     */
    val modelMatrix: Matrix4

    /**
     * Local bounding volume for all primitives in the collection, including both
     * shown and hidden primitives.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#boundingVolume">Online Documentation</a>
     */
    val boundingVolume: BoundingSphere

    /**
     * World bounding volume for all primitives in the collection, including both
     * shown and hidden primitives.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#boundingVolumeWC">Online Documentation</a>
     */
    val boundingVolumeWC: BoundingSphere

    /**
     * Returns a JSON-serializable array representing the collection. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * ```
     * console.table(collection.toJSON());
     * ```
     * @return List of JSON-serializable objects, one for each
     *   primitive in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#toJSON">Online Documentation</a>
     */
    fun toJSON(): ReadonlyArray<JsAny>

    companion object {
        /**
         * Duplicates the contents of this collection into the result collection.
         * Result collection is not resized, and must contain enough space for all
         * primitives in the source collection. Existing primitives in the result
         * collection will be overwritten.
         *
         * Useful when allocating more space for a collection that has reached its
         * capacity, and efficiently transferring features to the new collection.
         * ```
         * const result = new BufferPrimitiveCollection({ ... }); // allocate larger 'result' collection
         * BufferPrimitiveCollection.clone(collection, result);   // copy primitives from 'collection' into 'result'
         * ```
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#.clone">Online Documentation</a>
         */
        fun <T : BufferPrimitive> clone(
            collection: BufferPrimitiveCollection<T>,
            result: BufferPrimitiveCollection<T>,
        )

        /**
         * Default capacity of buffers on new collections. A quantity of elements:
         * number of vertices in the vertex buffer, primitives in the primitive
         * buffer, etc. This value is arbitrary, and collections cannot be resized,
         * so specific per-buffer capacities should be provided in the collection
         * constructor when available.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveCollection.html#.DEFAULT_CAPACITY">Online Documentation</a>
         */
        val DEFAULT_CAPACITY: Double
    }
}
