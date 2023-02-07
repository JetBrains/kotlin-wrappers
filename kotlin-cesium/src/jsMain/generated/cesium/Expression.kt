// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * An expression for a style applied to a [Cesium3DTileset].
 *
 * Evaluates an expression defined using the
 * [3D Tiles Styling language](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling).
 *
 * Implements the [StyleExpression] interface.
 * ```
 * const expression = new Expression('(regExp("^Chest").test(${County})) && (${YearBuilt} >= 1970)');
 * expression.evaluate(feature); // returns true or false depending on the feature's properties
 * ```
 * ```
 * const expression = new Expression('(${Temperature} > 90) ? color("red") : color("white")');
 * expression.evaluateColor(feature, result); // returns a Color object
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Expression.html">Online Documentation</a>
 *
 * @constructor
 * @property [expression] The expression defined using the 3D Tiles Styling language.
 * @param [defines] Defines in the style.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Expression.html">Online Documentation</a>
 */
external class Expression(
    val expression: String = definedExternally,
    defines: Any? = definedExternally,
) : StyleExpression {
    /**
     * Evaluates the result of an expression, optionally using the provided feature's properties. If the result of
     * the expression in the
     * [3D Tiles Styling language](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling)
     * is of type `Boolean`, `Number`, or `String`, the corresponding JavaScript
     * primitive type will be returned. If the result is a `RegExp`, a Javascript `RegExp`
     * object will be returned. If the result is a `Cartesian2`, `Cartesian3`, or `Cartesian4`,
     * a [Cartesian2], [Cartesian3], or [Cartesian4] object will be returned. If the `result` argument is
     * a [Color], the [Cartesian4] value is converted to a [Color] and then returned.
     * @param [feature] The feature whose properties may be used as variables in the expression.
     * @param [result] The object onto which to store the result.
     * @return The result of evaluating the expression.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Expression.html#evaluate">Online Documentation</a>
     */
    override fun evaluate(
        feature: Cesium3DTileFeature,
        result: Any?,
    ): dynamic

    /**
     * Evaluates the result of a Color expression, optionally using the provided feature's properties.
     *
     * This is equivalent to [Expression.evaluate] but always returns a [Color] object.
     * @param [feature] The feature whose properties may be used as variables in the expression.
     * @param [result] The object in which to store the result
     * @return The modified result parameter or a new Color instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Expression.html#evaluateColor">Online Documentation</a>
     */
    override fun evaluateColor(
        feature: Cesium3DTileFeature,
        result: Color?,
    ): Color
}
