// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Default options for accessing the ArcGIS image tile service.
 *
 * An ArcGIS access token is required to access ArcGIS image tile layers.
 * A default token is provided for evaluation purposes only.
 * To obtain an access token, go to [https://developers.arcgis.com] and create a free account.
 * More info can be found in the [ ArcGIS developer guide](https://developers.arcgis.com/documentation/mapping-apis-and-services/security/ ).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapService.html">Online Documentation</a>
 */
external object ArcGisMapService {
    /**
     * Gets or sets the default ArcGIS access token.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapService.html#.defaultAccessToken">Online Documentation</a>
     */
    var defaultAccessToken: String

    /**
     * Gets or sets the URL of the ArcGIS World Imagery tile service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapService.html#.defaultWorldImageryServer">Online Documentation</a>
     */
    var defaultWorldImageryServer: Resource

    /**
     * Gets or sets the URL of the ArcGIS World Hillshade tile service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapService.html#.defaultWorldHillshadeServer">Online Documentation</a>
     */
    var defaultWorldHillshadeServer: Resource

    /**
     * Gets or sets the URL of the ArcGIS World Oceans tile service.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ArcGisMapService.html#.defaultWorldOceanServer">Online Documentation</a>
     */
    var defaultWorldOceanServer: dynamic
}
