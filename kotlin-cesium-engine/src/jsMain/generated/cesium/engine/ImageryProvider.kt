// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Provides imagery to be displayed on the surface of an ellipsoid.  This type describes an
 * interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html">Online Documentation</a>
 */
abstract external class ImageryProvider {
    /**
     * Gets the rectangle, in radians, of the imagery provided by the instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#rectangle">Online Documentation</a>
     */
    abstract val rectangle: Rectangle

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#tileWidth">Online Documentation</a>
     */
    abstract val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#tileHeight">Online Documentation</a>
     */
    abstract val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    abstract val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.  Generally,
     * a minimum level should only be used when the rectangle of the imagery is small
     * enough that the number of tiles at the minimum level is small.  An imagery
     * provider with more than a few tiles at the minimum level will lead to
     * rendering problems.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    abstract val minimumLevel: Int

    /**
     * Gets the tiling scheme used by the provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    abstract val tilingScheme: TilingScheme

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    abstract val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#errorEvent">Online Documentation</a>
     */
    abstract val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#credit">Online Documentation</a>
     */
    abstract val credit: Credit

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#proxy">Online Documentation</a>
     */
    abstract val proxy: Proxy

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    abstract val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#getTileCredits">Online Documentation</a>
     */
    abstract fun getTileCredits(
        x: Double,
        y: Double,
        level: Int,
    ): ReadonlyArray<Credit>

    /**
     * Requests the image for a given tile.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return Returns a promise for the image that will resolve when the image is available, or
     *   undefined if there are too many active requests to the server, and the request should be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#requestImage">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): ImageryTypes?

    @JsName("requestImage")
    abstract fun requestImageAsync(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): Promise<ImageryTypes>?

    /**
     * Asynchronously determines what features, if any, are located at a given longitude and latitude within
     * a tile.
     * This function is optional, so it may not exist on all ImageryProviders.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return A promise for the picked features that will resolve when the asynchronous
     *   picking completes.  The resolved value is an array of [ImageryLayerFeatureInfo]
     *   instances.  The array may be empty if no features are found at the given location.
     *   It may also be undefined if picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    @JsAsync(optional = true)
    suspend fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): ReadonlyArray<ImageryLayerFeatureInfo>?

    @JsName("pickFeatures")
    abstract fun pickFeaturesAsync(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Promise<ReadonlyArray<ImageryLayerFeatureInfo>>?

    companion object {
        /**
         * Loads an image from a given URL.  If the server referenced by the URL already has
         * too many requests pending, this function will instead return undefined, indicating
         * that the request should be retried later.
         * @param [imageryProvider] The imagery provider for the URL.
         * @param [url] The URL of the image.
         * @return A promise for the image that will resolve when the image is available, or
         *   undefined if there are too many active requests to the server, and the request should be retried later.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryProvider.html#.loadImage">Online Documentation</a>
         */
        @JsAsync(optional = true)
        suspend fun loadImage(
            imageryProvider: ImageryProvider,
            url: Resource,
        ): Any /* ImageryTypes | CompressedTextureBuffer */?

        @JsName("loadImage")
        fun loadImageAsync(
            imageryProvider: ImageryProvider,
            url: Resource,
        ): Promise<Any /* ImageryTypes | CompressedTextureBuffer */>?

        @JsAsync(optional = true)
        suspend fun loadImage(
            imageryProvider: ImageryProvider,
            url: String,
        ): Any /* ImageryTypes | CompressedTextureBuffer */?

        @JsName("loadImage")
        fun loadImageAsync(
            imageryProvider: ImageryProvider,
            url: String,
        ): Promise<Any /* ImageryTypes | CompressedTextureBuffer */>?
    }
}
