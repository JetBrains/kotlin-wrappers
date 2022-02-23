// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * An expression for a style applied to a [Cesium3DTileset].
 *
 * Derived classes of this interface evaluate expressions in the
 * [3D Tiles Styling language](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling).
 *
 * This type describes an interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StyleExpression.html">Online Documentation</a>
 */
abstract external class StyleExpression {
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StyleExpression.html#evaluate">Online Documentation</a>
     */
    abstract fun evaluate(
        feature: Cesium3DTileFeature,
        result: Any? = definedExternally,
    ): dynamic

    /**
     * Evaluates the result of a Color expression, optionally using the provided feature's properties.
     *
     * This is equivalent to [StyleExpression.evaluate] but always returns a [Color] object.
     * @param [feature] The feature whose properties may be used as variables in the expression.
     * @param [result] The object in which to store the result.
     * @return The modified result parameter or a new Color instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/StyleExpression.html#evaluateColor">Online Documentation</a>
     */
    abstract fun evaluateColor(
        feature: Cesium3DTileFeature,
        result: Color? = definedExternally,
    ): Color
}
