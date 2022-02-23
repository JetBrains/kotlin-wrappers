// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Describes a rasterized feature, such as a point, polygon, polyline, etc., in an imagery layer.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerFeatureInfo.html">Online Documentation</a>
 */
external class ImageryLayerFeatureInfo {
    /**
     * Gets or sets the name of the feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerFeatureInfo.html#name">Online Documentation</a>
     */
    var name: String?

    /**
     * Gets or sets an HTML description of the feature.  The HTML is not trusted and should
     * be sanitized before display to the user.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerFeatureInfo.html#description">Online Documentation</a>
     */
    var description: String?

    /**
     * Gets or sets the position of the feature, or undefined if the position is not known.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerFeatureInfo.html#position">Online Documentation</a>
     */
    var position: Cartographic?

    /**
     * Gets or sets the raw data describing the feature.  The raw data may be in any
     * number of formats, such as GeoJSON, KML, etc.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerFeatureInfo.html#data">Online Documentation</a>
     */
    var data: Any?

    /**
     * Gets or sets the image layer of the feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerFeatureInfo.html#imageryLayer">Online Documentation</a>
     */
    var imageryLayer: Any?

    /**
     * Configures the name of this feature by selecting an appropriate property.  The name will be obtained from
     * one of the following sources, in this order: 1) the property with the name 'name', 2) the property with the name 'title',
     * 3) the first property containing the word 'name', 4) the first property containing the word 'title'.  If
     * the name cannot be obtained from any of these sources, the existing name will be left unchanged.
     * @param [properties] An object literal containing the properties of the feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerFeatureInfo.html#configureNameFromProperties">Online Documentation</a>
     */
    fun configureNameFromProperties(properties: Any)

    /**
     * Configures the description of this feature by creating an HTML table of properties and their values.
     * @param [properties] An object literal containing the properties of the feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerFeatureInfo.html#configureDescriptionFromProperties">Online Documentation</a>
     */
    fun configureDescriptionFromProperties(properties: Any)
}
