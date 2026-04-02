// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Material description for a [BufferPoint].
 *
 * BufferPointMaterial objects are {@link Packable|packable}, stored
 * when calling [BufferPoint.setMaterial]. Subsequent changes to the
 * material will not affect the point until setMaterial() is called again.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointMaterial.html">Online Documentation</a>
 */
external class BufferPointMaterial(
    options: BufferPointMaterialOptions? = definedExternally,
) {
    /**
     * Size of point, 0-255px.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointMaterial.html#size">Online Documentation</a>
     */
    var size: JsAny /* number;
    static pack(material: BufferPointMaterial, view: DataView, byteOffset: number): void;
    static unpack(view: DataView, byteOffset: number, result: BufferPointMaterial): BufferPointMaterial */

    /**
     * Returns a JSON-serializable object representing the material. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * @return JSON-serializable object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointMaterial.html#toJSON">Online Documentation</a>
     */
    fun toJSON(): JsAny

    /**
     * Color of fill.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointMaterial.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Color of outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointMaterial.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Color

    /**
     * Width of outline, 0-255px.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPointMaterial.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Double
}
