// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Attributes, which make up a geometry's vertices.  Each property in this object corresponds to a
 * [GeometryAttribute] containing the attribute's data.
 *
 * Attributes are always stored non-interleaved in a Geometry.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttributes.html">Online Documentation</a>
 */
external class GeometryAttributes {
    /**
     * The 3D position attribute.
     *
     * 64-bit floating-point (for precision).  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttributes.html#position">Online Documentation</a>
     */
    var position: GeometryAttribute

    /**
     * The normal attribute (normalized), which is commonly used for lighting.
     *
     * 32-bit floating-point.  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttributes.html#normal">Online Documentation</a>
     */
    var normal: GeometryAttribute

    /**
     * The 2D texture coordinate attribute.
     *
     * 32-bit floating-point.  2 components per attribute
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttributes.html#st">Online Documentation</a>
     */
    var st: GeometryAttribute

    /**
     * The bitangent attribute (normalized), which is used for tangent-space effects like bump mapping.
     *
     * 32-bit floating-point.  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttributes.html#bitangent">Online Documentation</a>
     */
    var bitangent: GeometryAttribute

    /**
     * The tangent attribute (normalized), which is used for tangent-space effects like bump mapping.
     *
     * 32-bit floating-point.  3 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttributes.html#tangent">Online Documentation</a>
     */
    var tangent: GeometryAttribute

    /**
     * The color attribute.
     *
     * 8-bit unsigned integer. 4 components per attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttributes.html#color">Online Documentation</a>
     */
    var color: GeometryAttribute
}
