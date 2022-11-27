// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import js.typedarrays.Uint8Array

/**
 * Value and type information for per-instance geometry color.
 * ```
 * const instance = new GeometryInstance({
 *   geometry : BoxGeometry.fromDimensions({
 *     dimensions : new Cartesian3(1000000.0, 1000000.0, 500000.0)
 *   }),
 *   modelMatrix : Matrix4.multiplyByTranslation(Transforms.eastNorthUpToFixedFrame(
 *     Cartesian3.fromDegrees(0.0, 0.0)), new Cartesian3(0.0, 0.0, 1000000.0), new Matrix4()),
 *   id : 'box',
 *   attributes : {
 *     color : new ColorGeometryInstanceAttribute(red, green, blue, alpha)
 *   }
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html">Online Documentation</a>
 *
 * @constructor
 * @param [red] The red component.
 *   Default value - `1.0`
 * @param [green] The green component.
 *   Default value - `1.0`
 * @param [blue] The blue component.
 *   Default value - `1.0`
 * @param [alpha] The alpha component.
 *   Default value - `1.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html">Online Documentation</a>
 */
external class ColorGeometryInstanceAttribute(
    red: Double? = definedExternally,
    green: Double? = definedExternally,
    blue: Double? = definedExternally,
    alpha: Double? = definedExternally,
) {
    /**
     * The values for the attributes stored in a typed array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html#value">Online Documentation</a>
     */
    var value: Uint8Array

    /**
     * The datatype of each component in the attribute, e.g., individual elements in
     * [ColorGeometryInstanceAttribute.value].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html#componentDatatype">Online Documentation</a>
     */
    val componentDatatype: ComponentDatatype

    /**
     * The number of components in the attributes, i.e., [ColorGeometryInstanceAttribute.value].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html#componentsPerAttribute">Online Documentation</a>
     */
    val componentsPerAttribute: Int

    /**
     * When `true` and `componentDatatype` is an integer format,
     * indicate that the components should be mapped to the range [0, 1] (unsigned)
     * or [-1, 1] (signed) when they are accessed as floating-point for rendering.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html#normalize">Online Documentation</a>
     */
    val normalize: Boolean

    companion object {
        /**
         * Creates a new [ColorGeometryInstanceAttribute] instance given the provided [Color].
         * ```
         * const instance = new GeometryInstance({
         *   geometry : geometry,
         *   attributes : {
         *     color : fromColor(Color.CORNFLOWERBLUE),
         *   }
         * });
         * ```
         * @param [color] The color.
         * @return The new [ColorGeometryInstanceAttribute] instance.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html#.fromColor">Online Documentation</a>
         */
        fun fromColor(color: Color): ColorGeometryInstanceAttribute

        /**
         * Converts a color to a typed array that can be used to assign a color attribute.
         * ```
         * const attributes = primitive.getGeometryInstanceAttributes('an id');
         * attributes.color = ColorGeometryInstanceAttribute.toValue(Color.AQUA, attributes.color);
         * ```
         * @param [color] The color.
         * @param [result] The array to store the result in, if undefined a new instance will be created.
         * @return The modified result parameter or a new instance if result was undefined.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html#.toValue">Online Documentation</a>
         */
        fun toValue(
            color: Color,
            result: Uint8Array? = definedExternally,
        ): Uint8Array

        /**
         * Compares the provided ColorGeometryInstanceAttributes and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first ColorGeometryInstanceAttribute.
         * @param [right] The second ColorGeometryInstanceAttribute.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorGeometryInstanceAttribute.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: ColorGeometryInstanceAttribute? = definedExternally,
            right: ColorGeometryInstanceAttribute? = definedExternally,
        ): Boolean
    }
}
