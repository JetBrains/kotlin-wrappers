// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.buffer.DataView

/**
 * Material description for a [BufferPrimitive]. Abstract.
 *
 * BufferPrimitiveMaterial objects are {@link Packable|packable}, stored
 * when calling [BufferPrimitive.setMaterial]. Subsequent changes to the
 * material will not affect the primitive until setMaterial() is called again.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveMaterial.html">Online Documentation</a>
 */
external class BufferPrimitiveMaterial(
    options: BufferPrimitiveMaterialOptions? = definedExternally,
) {
    /**
     * Color of fill.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveMaterial.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Color of outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveMaterial.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Color

    /**
     * Width of outline, 0-255px.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveMaterial.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: JsAny /* number;
    static packedLength: number */

    /**
     * Returns a JSON-serializable object representing the material. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * @return JSON-serializable object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveMaterial.html#toJSON">Online Documentation</a>
     */
    fun toJSON(): JsAny

    companion object {
        /**
         * Stores the provided material into the provided array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveMaterial.html#.pack">Online Documentation</a>
         */
        fun pack(
            material: BufferPrimitiveMaterial,
            view: DataView<*>,
            byteOffset: Int,
        )

        /**
         * Retrieves a material from a packed array.
         * @param [view] The packed array.
         * @param [byteOffset] Starting index of the element to be unpacked.
         * @param [result] Material into which results are unpacked.
         * @return Modified result material, with results unpacked.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPrimitiveMaterial.html#.unpack">Online Documentation</a>
         */
        fun unpack(
            view: DataView<*>,
            byteOffset: Int,
            result: BufferPrimitiveMaterial,
        ): BufferPrimitiveMaterial
    }
}
