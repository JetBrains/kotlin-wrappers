// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * View bound to the underlying buffer data of a [BufferPrimitiveCollection]. Abstract.
 *
 * BufferPrimitive instances are intended to be reused when iterating over large collections,
 * and temporarily bound to a primitive index while performing read/write operations on that primitive,
 * before being rebound to the next primitive, using the
 * [flyweight pattern](https://en.wikipedia.org/wiki/Flyweight_pattern).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitive.html">Online Documentation</a>
 */
open external class BufferPrimitive {
    /**
     * Feature ID associated with the primitive; not required to be unique.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitive.html#featureId">Online Documentation</a>
     */
    var featureId: Int

    /**
     * Whether primitive is shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitive.html#show">Online Documentation</a>
     */
    var show: JsAny /* boolean;
    getMaterial(result: BufferPrimitiveMaterial): BufferPrimitiveMaterial;
    setMaterial(material: BufferPrimitiveMaterial): void */

    /**
     * Returns a JSON-serializable object representing the primitive. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * @return JSON-serializable object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitive.html#toJSON">Online Documentation</a>
     */
    fun toJSON(): JsAny

    companion object {
        /**
         * Copies data from source primitive to result. If the result primitive is not
         * new (the last primitive in the collection) then source and result primitives
         * must have the same vertex counts.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitive.html#.clone">Online Documentation</a>
         */
        fun clone(
            primitive: BufferPrimitive,
            result: BufferPrimitive,
        ): BufferPrimitive
    }
}
