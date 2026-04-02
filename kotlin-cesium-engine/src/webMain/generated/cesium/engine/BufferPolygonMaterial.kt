// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Material description for a [BufferPolygon].
 *
 * BufferPolygonMaterial objects are {@link Packable|packable}, stored
 * when calling [BufferPolygon.setMaterial]. Subsequent changes to the
 * material will not affect the polygon until setMaterial() is called again.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonMaterial.html">Online Documentation</a>
 */
external class BufferPolygonMaterial(
    options: BufferPolygonMaterialOptions? = definedExternally,
) {
    /**
     * Color of fill.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonMaterial.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Color of outline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonMaterial.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Color

    /**
     * Width of outline, 0-255px.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonMaterial.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Double

    /**
     * Returns a JSON-serializable object representing the material. This encoding
     * is not memory-efficient, and should generally be used for debugging and
     * testing.
     * @return JSON-serializable object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolygonMaterial.html#toJSON">Online Documentation</a>
     */
    fun toJSON(): JsAny
}
