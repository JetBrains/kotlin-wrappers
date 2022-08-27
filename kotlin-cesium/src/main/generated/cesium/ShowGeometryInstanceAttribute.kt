// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Value and type information for per-instance geometry attribute that determines if the geometry instance will be shown.
 * ```
 * const instance = new GeometryInstance({
 *   geometry : new BoxGeometry({
 *     vertexFormat : VertexFormat.POSITION_AND_NORMAL,
 *     minimum : new Cartesian3(-250000.0, -250000.0, -250000.0),
 *     maximum : new Cartesian3(250000.0, 250000.0, 250000.0)
 *   }),
 *   modelMatrix : Matrix4.multiplyByTranslation(Transforms.eastNorthUpToFixedFrame(
 *     Cartesian3.fromDegrees(-75.59777, 40.03883)), new Cartesian3(0.0, 0.0, 1000000.0), new Matrix4()),
 *   id : 'box',
 *   attributes : {
 *     show : new ShowGeometryInstanceAttribute(false)
 *   }
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShowGeometryInstanceAttribute.html">Online Documentation</a>
 *
 * @constructor
 * @param [show] Determines if the geometry instance will be shown.
 *   Default value - `true`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShowGeometryInstanceAttribute.html">Online Documentation</a>
 */
external class ShowGeometryInstanceAttribute(show: Boolean? = definedExternally) {
    /**
     * The values for the attributes stored in a typed array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShowGeometryInstanceAttribute.html#value">Online Documentation</a>
     */
    var value: kotlinx.js.Uint8Array

    /**
     * The datatype of each component in the attribute, e.g., individual elements in
     * [ColorGeometryInstanceAttribute.value].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShowGeometryInstanceAttribute.html#componentDatatype">Online Documentation</a>
     */
    val componentDatatype: ComponentDatatype

    /**
     * The number of components in the attributes, i.e., [ColorGeometryInstanceAttribute.value].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShowGeometryInstanceAttribute.html#componentsPerAttribute">Online Documentation</a>
     */
    val componentsPerAttribute: Int

    /**
     * When `true` and `componentDatatype` is an integer format,
     * indicate that the components should be mapped to the range [0, 1] (unsigned)
     * or [-1, 1] (signed) when they are accessed as floating-point for rendering.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShowGeometryInstanceAttribute.html#normalize">Online Documentation</a>
     */
    val normalize: Boolean

    companion object {
        /**
         * Converts a boolean show to a typed array that can be used to assign a show attribute.
         * ```
         * const attributes = primitive.getGeometryInstanceAttributes('an id');
         * attributes.show = ShowGeometryInstanceAttribute.toValue(true, attributes.show);
         * ```
         * @param [show] The show value.
         * @param [result] The array to store the result in, if undefined a new instance will be created.
         * @return The modified result parameter or a new instance if result was undefined.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShowGeometryInstanceAttribute.html#.toValue">Online Documentation</a>
         */
        fun toValue(
            show: Boolean,
            result: kotlinx.js.Uint8Array? = definedExternally,
        ): kotlinx.js.Uint8Array
    }
}
