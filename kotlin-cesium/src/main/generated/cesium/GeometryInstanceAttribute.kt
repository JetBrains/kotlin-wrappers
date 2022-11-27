// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray

/**
 * Values and type information for per-instance geometry attributes.
 * ```
 * const instance = new GeometryInstance({
 *   geometry : BoxGeometry.fromDimensions({
 *     dimensions : new Cartesian3(1000000.0, 1000000.0, 500000.0)
 *   }),
 *   modelMatrix : Matrix4.multiplyByTranslation(Transforms.eastNorthUpToFixedFrame(
 *     Cartesian3.fromDegrees(0.0, 0.0)), new Cartesian3(0.0, 0.0, 1000000.0), new Matrix4()),
 *   id : 'box',
 *   attributes : {
 *     color : new GeometryInstanceAttribute({
 *       componentDatatype : ComponentDatatype.UNSIGNED_BYTE,
 *       componentsPerAttribute : 4,
 *       normalize : true,
 *       value : [255, 255, 0, 255]
 *     })
 *   }
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstanceAttribute.html">Online Documentation</a>
 */
external class GeometryInstanceAttribute(options: ConstructorOptions) {
    /**
     * @property [componentDatatype] The datatype of each component in the attribute, e.g., individual elements in values.
     * @property [componentsPerAttribute] A number between 1 and 4 that defines the number of components in an attributes.
     * @property [normalize] When `true` and `componentDatatype` is an integer format, indicate that the components should be mapped to the range [0, 1] (unsigned) or [-1, 1] (signed) when they are accessed as floating-point for rendering.
     *   Default value - `false`
     * @property [value] The value for the attribute.
     */
    interface ConstructorOptions {
        var componentDatatype: ComponentDatatype
        var componentsPerAttribute: Int
        var normalize: Boolean?
        var value: ReadonlyArray<Double>
    }

    /**
     * The datatype of each component in the attribute, e.g., individual elements in
     * [GeometryInstanceAttribute.value].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstanceAttribute.html#componentDatatype">Online Documentation</a>
     */
    var componentDatatype: ComponentDatatype

    /**
     * A number between 1 and 4 that defines the number of components in an attributes.
     * For example, a position attribute with x, y, and z components would have 3 as
     * shown in the code example.
     * ```
     * show : new GeometryInstanceAttribute({
     *   componentDatatype : ComponentDatatype.UNSIGNED_BYTE,
     *   componentsPerAttribute : 1,
     *   normalize : true,
     *   value : [1.0]
     * })
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstanceAttribute.html#componentsPerAttribute">Online Documentation</a>
     */
    var componentsPerAttribute: Int

    /**
     * When `true` and `componentDatatype` is an integer format,
     * indicate that the components should be mapped to the range [0, 1] (unsigned)
     * or [-1, 1] (signed) when they are accessed as floating-point for rendering.
     *
     * This is commonly used when storing colors using [ComponentDatatype.UNSIGNED_BYTE].
     * ```
     * attribute.componentDatatype = ComponentDatatype.UNSIGNED_BYTE;
     * attribute.componentsPerAttribute = 4;
     * attribute.normalize = true;
     * attribute.value = [
     *   Color.floatToByte(color.red),
     *   Color.floatToByte(color.green),
     *   Color.floatToByte(color.blue),
     *   Color.floatToByte(color.alpha)
     * ];
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstanceAttribute.html#normalize">Online Documentation</a>
     */
    var normalize: Boolean

    /**
     * The values for the attributes stored in a typed array.  In the code example,
     * every three elements in `values` defines one attributes since
     * `componentsPerAttribute` is 3.
     * ```
     * show : new GeometryInstanceAttribute({
     *   componentDatatype : ComponentDatatype.UNSIGNED_BYTE,
     *   componentsPerAttribute : 1,
     *   normalize : true,
     *   value : [1.0]
     * })
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstanceAttribute.html#value">Online Documentation</a>
     */
    var value: ReadonlyArray<Double>
}

inline fun GeometryInstanceAttribute(
    block: GeometryInstanceAttribute.ConstructorOptions.() -> Unit,
): GeometryInstanceAttribute {
    val options: GeometryInstanceAttribute.ConstructorOptions = js("({})")
    block(options)
    return GeometryInstanceAttribute(options)
}
