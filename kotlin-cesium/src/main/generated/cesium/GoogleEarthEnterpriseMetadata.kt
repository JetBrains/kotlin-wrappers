// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Provides metadata using the Google Earth Enterprise REST API. This is used by the GoogleEarthEnterpriseImageryProvider
 *  and GoogleEarthEnterpriseTerrainProvider to share metadata requests.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html">Online Documentation</a>
 *
 * @constructor
 * @param [resourceOrUrl] The url of the Google Earth Enterprise server hosting the imagery
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html">Online Documentation</a>
 */
external class GoogleEarthEnterpriseMetadata(resourceOrUrl: Resource) {
    constructor(resourceOrUrl: String)

    /**
     * True if imagery is available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#imageryPresent">Online Documentation</a>
     */
    var imageryPresent: Boolean

    /**
     * True if imagery is sent as a protocol buffer, false if sent as plain images. If undefined we will try both.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#protoImagery">Online Documentation</a>
     */
    var protoImagery: Boolean

    /**
     * True if terrain is available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#terrainPresent">Online Documentation</a>
     */
    var terrainPresent: Boolean

    /**
     * Exponent used to compute constant to calculate negative height values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#negativeAltitudeExponentBias">Online Documentation</a>
     */
    var negativeAltitudeExponentBias: Int

    /**
     * Threshold where any numbers smaller are actually negative values. They are multiplied by -2^negativeAltitudeExponentBias.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#negativeAltitudeThreshold">Online Documentation</a>
     */
    var negativeAltitudeThreshold: Double

    /**
     * Dictionary of provider id to copyright strings.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#providers">Online Documentation</a>
     */
    var providers: Any

    /**
     * Key used to decode packets
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#key">Online Documentation</a>
     */
    var key: kotlinx.js.ArrayBuffer

    /**
     * Gets the name of the Google Earth Enterprise server.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#url">Online Documentation</a>
     */
    val url: String

    /**
     * Gets the proxy used for metadata requests.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the resource used for metadata requests.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Gets a promise that resolves to true when the metadata is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<Boolean>

    companion object {
        /**
         * Converts a tiles (x, y, level) position into a quadkey used to request an image
         * from a Google Earth Enterprise server.
         * @param [x] The tile's x coordinate.
         * @param [y] The tile's y coordinate.
         * @param [level] The tile's zoom level.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#.tileXYToQuadKey">Online Documentation</a>
         */
        fun tileXYToQuadKey(
            x: Double,
            y: Double,
            level: Int,
        )

        /**
         * Converts a tile's quadkey used to request an image from a Google Earth Enterprise server into the
         * (x, y, level) position.
         * @param [quadkey] The tile's quad key
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GoogleEarthEnterpriseMetadata.html#.quadKeyToTileXY">Online Documentation</a>
         */
        fun quadKeyToTileXY(quadkey: String)
    }
}
