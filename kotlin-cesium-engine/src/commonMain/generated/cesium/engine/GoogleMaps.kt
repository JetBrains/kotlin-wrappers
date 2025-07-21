// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Default settings for accessing the Google Maps API.
 * <br/>
 * An API key is only required if you are directly using any Google Maps APIs, such as through [createGooglePhotorealistic3DTileset].
 * Follow instructions for managing API keys for the Google Maps Platform at [https://developers.google.com/maps/documentation/embed/get-api-key]
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
}
