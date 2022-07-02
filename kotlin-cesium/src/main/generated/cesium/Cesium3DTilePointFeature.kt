// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A point feature of a [Cesium3DTileset].
 *
 * Provides access to a feature's properties stored in the tile's batch table, as well
 * as the ability to show/hide a feature and change its point properties
 *
 * Modifications to a `Cesium3DTilePointFeature` object have the lifetime of the tile's
 * content.  If the tile's content is unloaded, e.g., due to it going out of view and needing
 * to free space in the cache for visible tiles, listen to the [Cesium3DTileset.tileUnload] event to save any
 * modifications. Also listen to the [Cesium3DTileset.tileVisible] event to reapply any modifications.
 *
 * Do not construct this directly.  Access it through [Cesium3DTileContent.getFeature]
 * or picking using [Scene.pick] and [Scene.pickPosition].
 * ```
 * // On mouse over, display all the properties for a feature in the console log.
 * handler.setInputAction(function(movement) {
 *     const feature = scene.pick(movement.endPosition);
 *     if (feature instanceof Cesium3DTilePointFeature) {
 *         const propertyIds = feature.getPropertyIds();
 *         const length = propertyIds.length;
 *         for (let i = 0; i < length; ++i) {
 *             const propertyId = propertyIds[i];
 *             console.log(`{propertyId}: ${feature.getProperty(propertyId)}`);
 *         }
 *     }
 * }, ScreenSpaceEventType.MOUSE_MOVE);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html">Online Documentation</a>
 */
external class Cesium3DTilePointFeature {
    /**
     * Gets or sets if the feature will be shown. This is set for all features
     * when a style's show is evaluated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the color of the point of this feature.
     *
     * Only applied when `image` is `undefined`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Gets or sets the point size of this feature.
     *
     * Only applied when `image` is `undefined`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#pointSize">Online Documentation</a>
     */
    var pointSize: Double

    /**
     * Gets or sets the point outline color of this feature.
     *
     * Only applied when `image` is `undefined`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#pointOutlineColor">Online Documentation</a>
     */
    var pointOutlineColor: Color

    /**
     * Gets or sets the point outline width in pixels of this feature.
     *
     * Only applied when `image` is `undefined`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#pointOutlineWidth">Online Documentation</a>
     */
    var pointOutlineWidth: Double

    /**
     * Gets or sets the label color of this feature.
     *
     * The color will be applied to the label if `labelText` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#labelColor">Online Documentation</a>
     */
    var labelColor: Color

    /**
     * Gets or sets the label outline color of this feature.
     *
     * The outline color will be applied to the label if `labelText` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#labelOutlineColor">Online Documentation</a>
     */
    var labelOutlineColor: Color

    /**
     * Gets or sets the outline width in pixels of this feature.
     *
     * The outline width will be applied to the point if `labelText` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#labelOutlineWidth">Online Documentation</a>
     */
    var labelOutlineWidth: Double

    /**
     * Gets or sets the font of this feature.
     *
     * Only applied when the `labelText` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#font">Online Documentation</a>
     */
    var font: String

    /**
     * Gets or sets the fill and outline style of this feature.
     *
     * Only applied when `labelText` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#labelStyle">Online Documentation</a>
     */
    var labelStyle: LabelStyle

    /**
     * Gets or sets the text for this feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#labelText">Online Documentation</a>
     */
    var labelText: String

    /**
     * Gets or sets the background color of the text for this feature.
     *
     * Only applied when `labelText` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#backgroundColor">Online Documentation</a>
     */
    var backgroundColor: Color

    /**
     * Gets or sets the background padding of the text for this feature.
     *
     * Only applied when `labelText` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#backgroundPadding">Online Documentation</a>
     */
    var backgroundPadding: Cartesian2

    /**
     * Gets or sets whether to display the background of the text for this feature.
     *
     * Only applied when `labelText` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#backgroundEnabled">Online Documentation</a>
     */
    var backgroundEnabled: Boolean

    /**
     * Gets or sets the near and far scaling properties for this feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#scaleByDistance">Online Documentation</a>
     */
    var scaleByDistance: NearFarScalar

    /**
     * Gets or sets the near and far translucency properties for this feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#translucencyByDistance">Online Documentation</a>
     */
    var translucencyByDistance: NearFarScalar

    /**
     * Gets or sets the condition specifying at what distance from the camera that this feature will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: DistanceDisplayCondition

    /**
     * Gets or sets the height offset in meters of this feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#heightOffset">Online Documentation</a>
     */
    var heightOffset: Double

    /**
     * Gets or sets whether the anchor line is displayed.
     *
     * Only applied when `heightOffset` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#anchorLineEnabled">Online Documentation</a>
     */
    var anchorLineEnabled: Boolean

    /**
     * Gets or sets the color for the anchor line.
     *
     * Only applied when `heightOffset` is defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#anchorLineColor">Online Documentation</a>
     */
    var anchorLineColor: Color

    /**
     * Gets or sets the image of this feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#image">Online Documentation</a>
     */
    var image: String

    /**
     * Gets or sets the distance where depth testing will be disabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#disableDepthTestDistance">Online Documentation</a>
     */
    var disableDepthTestDistance: Double

    /**
     * Gets or sets the horizontal origin of this point, which determines if the point is
     * to the left, center, or right of its anchor position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#horizontalOrigin">Online Documentation</a>
     */
    var horizontalOrigin: HorizontalOrigin

    /**
     * Gets or sets the vertical origin of this point, which determines if the point is
     * to the bottom, center, or top of its anchor position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#verticalOrigin">Online Documentation</a>
     */
    var verticalOrigin: VerticalOrigin

    /**
     * Gets or sets the horizontal origin of this point's text, which determines if the point's text is
     * to the left, center, or right of its anchor position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#labelHorizontalOrigin">Online Documentation</a>
     */
    var labelHorizontalOrigin: HorizontalOrigin

    /**
     * Get or sets the vertical origin of this point's text, which determines if the point's text is
     * to the bottom, center, top, or baseline of it's anchor point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#labelVerticalOrigin">Online Documentation</a>
     */
    var labelVerticalOrigin: VerticalOrigin

    /**
     * Gets the tileset containing the feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#tileset">Online Documentation</a>
     */
    val tileset: Cesium3DTileset

    /**
     * All objects returned by [Scene.pick] have a `primitive` property. This returns
     * the tileset containing the feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#primitive">Online Documentation</a>
     */
    val primitive: Cesium3DTileset

    /**
     * Returns whether the feature contains this property. This includes properties from this feature's
     * class and inherited classes when using a batch table hierarchy.
     * @param [name] The case-sensitive name of the property.
     * @return Whether the feature contains this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#hasProperty">Online Documentation</a>
     */
    fun hasProperty(name: String): Boolean

    /**
     * Returns an array of property names for the feature. This includes properties from this feature's
     * class and inherited classes when using a batch table hierarchy.
     * @param [results] An array into which to store the results.
     * @return The names of the feature's properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#getPropertyNames">Online Documentation</a>
     */
    fun getPropertyNames(results: Array<out String>? = definedExternally): Array<out String>

    /**
     * Returns an array of property IDs for the feature. This includes properties from this feature's
     * class and inherited classes when using a batch table hierarchy.
     * @param [results] An array into which to store the results.
     * @return The IDs of the feature's properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#getPropertyIds">Online Documentation</a>
     */
    fun getPropertyIds(results: Array<out String>? = definedExternally): Array<out String>

    /**
     * Returns a copy of the value of the feature's property with the given name. This includes properties from this feature's
     * class and inherited classes when using a batch table hierarchy.
     * ```
     * // Display all the properties for a feature in the console log.
     * const propertyIds = feature.getPropertyIds();
     * const length = propertyIds.length;
     * for (let i = 0; i < length; ++i) {
     *     const propertyId = propertyIds[i];
     *     console.log(`{propertyId} : ${feature.getProperty(propertyId)}`);
     * }
     * ```
     * @param [name] The case-sensitive name of the property.
     * @return The value of the property or `undefined` if the feature does not have this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#getProperty">Online Documentation</a>
     */
    fun getProperty(name: String): Any

    /**
     * Sets the value of the feature's property with the given name.
     *
     * If a property with the given name doesn't exist, it is created.
     * ```
     * const height = feature.getProperty('Height'); // e.g., the height of a building
     * ```
     * ```
     * const name = 'clicked';
     * if (feature.getProperty(name)) {
     *     console.log('already clicked');
     * } else {
     *     feature.setProperty(name, true);
     *     console.log('first click');
     * }
     * ```
     * @param [name] The case-sensitive name of the property.
     * @param [value] The value of the property that will be copied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilePointFeature.html#setProperty">Online Documentation</a>
     */
    fun setProperty(
        name: String,
        value: Any,
    )
}
