// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * An expression for a style applied to a [Cesium3DTileset].
 *
 * Evaluates a conditions expression defined using the
 * [3D Tiles Styling language](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling).
 *
 * Implements the [StyleExpression] interface.
 * ```
 * const expression = new ConditionsExpression({
 *     conditions : [
 *         ['${Area} > 10, 'color("#FF0000")'],
 *         ['${id} !== "1"', 'color("#00FF00")'],
 *         ['true', 'color("#FFFFFF")']
 *     ]
 * });
 * expression.evaluateColor(feature, result); // returns a Color object
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConditionsExpression.html">Online Documentation</a>
 *
 * @constructor
 * @property [conditionsExpression] The conditions expression defined using the 3D Tiles Styling language.
 * @param [defines] Defines in the style.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConditionsExpression.html">Online Documentation</a>
 */
external class ConditionsExpression(
    val conditionsExpression: Any = definedExternally,
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConditionsExpression.html#evaluate">Online Documentation</a>
     */
    override fun evaluate(
        feature: Cesium3DTileFeature,
        result: Any?,
    ): dynamic

    /**
     * Evaluates the result of a Color expression, using the values defined by a feature.
     *
     * This is equivalent to [ConditionsExpression.evaluate] but always returns a [Color] object.
     * @param [feature] The feature whose properties may be used as variables in the expression.
     * @param [result] The object in which to store the result
     * @return The modified result parameter or a new Color instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConditionsExpression.html#evaluateColor">Online Documentation</a>
     */
    override fun evaluateColor(
        feature: Cesium3DTileFeature,
        result: Color?,
    ): Color
}
