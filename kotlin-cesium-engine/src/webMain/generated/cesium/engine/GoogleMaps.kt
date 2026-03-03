// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Default settings for accessing the Google Maps API.
 * <br/>
 * An API key is only required if you are directly using any Google Maps APIs, such as through [createGooglePhotorealistic3DTileset].
 * Follow instructions for managing API keys for the Google Maps Platform at [https://developers.google.com/maps/documentation/embed/get-api-key].
 * <br/>
 * You can enable multiple Google Maps Platform APIs on a single API key.
 * However, a separate [GoogleMaps.defaultStreetViewStaticApiKey]
 * is available if you prefer to use a dedicated key for the Street View Static API.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleMaps.html">Online Documentation</a>
 */
external object GoogleMaps {
    /**
     * Gets or sets the default Google Maps API key.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleMaps.html#.defaultApiKey">Online Documentation</a>
     */
    var defaultApiKey: String?

    /**
     * Gets or sets the default Google Map Tiles API endpoint.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleMaps.html#.mapTilesApiEndpoint">Online Documentation</a>
     */
    var mapTilesApiEndpoint: Resource

    /**
     * Gets or sets the default Google Maps Street View Static API key.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleMaps.html#.defaultStreetViewStaticApiKey">Online Documentation</a>
     */
    var defaultStreetViewStaticApiKey: String?

    /**
     * Gets or sets the default Google Street View Static API endpoint.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleMaps.html#.streetViewStaticApiEndpoint">Online Documentation</a>
     */
    var streetViewStaticApiEndpoint: Resource
}
