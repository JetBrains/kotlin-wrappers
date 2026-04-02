// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Material description for a [BufferPolyline].
 *
 * BufferPolylineMaterial objects are {@link Packable|packable}, stored
 * when calling [BufferPolyline.setMaterial]. Subsequent changes to the
 * material will not affect the polyline until setMaterial() is called again.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineMaterial.html">Online Documentation</a>
 */
external class BufferPolylineMaterial(
    options: BufferPolylineMaterialOptions? = definedExternally,
) {
    /**
     * Width of polyline, 0–255px.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineMaterial.html#width">Online Documentation</a>
     */
    var width: JsAny /* number;
    static pack(material: BufferPolylineMaterial, view: DataView, byteOffset: number): void;
    static unpack(view: DataView, byteOffset: number, result: BufferPolylineMaterial): BufferPolylineMaterial */

    /**
     * Returns a JSON-serializable object representing the material. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * @return JSON-serializable object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineMaterial.html#toJSON">Online Documentation</a>
     */
    fun toJSON(): JsAny

    /**
     * Color of fill.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineMaterial.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Color of outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineMaterial.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Color

    /**
     * Width of outline, 0-255px.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineMaterial.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Double
}
