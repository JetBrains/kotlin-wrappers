// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A style that is applied to a [Cesium3DTileset].
 *
 * Evaluates an expression defined using the
 * [3D Tiles Styling language](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling).
 * ```
 * tileset.style = new Cesium3DTileStyle({
 *     color : {
 *         conditions : [
 *             ['${Height} >= 100', 'color("purple", 0.5)'],
 *             ['${Height} >= 50', 'color("red")'],
 *             ['true', 'color("blue")']
 *         ]
 *     },
 *     show : '${Height} > 0',
 *     meta : {
 *         description : '"Building id ${id} has height ${Height}."'
 *     }
 * });
 * ```
 * ```
 * tileset.style = new Cesium3DTileStyle({
 *     color : 'vec4(${Temperature})',
 *     pointSize : '${Temperature} * 2.0'
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html">Online Documentation</a>
 *
 * @constructor
 * @property [style] An object defining a style.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html">Online Documentation</a>
 */
external class Cesium3DTileStyle(val style: Any = definedExternally) {
    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `show` property. Alternatively a boolean, string, or object defining a show style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return or convert to a `Boolean`.
     *
     * This expression is applicable to all tile formats.
     * ```
     * const style = new Cesium3DTileStyle({
     *     show : '(regExp("^Chest").test(${County})) && (${YearBuilt} >= 1970)'
     * });
     * style.show.evaluate(feature); // returns true or false depending on the feature's properties
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override show expression with a custom function
     * style.show = {
     *     evaluate : function(feature) {
     *         return true;
     *     }
     * };
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override show expression with a boolean
     * style.show = true;
     * };
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override show expression with a string
     * style.show = '${Height} > 0';
     * };
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override show expression with a condition
     * style.show = {
     *     conditions: [
     *         ['${height} > 2', 'false'],
     *         ['true', 'true']
     *     ];
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#show">Online Documentation</a>
     */
    var show: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `color` property. Alternatively a string or object defining a color style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Color`.
     *
     * This expression is applicable to all tile formats.
     * ```
     * const style = new Cesium3DTileStyle({
     *     color : '(${Temperature} > 90) ? color("red") : color("white")'
     * });
     * style.color.evaluateColor(feature, result); // returns a Color object
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override color expression with a custom function
     * style.color = {
     *     evaluateColor : function(feature, result) {
     *         return Color.clone(Color.WHITE, result);
     *     }
     * };
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override color expression with a string
     * style.color = 'color("blue")';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override color expression with a condition
     * style.color = {
     *     conditions : [
     *         ['${height} > 2', 'color("cyan")'],
     *         ['true', 'color("blue")']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#color">Online Documentation</a>
     */
    var color: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `pointSize` property. Alternatively a string or object defining a point size style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Number`.
     *
     * This expression is only applicable to point features in a Vector tile or a Point Cloud tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     pointSize : '(${Temperature} > 90) ? 2.0 : 1.0'
     * });
     * style.pointSize.evaluate(feature); // returns a Number
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override pointSize expression with a custom function
     * style.pointSize = {
     *     evaluate : function(feature) {
     *         return 1.0;
     *     }
     * };
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override pointSize expression with a number
     * style.pointSize = 1.0;
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override pointSize expression with a string
     * style.pointSize = '${height} / 10';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override pointSize expression with a condition
     * style.pointSize =  {
     *     conditions : [
     *         ['${height} > 2', '1.0'],
     *         ['true', '2.0']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#pointSize">Online Documentation</a>
     */
    var pointSize: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `pointOutlineColor` property. Alternatively a string or object defining a color style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Color`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override pointOutlineColor expression with a string
     * style.pointOutlineColor = 'color("blue")';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override pointOutlineColor expression with a condition
     * style.pointOutlineColor = {
     *     conditions : [
     *         ['${height} > 2', 'color("cyan")'],
     *         ['true', 'color("blue")']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#pointOutlineColor">Online Documentation</a>
     */
    var pointOutlineColor: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `pointOutlineWidth` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Number`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override pointOutlineWidth expression with a string
     * style.pointOutlineWidth = '5';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override pointOutlineWidth expression with a condition
     * style.pointOutlineWidth = {
     *     conditions : [
     *         ['${height} > 2', '5'],
     *         ['true', '0']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#pointOutlineWidth">Online Documentation</a>
     */
    var pointOutlineWidth: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `labelColor` property. Alternatively a string or object defining a color style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Color`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelColor expression with a string
     * style.labelColor = 'color("blue")';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelColor expression with a condition
     * style.labelColor = {
     *     conditions : [
     *         ['${height} > 2', 'color("cyan")'],
     *         ['true', 'color("blue")']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#labelColor">Online Documentation</a>
     */
    var labelColor: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `labelOutlineColor` property. Alternatively a string or object defining a color style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Color`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelOutlineColor expression with a string
     * style.labelOutlineColor = 'color("blue")';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelOutlineColor expression with a condition
     * style.labelOutlineColor = {
     *     conditions : [
     *         ['${height} > 2', 'color("cyan")'],
     *         ['true', 'color("blue")']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#labelOutlineColor">Online Documentation</a>
     */
    var labelOutlineColor: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `labelOutlineWidth` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Number`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelOutlineWidth expression with a string
     * style.labelOutlineWidth = '5';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelOutlineWidth expression with a condition
     * style.labelOutlineWidth = {
     *     conditions : [
     *         ['${height} > 2', '5'],
     *         ['true', '0']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#labelOutlineWidth">Online Documentation</a>
     */
    var labelOutlineWidth: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `font` property. Alternatively a string or object defining a string style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `String`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     font : '(${Temperature} > 90) ? "30px Helvetica" : "24px Helvetica"'
     * });
     * style.font.evaluate(feature); // returns a String
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override font expression with a custom function
     * style.font = {
     *     evaluate : function(feature) {
     *         return '24px Helvetica';
     *     }
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#font">Online Documentation</a>
     */
    var font: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `label style` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `LabelStyle`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     labelStyle : `(\${Temperature} > 90) ? ${LabelStyle.FILL_AND_OUTLINE} : ${LabelStyle.FILL}`
     * });
     * style.labelStyle.evaluate(feature); // returns a LabelStyle
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelStyle expression with a custom function
     * style.labelStyle = {
     *     evaluate : function(feature) {
     *         return LabelStyle.FILL;
     *     }
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#labelStyle">Online Documentation</a>
     */
    var labelStyle: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `labelText` property. Alternatively a string or object defining a string style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `String`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     labelText : '(${Temperature} > 90) ? ">90" : "<=90"'
     * });
     * style.labelText.evaluate(feature); // returns a String
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelText expression with a custom function
     * style.labelText = {
     *     evaluate : function(feature) {
     *         return 'Example label text';
     *     }
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#labelText">Online Documentation</a>
     */
    var labelText: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `backgroundColor` property. Alternatively a string or object defining a color style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Color`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override backgroundColor expression with a string
     * style.backgroundColor = 'color("blue")';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override backgroundColor expression with a condition
     * style.backgroundColor = {
     *     conditions : [
     *         ['${height} > 2', 'color("cyan")'],
     *         ['true', 'color("blue")']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#backgroundColor">Online Documentation</a>
     */
    var backgroundColor: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `backgroundPadding` property. Alternatively a string or object defining a vec2 style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Cartesian2`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override backgroundPadding expression with a string
     * style.backgroundPadding = 'vec2(5.0, 7.0)';
     * style.backgroundPadding.evaluate(feature); // returns a Cartesian2
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#backgroundPadding">Online Documentation</a>
     */
    var backgroundPadding: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `backgroundEnabled` property. Alternatively a string or object defining a boolean style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Boolean`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override backgroundEnabled expression with a string
     * style.backgroundEnabled = 'true';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override backgroundEnabled expression with a condition
     * style.backgroundEnabled = {
     *     conditions : [
     *         ['${height} > 2', 'true'],
     *         ['true', 'false']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#backgroundEnabled">Online Documentation</a>
     */
    var backgroundEnabled: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `scaleByDistance` property. Alternatively a string or object defining a vec4 style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Cartesian4`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override scaleByDistance expression with a string
     * style.scaleByDistance = 'vec4(1.5e2, 2.0, 1.5e7, 0.5)';
     * style.scaleByDistance.evaluate(feature); // returns a Cartesian4
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#scaleByDistance">Online Documentation</a>
     */
    var scaleByDistance: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `translucencyByDistance` property. Alternatively a string or object defining a vec4 style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Cartesian4`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override translucencyByDistance expression with a string
     * style.translucencyByDistance = 'vec4(1.5e2, 1.0, 1.5e7, 0.2)';
     * style.translucencyByDistance.evaluate(feature); // returns a Cartesian4
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#translucencyByDistance">Online Documentation</a>
     */
    var translucencyByDistance: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `distanceDisplayCondition` property. Alternatively a string or object defining a vec2 style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Cartesian2`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override distanceDisplayCondition expression with a string
     * style.distanceDisplayCondition = 'vec2(0.0, 5.5e6)';
     * style.distanceDisplayCondition.evaluate(feature); // returns a Cartesian2
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `heightOffset` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Number`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override heightOffset expression with a string
     * style.heightOffset = '2.0';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override heightOffset expression with a condition
     * style.heightOffset = {
     *     conditions : [
     *         ['${height} > 2', '4.0'],
     *         ['true', '2.0']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#heightOffset">Online Documentation</a>
     */
    var heightOffset: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `anchorLineEnabled` property. Alternatively a string or object defining a boolean style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Boolean`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override anchorLineEnabled expression with a string
     * style.anchorLineEnabled = 'true';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override anchorLineEnabled expression with a condition
     * style.anchorLineEnabled = {
     *     conditions : [
     *         ['${height} > 2', 'true'],
     *         ['true', 'false']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#anchorLineEnabled">Online Documentation</a>
     */
    var anchorLineEnabled: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `anchorLineColor` property. Alternatively a string or object defining a color style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Color`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override anchorLineColor expression with a string
     * style.anchorLineColor = 'color("blue")';
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override anchorLineColor expression with a condition
     * style.anchorLineColor = {
     *     conditions : [
     *         ['${height} > 2', 'color("cyan")'],
     *         ['true', 'color("blue")']
     *     ]
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#anchorLineColor">Online Documentation</a>
     */
    var anchorLineColor: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `image` property. Alternatively a string or object defining a string style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `String`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     image : '(${Temperature} > 90) ? "/url/to/image1" : "/url/to/image2"'
     * });
     * style.image.evaluate(feature); // returns a String
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override image expression with a custom function
     * style.image = {
     *     evaluate : function(feature) {
     *         return '/url/to/image';
     *     }
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#image">Online Documentation</a>
     */
    var image: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `disableDepthTestDistance` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `Number`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override disableDepthTestDistance expression with a string
     * style.disableDepthTestDistance = '1000.0';
     * style.disableDepthTestDistance.evaluate(feature); // returns a Number
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#disableDepthTestDistance">Online Documentation</a>
     */
    var disableDepthTestDistance: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `horizontalOrigin` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `HorizontalOrigin`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     horizontalOrigin : HorizontalOrigin.LEFT
     * });
     * style.horizontalOrigin.evaluate(feature); // returns a HorizontalOrigin
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override horizontalOrigin expression with a custom function
     * style.horizontalOrigin = {
     *     evaluate : function(feature) {
     *         return HorizontalOrigin.CENTER;
     *     }
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#horizontalOrigin">Online Documentation</a>
     */
    var horizontalOrigin: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `verticalOrigin` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `VerticalOrigin`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     verticalOrigin : VerticalOrigin.TOP
     * });
     * style.verticalOrigin.evaluate(feature); // returns a VerticalOrigin
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override verticalOrigin expression with a custom function
     * style.verticalOrigin = {
     *     evaluate : function(feature) {
     *         return VerticalOrigin.CENTER;
     *     }
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#verticalOrigin">Online Documentation</a>
     */
    var verticalOrigin: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `labelHorizontalOrigin` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `HorizontalOrigin`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     labelHorizontalOrigin : HorizontalOrigin.LEFT
     * });
     * style.labelHorizontalOrigin.evaluate(feature); // returns a HorizontalOrigin
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelHorizontalOrigin expression with a custom function
     * style.labelHorizontalOrigin = {
     *     evaluate : function(feature) {
     *         return HorizontalOrigin.CENTER;
     *     }
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#labelHorizontalOrigin">Online Documentation</a>
     */
    var labelHorizontalOrigin: StyleExpression

    /**
     * Gets or sets the [StyleExpression] object used to evaluate the style's `labelVerticalOrigin` property. Alternatively a string or object defining a number style can be used.
     * The getter will return the internal [Expression] or [ConditionsExpression], which may differ from the value provided to the setter.
     *
     * The expression must return a `VerticalOrigin`.
     *
     * This expression is only applicable to point features in a Vector tile.
     * ```
     * const style = new Cesium3DTileStyle({
     *     labelVerticalOrigin : VerticalOrigin.TOP
     * });
     * style.labelVerticalOrigin.evaluate(feature); // returns a VerticalOrigin
     * ```
     * ```
     * const style = new Cesium3DTileStyle();
     * // Override labelVerticalOrigin expression with a custom function
     * style.labelVerticalOrigin = {
     *     evaluate : function(feature) {
     *         return VerticalOrigin.CENTER;
     *     }
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#labelVerticalOrigin">Online Documentation</a>
     */
    var labelVerticalOrigin: StyleExpression

    /**
     * Gets or sets the object containing application-specific expression that can be explicitly
     * evaluated, e.g., for display in a UI.
     * ```
     * const style = new Cesium3DTileStyle({
     *     meta : {
     *         description : '"Building id ${id} has height ${Height}."'
     *     }
     * });
     * style.meta.description.evaluate(feature); // returns a String with the substituted variables
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileStyle.html#meta">Online Documentation</a>
     */
    var meta: StyleExpression
}
