// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Values and type information for geometry attributes.  A [Geometry]
 * generally contains one or more attributes.  All attributes together form
 * the geometry's vertices.
 * ```
 * const geometry = new Geometry({
 *   attributes : {
 *     position : new GeometryAttribute({
 *       componentDatatype : ComponentDatatype.FLOAT,
 *       componentsPerAttribute : 3,
 *       values : new Float32Array([
 *         0.0, 0.0, 0.0,
 *         7500000.0, 0.0, 0.0,
 *         0.0, 7500000.0, 0.0
 *       ])
 *     })
 *   },
 *   primitiveType : PrimitiveType.LINE_LOOP
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttribute.html">Online Documentation</a>
 */
external class GeometryAttribute {
    /**
     * The datatype of each component in the attribute, e.g., individual elements in
     * [GeometryAttribute.values].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttribute.html#componentDatatype">Online Documentation</a>
     */
    var componentDatatype: ComponentDatatype

    /**
     * A number between 1 and 4 that defines the number of components in an attributes.
     * For example, a position attribute with x, y, and z components would have 3 as
     * shown in the code example.
     * ```
     * attribute.componentDatatype = ComponentDatatype.FLOAT;
     * attribute.componentsPerAttribute = 3;
     * attribute.values = new Float32Array([
     *   0.0, 0.0, 0.0,
     *   7500000.0, 0.0, 0.0,
     *   0.0, 7500000.0, 0.0
     * ]);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttribute.html#componentsPerAttribute">Online Documentation</a>
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
     * attribute.values = new Uint8Array([
     *   Color.floatToByte(color.red),
     *   Color.floatToByte(color.green),
     *   Color.floatToByte(color.blue),
     *   Color.floatToByte(color.alpha)
     * ]);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttribute.html#normalize">Online Documentation</a>
     */
    var normalize: Boolean

    /**
     * The values for the attributes stored in a typed array.  In the code example,
     * every three elements in `values` defines one attributes since
     * `componentsPerAttribute` is 3.
     * ```
     * attribute.componentDatatype = ComponentDatatype.FLOAT;
     * attribute.componentsPerAttribute = 3;
     * attribute.values = new Float32Array([
     *   0.0, 0.0, 0.0,
     *   7500000.0, 0.0, 0.0,
     *   0.0, 7500000.0, 0.0
     * ]);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryAttribute.html#values">Online Documentation</a>
     */
    var values: dynamic
}

inline fun GeometryAttribute(
    block: GeometryAttribute.() -> Unit,
): GeometryAttribute =
    GeometryAttribute().apply(block)
